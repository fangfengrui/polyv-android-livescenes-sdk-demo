

## [v1.8.1] - 2022-01-07

### 观看端（云课堂）场景
新增：
1. 【播放器】无延迟支持播放器LOGO

优化：
1. 【PPT】修复断网重连后，偶现PPT加载失败问题

### 观看端（直播带货）场景
新增：
1. 【无延迟】支持观看无延迟直播，无延迟频道支持观众切换普通延迟观看 [Scenes、Common、SDK]
2. 【直播】支持防录屏跑马灯 [Scenes]

优化：
1. 【播放器】开播端快速上下课，点击重新开播按钮无法恢复

### 手机开播（三分屏）场景
优化：
1. 【连麦】修复偶现黑屏的问题 [Scenes、SDK]
2. 【开播】恢复直播时增加网络检测提示 [Scenes]

### 手机开播（纯视频）场景
新增：
1. 【连麦】支持嘉宾登陆、多人连麦 [Scenes、Common、SDK]

优化：
1. 【开播】恢复直播时增加网络检测提示 [Scenes]
2. 【开播】修复手机横屏开播后连麦后，讲师摄像头自动左右镜像问题 [Common、SDK]


### SDK
优化：
1. 【连麦】修复个别机型切换前后摄像头崩溃问题 [SDK]
2. 【接口】优化接口稳定性和安全性 [SDK]

## [v1.8.0] - 2021-12-16

### 观看端（云课堂）场景
新增：
1. 【无延迟】无延迟频道支持观众切换普通延迟观看 [Scenes、Common、SDK]
2. 【互动】新增问答功能 [Scenes、SDK]
3. 【PPT】PPT支持观众往回翻页 [Scenes、SDK]

优化：
1. 【无延迟】增强无延迟观看稳定性 [Scenes、Common、SDK]
2. 【日志】优化短暂上下课情况下的日志记录 [Common、SDK]
3. 【日志】修复互动功能未传进param4、param5的问题 [Common、SDK]

### 观看端（直播带货）场景
优化：
1. 【日志】优化短暂上下课情况下的日志记录 [Common、SDK]

### 手机开播（三分屏）场景
新增：
1. 【连麦】支持sip嘉宾连麦 [SDK]

### 手机开播（纯视频）场景
新增：
1. 【连麦】支持sip嘉宾连麦 [SDK]

优化：
1. 【开播】修复横屏开播异常退出后，恢复直播会变成竖屏开播的问题 [Scenes]

### 互动学堂场景
优化：
1. 【UX】修复一段时间不操作后自动息屏的问题 [Scenes]
2. 【UI】优化学生端接收到的广播弹窗 [Scenes]

### SDK
优化：
1. 【接口】增强接口请求的安全校验 [Common、SDK]

## [v1.7.2] - 2021-11-08

### 【观看端（云课堂）场景】

优化：

1. 【登录】强化唯一登录判断，避免重复登录 [Scenes、Common]
2. 【连麦】修复无延迟连麦结束后未关闭摄像头 [SDK]
3. 【PPT】PPT接口调用优化 [SDK]
4. 【连麦】优化连麦列表请求逻辑 [SDK、Common]
5. 【网络】提升观看端在手机开播断网重连之后的稳定性 [Common、Scenes]
6. 【聊天室】修复历史聊天记录概率缺失 [SDK、Common]

### 【观看端（直播带货）场景】

优化：

1. 【网络】提升观看端在手机开播断网重连之后的稳定性 [Common、Scenes]
2. 【跑马灯】移除默认设置显示的跑马灯 [Scenes]

### 【互动学堂场景】

新增：

​    1.【分组】支持分组功能 [SDK、Scenes]

优化：

​    1.【画笔】收回画笔权限时保持摄像头画面 [SDK]

​    2.【成员列表】修复成员列表举手gif点击可以打开成员列表 [Scenes]

### 【手机开播（纯视频）场景】

优化：

1. 【开播】修复竖屏开播在恢复直播后自动切换为横屏模式 [Scenes]

------

### 【SDK】

优化：

​	1.【日志】优化日志收集开关可控制，debug模式打开本地日志，release模式关闭本地日志 [SDK]

------

### 【升级方式】

1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。

```
// 项目级别 build.gradle
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```

