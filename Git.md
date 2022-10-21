# Git

| 代码回溯 | 版本切换 | 多人协作 | 远程备份 |
| :------: | :------: | :------: | :------: |

# Git概述

## Git简介

* Git是一个分布式版本控制工具，通常用来对软件开发过程中的源代码文件进行管理。通过Git仓库来存储和管理这些文件。
* Git仓库分为两种：
  * 本地仓库：开发人员自己电脑上的Git。
  * 仓库远程仓库：远程服务器上的Git仓库。
* `commit`：提交，将本地文件和版本信息保存到本地仓库。
* `push`：推送，将本地仓库文件和版本信息上传到远程仓库。
* `pull`：拉取，将远程仓库文件和版本信息下载到本地仓库。
* ![image-20221015161344555](http://qny.expressisland.cn/schoolOpens/image-20221015161344555.png)

## Git下载与安装

* ![image-20221015161438029](http://qny.expressisland.cn/schoolOpens/image-20221015161438029.png)
* `Git GUI Here`：打开Git图形界面
* `Git Bash Here`：打开Git命令行

# Git 代码托管服务

## 常用的Git代码托管服务

* ![image-20221015161618293](http://qny.expressisland.cn/schoolOpens/image-20221015161618293.png)

# Git常用命令 △ 

## Git 全局设置获取Git仓库

* ![image-20221015162438620](http://qny.expressisland.cn/schoolOpens/image-20221015162438620.png)
* 要使用Git对我们的代码进行版本控制，首先需要获得Git仓库。
* 获取Git仓库通常有两种方式：
  * 在本地初始化一个Git仓库（不常用）
  * 从远程仓库克隆（常用）

### 获取Git仓库-在本地初始化Git仓库
* 执行步骤如下：
  * 在任意目录下创建一个空目录（例如repo1）作为我们的本地Git仓库。
  * 进入这个目录中，点击右键打开Git bash窗口。
  * 执行命令`git init`。
  * ![image-20221015162900356](http://qny.expressisland.cn/schoolOpens/image-20221015162900356.png)

### 获取Git仓库-从远程仓库克隆
* 可以通过Git提供的命令从远程仓库进行克隆，将远程仓库克隆到本地。
* 命令形式：`git clone【远程Git仓库地址】`
* ![image-20221015163450624](http://qny.expressisland.cn/schoolOpens/image-20221015163450624.png)

## 工作区、暂存区、版本库概念

* **版本库**：前面看到的`.git`隐藏文件夹就是版本库，版本库中存储了很多配置信息、日志信息和文件版本信息等。
* **工作区**：包含`.git`文件夹的目录就是工作区，也称为工作目录，主要用于存放开发的代码。
* **暂存区**：`.git`文件夹中有很多文件，其中有一个index文件就是暂存区，也可以叫做stage。
  * 暂存区是一个临时保存修改文件的地方。
* ![image-20221015163725140](http://qny.expressisland.cn/schoolOpens/image-20221015163725140.png)

## Git工作区中文件的状态

* Git工作区中的文件存在两种状态：
  * `untracked`未跟踪（未被纳入版本控制）
  * `tracked`已跟踪（被纳入版本控制）
    * `Unmodified`未修改状态
    * `Modified`已修改状态
    * `Staged`已暂存状态
* **注意：这些文件的状态会随着我们执行Git的命令发生变化**

## 本地仓库操作

本地仓库常用命令如下：

* `git status` —— 查看文件状态
* `git add` —— 将文件的修改加入暂存区
* `git reset` —— 将暂存区的文件取消暂存或者是切换到指定版本
* `git commit` —— 将暂存区的文件修改提交到版本库
* `git log` —— 查看日志

## 远程仓库操作

|   `git remote`   |  查看远程仓库  |
| :--------------: | :------------: |
| `git remote add` |  添加远程仓库  |
|   `git clone`    | 从远程仓库克隆 |
|    `git pull`    | 从远程仓库拉取 |
|    `git push`    | 推送到远程仓库 |

### 远程仓库操作-查看远程仓库
* 如果想查看已经配置的远程仓库服务器，可以运行`git remote`命令，它会列出每一个远程服务器的简写。
* 如果已经克隆了远程仓库，那么至少应该能看到origin，这是Git克隆的仓库服务器的默认名字。

### 远程仓库操作-添加远程仓库
* 添加远程仓库，运行`git remote add <shortname><url>`添加一个新的远程Git仓库，同时指定一个可以引用的简写。

### 远程仓库操作-克隆远程仓库到本地
* 如果你想获得一份已经存在了的Git远程仓库的拷贝，这时就要用到`git clone`命令。
* Git克隆的是该Git仓库服务器上的几乎所有数据（包括日志信息、历史记录等），而不仅仅是复制工作所需要的文件。
* 克隆仓库的命令格式是：`git clone [url]`

### 远程仓库操作-推送至远程仓库
* 将本地仓库内容推送到远程仓库，可以使用命令：
  * `git push [remote-name] [branch-name]`

### 远程仓库操作-从远程仓库拉取
* `git pull`命令的作用是从远程仓库获取最新版本并合并到本地仓库。
* 命令格式：`git pull [short-name] [branch-name]`
* **注意：**如果当前本地仓库不是从远程仓库克隆，而是本地创建的仓库，并且仓库中存在文件，此时再从远程仓库拉取文件的时候会报错（fatal: refusing to merge unrelated histories）。
  * 解决此问题可以在`git pull`命令后加入参数`--allow-unrelated-histories`。

## 分支操作

* 分支是Git使用过程中非常重要的概念。

* 使用分支意味着你可以把你的工作从开发主线上分离开来，以免影响开发主线。

* 同一个仓库可以有多个分支，各个分支相互独立，互不干扰。

* 通过`git init`命令创建本地仓库时默认会创建一个master分支。

* 分支的相关命令，具体如下：

  |         `git branch`          |      查看分支      |
  | :---------------------------: | :----------------: |
  |      `git branch [name]`      |      创建分支      |
  |     `git checkout [name]`     |      切换分支      |
  | `git push [shortName] [name]` | 推送至远程仓库分支 |
  |      `git merge [name]`       |      合并分支      |

### 分支操作-查看分支
* `git branch` —— 列出所有本地分支
* `git branch -r` —— 列出所有远程分支
* `git branch -a` —— 列出所有本地分支和远程分支

  ### 分支操作-创建分支
* 创建分支命令格式：`git branch [name]`

### 分支操作-切换分支
* 切换分支命令格式：`git checkout [name]`

  ### 分支操作-推送至远程仓库分支
* 推送至远程仓库分支命令格式：`git push [shortName] [name]`

### 分支操作-合并分支
* 合并分支命令格式：`git merge [name]`


## 标签操作
* Git中的标签，指的是某个分支某个特定时间点的状态。
* 通过标签，可以很方便的切换到标记时的状态。
* 比较有代表性的是人们会使用这个功能来标记发布结点（v1.0、v1.2等）。
* 下面是mybatis-plus的标签：
  * ![image-20221015174044273](http://qny.expressisland.cn/schoolOpens/image-20221015174044273.png)

### 标签操作
* 和标签操作相关的命令：

|             `git tag`             |               列出已有的标签               |
| :-------------------------------: | :----------------------------------------: |
|         `git tag [name]`          |                  创建标签                  |
|   `git push [shortName] [name]`   |            将标签推送至远程仓库            |
| `git checkout -b [branch] [name]` | 检出标签（需要新建一个分支来指向某个标签） |

# 在IDEA中使用Git

## 在IDEA中配置Git

* ![image-20221016173800177](http://qny.expressisland.cn/schoolOpens/image-20221016173800177.png)

## 获取Git仓库

 在IDEA中使用Git获取仓库有两种方式：

* 本地初始化仓库
* 从远程仓库克隆

### 本地初始化仓库

* 选择该项目或其他项目
* 多出个`.git`文件夹即完成初始化仓库。

* ![image-20221016174354220](http://qny.expressisland.cn/schoolOpens/image-20221016174354220.png)
* ![image-20221016174501510](http://qny.expressisland.cn/schoolOpens/image-20221016174501510.png)

### 从远程仓库克隆

* 克隆成功后，idea可以直接选择是否打开该项目。

* ![image-20221016175121835](http://qny.expressisland.cn/schoolOpens/image-20221016175121835.png)
* 
* ![image-20221016175042326](http://qny.expressisland.cn/schoolOpens/image-20221016175042326.png)
* ![image-20221016175532440](http://qny.expressisland.cn/schoolOpens/image-20221016175532440.png)

## 本地仓库操作

* 将文件加入暂存区
* 将暂存区的文件提交到版本库
* 查看日志

## 远程仓库操作

* 查看远程仓库
* 添加远程仓库
* 推送至远程仓库
* 从远程仓库拉取

## 分支操作

* 查看分支
* 创建分支
* 切换分支
* 将分支推送到远程仓库
* 合并分支

### 查看分支

* ![image-20221016181059947](http://qny.expressisland.cn/schoolOpens/image-20221016181059947.png)

### 创建分支

* ![image-20221016181153832](http://qny.expressisland.cn/schoolOpens/image-20221016181153832.png)
* ![image-20221016181206340](http://qny.expressisland.cn/schoolOpens/image-20221016181206340.png)
* ![image-20221016181222404](http://qny.expressisland.cn/schoolOpens/image-20221016181222404.png)

### 切换分支

* 在另一个分支中选择“签出”，还可以回到该分支。

### 将分支推送到远程仓库

* ![image-20221016181503591](http://qny.expressisland.cn/schoolOpens/image-20221016181503591.png)
* ![image-20221016181519431](http://qny.expressisland.cn/schoolOpens/image-20221016181519431.png)

### 合并分支

* ![image-20221016181703689](http://qny.expressisland.cn/schoolOpens/image-20221016181703689.png)

