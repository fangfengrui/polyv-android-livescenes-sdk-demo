package com.easefun.polyv.livecommon.module.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.easefun.polyv.livecommon.ui.widget.magicindicator.buildins.PLVUIUtil;

/**
 * @author suhongtao
 */
public class PLVToast {

    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private static Toast lastShowToast = null;

    private ToastParam param;

    private Toast toast;

    private PLVToast(ToastParam param) {
        this.param = param;
        HANDLER.post(new Runnable() {
            @Override
            public void run() {
                initToast();
            }
        });
    }

    private void initToast() {
        toast = new Toast(param.context);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(param.showDuration);

        final TextView textView = new AppCompatTextView(param.context);
        textView.setMinWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        textView.setMaxWidth(PLVUIUtil.dip2px(param.context, 158));
        textView.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(param.text);
        textView.setTextColor(param.textColor);
        int horizontalPadding = PLVUIUtil.dip2px(param.context, 16);
        int verticalPadding = PLVUIUtil.dip2px(param.context, 10);

        if (param.drawableResId != 0) {
            textView.setMaxWidth(PLVUIUtil.dip2px(param.context, 196));
            textView.setPadding(PLVUIUtil.dip2px(param.context, 8), 0, 0, 0);

            ImageView imageView = new AppCompatImageView(param.context);
            imageView.setImageResource(param.drawableResId);

            final LinearLayout linearLayout = new LinearLayout(param.context);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            linearLayout.setGravity(Gravity.CENTER);
            linearLayout.setPadding(horizontalPadding, verticalPadding, horizontalPadding, verticalPadding);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            linearLayout.post(new Runnable() {
                @Override
                public void run() {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(param.backgroundColor);
                    if (textView.getLayout() == null || textView.getLayout().getLineCount() > 1) {
                        gradientDrawable.setCornerRadius(PLVUIUtil.dip2px(param.context, 8));
                    } else {
                        gradientDrawable.setCornerRadius(PLVUIUtil.dip2px(param.context, 20));
                    }
                    linearLayout.setBackground(gradientDrawable);
                }
            });

            toast.setView(linearLayout);
            return;
        }

        textView.setPadding(horizontalPadding, verticalPadding, horizontalPadding, verticalPadding);
        textView.post(new Runnable() {
            @Override
            public void run() {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(param.backgroundColor);
                if (textView.getLayout() == null || textView.getLayout().getLineCount() > 1) {
                    gradientDrawable.setCornerRadius(PLVUIUtil.dip2px(param.context, 8));
                } else {
                    gradientDrawable.setCornerRadius(PLVUIUtil.dip2px(param.context, 20));
                }
                textView.setBackground(gradientDrawable);
            }
        });

        toast.setView(textView);
    }

    public void show() {
        HANDLER.post(new Runnable() {
            @Override
            public void run() {
                if (lastShowToast != null) {
                    lastShowToast.cancel();
                }
                toast.show();
                lastShowToast = toast;
            }
        });
    }

    public void cancel() {
        HANDLER.post(new Runnable() {
            @Override
            public void run() {
                if (toast != null) {
                    toast.cancel();
                    toast = null;
                }
            }
        });
    }

    private static class ToastParam {
        private Context context;
        private CharSequence text;
        @ColorInt
        private int textColor;
        @ColorInt
        private int backgroundColor;
        @DrawableRes
        private int drawableResId;
        private int showDuration;
    }

    public static class Builder {

        private static final int DEFAULT_TEXT_COLOR = Color.parseColor("#F0F1F5");
        private static final int DEFAULT_BACKGROUND_COLOR = Color.parseColor("#991B202D");
        private static final int DEFAULT_SHOW_DURATION = Toast.LENGTH_SHORT;

        private ToastParam param;

        private Builder() {
            param = new ToastParam();
            param.textColor = DEFAULT_TEXT_COLOR;
            param.backgroundColor = DEFAULT_BACKGROUND_COLOR;
            param.showDuration = DEFAULT_SHOW_DURATION;
        }

        public static Builder context(@NonNull Context context) {
            Builder toastBuilder = new Builder();
            toastBuilder.param.context = context.getApplicationContext();
            return toastBuilder;
        }

        public Builder setText(CharSequence text) {
            if (text == null) {
                param.text = "";
            } else {
                param.text = text;
            }
            return this;
        }

        public Builder setText(@StringRes int stringResId) {
            param.text = param.context.getString(stringResId);
            return this;
        }

        public Builder setTextColor(@ColorInt int textColor) {
            param.textColor = textColor;
            return this;
        }

        public Builder setBackgroundColor(@ColorInt int backgroundColor) {
            param.backgroundColor = backgroundColor;
            return this;
        }

        public Builder setDrawable(@DrawableRes int drawableResId) {
            param.drawableResId = drawableResId;
            return this;
        }

        public Builder duration(int toastDuration) {
            if (toastDuration != Toast.LENGTH_SHORT
                    && toastDuration != Toast.LENGTH_LONG) {
                toastDuration = Toast.LENGTH_SHORT;
            }
            param.showDuration = toastDuration;
            return this;
        }

        public PLVToast build() {
            return new PLVToast(param);
        }
    }
}