2. 更新SDK版本。

```
api 'net.polyv.android:polyvSDKLiveScenes:1.7.2'
```

3. 根据 [git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/487183b7447a32acc310d0478a53e57d19a893cf) 进行demo的代码升级。
  
## [v1.7.1] - 2021-11-01

### 观看端（云课堂）场景
优化：
1. 【UI】优化无延迟频道第一画面切换逻辑 [Scenes]
2. 【跑马灯】移除默认设置显示的跑马灯 [Scenes]

### 观看端（直播带货）场景
优化：
1. 【UI】优化部分视图的显示逻辑 [Scenes]
2. 【跑马灯】移除默认设置显示的跑马灯 [Scenes]

### 手机开播（三分屏）场景
新增：
1. 【开播】支持在异常退出后继续恢复直播 [Scenes、Common、SDK]

### 手机开播（纯视频）场景
新增：
1. 【开播】支持横屏开播 [Scenes、Common、SDK]
2. 【开播】支持在异常退出后继续恢复直播 [Scenes、Common、SDK]

------------------------------------

### 升级方式

1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
```
// 项目级别 build.gradle
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. 更新SDK版本。
```
api 'net.polyv.android:polyvSDKLiveScenes:1.7.1'
```
3. 根据 [git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/56f00f58e0f516f23a580af1a3d30a22bf95e865) 进行demo的代码升级。
  
## [v1.7.0] - 2021-10-21

### 互动学堂场景
新增：
1. 新增互动学堂场景[Scenes、Common、SDK]

互动学堂是一款具备强互动性的在线直播App，支持老师/学生两个角色使用。学生可随时上麦与老师交流，互动白板、协同画笔工具、PPT文档、聊天室互动等，多样的形式展示课堂内容。

### 观看端场景、开播端场景
优化：
1. 部分代码逻辑进行优化[Scenes、Common、SDK]
------------------------------------

### 升级方式

1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
```
// 项目级别 build.gradle
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. 更新SDK版本。
```
api 'net.polyv.android:polyvSDKLiveScenes:1.7.0'
```
3. 根据 [git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/6fb7690e868f00ed42663ac595881a58a9b6d999) 进行demo的代码升级。
  
## [v1.6.3] - 2021-10-14

### 观看端场景（云课堂、直播带货）
新增：
1. 【观看】支持仅音频观看模式 [Scenes、Common、SDK]

优化：
1. 【跑马灯】优化跑马灯代码逻辑 [Scenes、Common、SDK]
2. 【观看】优化踢出事件响应逻辑 [Scenes]
3. 【日志】优化观看日志统计逻辑 [SDK]

### 手机开播（三分屏）场景
新增：
1. 【开播】支持音频开播模式 [Scenes、Common、SDK]

优化：
1. 【开播】优化踢出事件响应逻辑 [Scenes]

### 手机开播（纯视频）场景
优化：
1. 【开播】优化踢出事件响应逻辑 [Scenes]

------------------------------------

### 升级方式

1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
```
// 项目级别 build.gradle
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. 更新SDK版本。
```
api 'net.polyv.android:polyvSDKLiveScenes:1.6.3'
```
3. 根据 [git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/39e2fabcae02e5cb5732eba8336d639cfaaa0517) 进行demo的代码升级。
  
## [v1.6.0-bugfix1] - 2021-09-17

### 手机开播场景

修复：
1. 【开播】修复非无延迟场景下，嘉宾退出登录导致观看端短暂断开问题 [SDK]

------------------------------------

### 升级方式

1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
```
// 项目级别 build.gradle
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. **本次更新只需要更新SDK版本**
```
api 'net.polyv.android:polyvSDKLiveScenes:1.6.0-bugfix1'
```


## [v1.6.0] - 2021-09-08

### 手机开播（三分屏）场景
新增：
1. 【开播】手机开播支持嘉宾登录 [Scenes、Common、SDK]

修复：
1. 【文档】修复偶现上传文档选择文件后崩溃的问题 [Common]

### 手机开播（纯视频）场景

新增：
1. 【开播】手机开播支持嘉宾登录 [Scenes、Common、SDK]

修复：
1. 【连麦】修复讲师端操作重复给观众上下麦，讲师端黑屏的问题 [Scenes]

------------------------------------

### 升级方式

1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
```
// 项目级别 build.gradle
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. 更新SDK版本。
```
api 'net.polyv.android:polyvSDKLiveScenes:1.6.0'
```
3. 根据 [git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/34e1096705bfa0a4f45619a5ec94a33cc820c128) 进行demo的代码升级。
  
## [v1.5.3] - 2021-07-28


【云课堂场景】
新增：
1.【聊天室】emoji 表情升级，新增个性表情 [Scenes、Common]
2.【RTC】RTC观看增加网络状态 [Scenes、Common]
3.【RTC】直播观看响应全体静音 [Common、SDK]

优化：
1.【其他】Android-gif-Drawable 库升级到1.2.23，相关封装代码迁移到Common层 [Scenes、Common、SDK]

修复：
1.【RTC】修复多场景观看连麦空指针异常 [Common]
2.【聊天室】对齐获取聊天室信息接口 [SDK]

---------------------------

【直播带货场景】
优化：
1.【其他】Android-gif-Drawable 库升级到1.2.23，相关封装代码迁移到Common层 [Scenes、Common、SDK]

修复：
1.【聊天室】对齐获取聊天室信息接口 [SDK]

---------------------------

【手机开播（纯视频）场景】
新增：
1.【聊天室】emoji 表情升级，新增个性表情 [Scenes、Common]

优化：
1.【其他】Android-gif-Drawable 库升级到1.2.23，相关封装代码迁移到Common层 [Scenes、Common、SDK]
2.【聊天室】优化违规图片交互，更新占位图显示 [Scenes、Common]

修复：
1.【RTC】修复多场景观看连麦空指针异常 [Common]
2.【聊天室】对齐获取聊天室信息接口 [SDK]

---------------------------

【手机开播（三分屏）场景】
新增：
1.【聊天室】emoji 表情升级，新增个性表情 [Scenes、Common]
2.【文档】文档列表添加刷新功能 [Scenes]

优化：
1.【其他】Android-gif-Drawable 库升级到1.2.23，相关封装代码迁移到Common层 [Scenes、Common、SDK]
2.【聊天室】优化违规图片交互，更新占位图显示 [Scenes、Common]

修复：
1.【RTC】修复多场景观看连麦空指针异常 [Common]
2.【聊天室】对齐获取聊天室信息接口 [SDK]

------------------------------------

### 升级方式：
1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
// 项目级别build.gradle
```
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. 更新SDK版本。
api 'net.polyv.android:polyvSDKLiveScenes:1.5.3'
3. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/defbabe26627d70a2e703680b66eb29d04361480)进行demo的代码升级。
  
## [v1.5.2] - 2021-07-13

### 优化与修复
【Common】纯视频开播打赏字体在部分机型上显示异常。
【SDK】旁路推流兼容网页观看端mute视频发黑帧的情况。
【SDK】纯视频开播底层引擎兼容全频道发起开播（支持无延迟开播）。

### 升级方式：
1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
// 项目级别build.gradle
```
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. 更新SDK版本。
api 'net.polyv.android:polyvSDKLiveScenes:1.5.2'
3. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/defbabe26627d70a2e703680b66eb29d04361480)进行demo的代码升级。
  
## [v1.5.1.1] - 2021-07-02

#### 优化与修复  
1. 修复弹幕在高帧率手机中出现多次重复出现问题。[Scene、Common]  
2. 优化动态权限为使用时申请，无延迟直播间由于特性原因直播开始后自动申请权限。[Scene]  
3. 优化回放播放视频，断点续播功能。[SDK]  
4. 修复由于httpdns导致视频加载失败的问题。[SDK]


### 升级方式：
1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
```groovy
// 项目级别build.gradle
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. 更新SDK版本。
``` groovy
api 'net.polyv.android:polyvSDKLiveScenes:1.5.1.1'
```
3. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/compare/v1.5.0...v1.5.1.1)进行demo的代码升级。


​    
## [v1.5.0] - 2021-06-22

### 【手机开播场景】
#### 新增：  
1. 支持纯视频场景。[Scene、Common、SDK]
#### 优化与修复  
1. 修复文件名带中文的文档不能上传的问题。[Scene]
2. 修复部分频道停止推流后仍在直播中的问题。[SDK]
3. 修复部分已知问题。[Scene、Common、SDK]

### 【云课堂场景】
#### 优化与修复  
1. 修复暖场图片未能铺满整个播放器的问题。[Scene、Common]  
2. 支持横屏时同步隐藏弹幕和聊天室。[Scene]  
3. 修复可能引起的崩溃问题。[SDK]  


### 升级方式：
1. 自1.5.0起SDK迁移至阿里云效仓库，需要配置阿里云效仓库源地址。
```groovy
// 项目级别build.gradle
allprojects {
    repositories {
        // 保利威阿里云效
        maven {
            credentials {
                username '609cc5623a10edbf36da9615'
                password 'EbkbzTNHRJ=P'
            }
            url 'https://packages.aliyun.com/maven/repository/2102846-release-8EVsoM/'
        }
    }
}
```
2. 更新SDK版本。
``` groovy
api 'net.polyv.android:polyvSDKLiveScenes:1.5.0'
```
3. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/compare/v1.4.2...v1.5.0)进行demo的代码升级。


​    
## [v1.4.2] - 2021-05-14

### 【手机开播场景】
#### 新增：
1. 支持PRTC。[SDK]

### 【云课堂场景】
#### 优化与修复
1. 修复ConstraintLayout较高版本会出现直播黑屏的兼容问题。[Demo]
2. 修复部分机型输入法导致的兼容问题。[Demo]


### 升级方式：
1. 更新SDK版本。
``` groovy
api 'net.polyv.android:polyvSDKLiveScenes:1.4.2'
```
2. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/60d922605f310737c209943b3fb2c4b39ee691c5)进行demo的代码升级。


​    
## [v1.4.1] - 2021-05-05

由于[ bintray 停服 ](https://jfrog.com/blog/into-the-sunset-bintray-jcenter-gocenter-and-chartcenter/) 导致历史版本依赖将不可使用。此版本起更新sdk迁移至 MavenCentral，旧版本用户请升级至v1.4.1+。建议同步升级Demo层。

### 升级方式：
1. 更新SDK版本。需增加MavenCentral源
``` groovy
//打开项目级别根目录的 build.gradle，补充MavenCentral源地址
allprojects {
    repositories {
        //...省略
        //mavenCentral 源
        mavenCentral()
        //阿里云效关于central的镜像
        maven{
            url 'https://maven.aliyun.com/repository/central'
        }
    }
}

//打开 polyvLiveCommonModul/build.gradle 文件，修改对应依赖
dependencies {
    //...
    //旧版本废弃
    //api 'com.easefun.polyv:polyvSDKLiveScenes:1.4.0'
    //注意1.4.1起依赖的groupId已经变更，请整个依赖复制粘贴修改，勿只修改版本号
    api ('net.polyv.android:polyvSDKLiveScenes:1.4.1')
 
}
```
2. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/bd3a85f36743ab25a462f65a5e76ebf3b2963c20)进行demo的代码升级。


​    
## [v1.4.0] - 2021-04-22

### 【手机开播场景】
#### 新增：
1. 手机开播场景。[Scene、Common、SDK]

### 【云课堂场景】
#### 优化与修复:
1. 【播放器】优化RTC统计逻辑。[SDK]
2. 修复部分崩溃问题，修复部分UI表现异常问题。[Scene]

### 升级方式：
1. 更新SDK版本。
``` groovy
api 'com.easefun.polyv:polyvSDKLiveScenes:1.4.0'
```
2. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/bd3a85f36743ab25a462f65a5e76ebf3b2963c20)进行demo的代码升级。


​    
## [v1.3.0] - 2021-04-20

### 【云课堂场景】
#### 新增：
1. 完善PRTC能力。[Scene、Common、SDK]

#### 优化与修复:
1. 入口默认改为三参，可直接设置学员头像跳转。[Scene]
2. 【播放器】优化RTC统计逻辑。[SDK]

### 【SDK】
1. 升级阿里Httpdns版本至2.0.1。[SDK]
2. 修复SDK已知问题。[SDK]

### 注意
1.**自多场景v1.3.0开始，正式支持Androidx。切换到[Androidx](https://github.com/polyv/polyv-android-livescenes-sdk-demo/tree/androidx)分支，即可集成。**

### 升级方式：
1. 更新SDK版本。
``` groovy
api 'com.easefun.polyv:polyvSDKLiveScenes:1.3.0'
```
2. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/e72ea0396098eb19638cf21029a633ff3d9757aa)进行demo的代码升级。


​    
## [v1.2.3] - 2021-04-20

### 【云课堂场景】
优化：
  1.  【播放器】优化RTC统计逻辑。[SDK]


#### 升级必要性说明
  1.  1.2.3版本，针对RTC场景（如 连麦场景、无延迟观看场景）进行了统计逻辑优化。主要提高统计的及时性、精确性。
  2.  【强烈推荐】各版本的SDK用户，进行升级更新
  3.  在升级成本上，1.2.0+的SDK用户升级至1.2.3版本，工作量成本较小，具体可见以下的“升级方法”。

#### 升级方法
  1.  从 1.2.2 升级至 1.2.3，【无需】更新 Demo 层源码 
  2.  从 其他版本（1.2.0、1.2.1）升级至 1.2.3，【建议】更新 Demo 层源码 （推荐更新，但可选择不更新；评估请见各版本升级内容）
  3.  从 其他更低版本（低于 1.2.0）升级至 1.2.4，【必需】更新 Demo 层源码 
  4.  build.gradle 文件中语句，可更新为：`api 'com.easefun.polyv:polyvSDKLiveScenes:1.2.3'`
    
## [v1.2.2] - 2021-03-18

### 【云课堂场景】
#### 优化：
1. 优化了无延迟直播时视频画面被剪裁的问题，改为等比缩放。[Demo][SDK]
2. 优化了部分机型在无延迟观看时无法调节音量的问题。[Demo]
#### 修复bug:
1. 修复部分andorid 5.0 手机上的[异常](https://issuetracker.google.com/issues/37048911)。[SDK]
2. 修复无延迟观看时，退出直播间，前台服务没有关闭的bug。[Demo]
3. 修复android 11手机出现的Toast.getView引起的空指针异常。[SDK]
4. 修复偶现的聊天室空指针，加了空指针保护。[Demo]

### 升级方式：
1. 更新SDK版本。
``` groovy
api 'com.easefun.polyv:polyvSDKLiveScenes:1.2.2'
```
2. 根据[git commit diff](https://github.com/polyv/polyv-android-livescenes-sdk-demo/commit/e72ea0396098eb19638cf21029a633ff3d9757aa)进行demo的代码升级。


​    
## [v1.2.1] - 2021-03-02

【云课堂场景】
优化：
【直播】修复无延迟纯视频场景，视频全屏时没有居中的问题[Demo]

升级方式
1.从 1.2.0 升级至 1.2.1，【必需】更新 Demo 层源码


​    
## [v1.2.0] - 2021-01-29

### 【云课堂场景】
新增：
1. 【直播】支持无延迟观看（观众只订阅讲师）[Demo、SDK]

优化：
1.【UI】优化UI细节调整 [Demo]
2.【直播】修复片头广告播放结束后，卡顿在倒计时为0问题 [SDK]

### 【直播带货场景】
新增：
1.【互动】支持互动应用 [Demo]

优化：
1.【UI】优化UI细节调整 [Demo]
2.【直播】修复sdk已知问题，优化内存使用[Demo、SDK]

### 【SDK】
优化：
1. 修复 UA 的 pid 与日志的 pid 不一致的问题[SDK]


### 升级方式
1.从 1.1.0 升级至 1.2.0，【必需】更新 Demo 层源码
    
## [v1.1.0] - 2021-01-07

### 【云课堂场景】
   新增：
   1.【频道】支持观看 “普通直播” 频道 [Demo]
   2.【播放器】支持Logo功能 [Demo]
   3.【连麦】完善连麦统计参数 [SDK]

   优化：
   1.【直播】HttpDNS用法优化[SDK]
   2.【直播】首次进入页面响应主副屏状态[Demo]

### 【直播带货场景】
   新增：
   1.【播放器】支持小窗播放 [Demo]
   2.【播放器】支持双击暂停/单击播放、片头广告、播放器Logo [Demo]

### 升级方式
   1.从 1.0.1 升级至 1.1.0，【必需】更新 Demo 层源码

## v1.0.1 - 2020-12-07

发布 1.0.1 版本

