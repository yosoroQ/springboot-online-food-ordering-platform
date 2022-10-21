Linux - 凡论人心，观事传，不可不熟，不可不深
<!--more-->

# Linux



# 学习目标

* ![image-20221017194007455](http://qny.expressisland.cn/schoolOpens/image-20221017194007455.png)

# Linux简介

## Linux系统版本
* Linux系统分为内核版和发行版：
  * ![image-20221017194618047](http://qny.expressisland.cn/schoolOpens/image-20221017194618047.png)

### Linux系统版本-发行版
* ubuntu：以桌面应用为主
* RedHat：应用最广泛、收费
* centOS：RedHat的社区版、免费
* openSUSE：对个人完全免费、图形界面华丽
* Fedora：功能完备、快速更新、免费
* 红旗Linux：北京中科红旗软件技术有限公司开发

# Linux安装（centOS7）

## 安装方式介绍

* 物理机安装：直接将操作系统安装到服务器硬件上。
* 虚拟机安装：通过虚拟机软件安装。
  * **虚拟机**指通过软件模拟的具有完整硬件系统功能、运行在完全隔离环境中的完整计算机系统。
* **VMware Workstation16 密钥：**ZF3R0-FHED2-M80TY-8QYGC-NPKYF　　

## 安装Linux

### root密码

* root1234

* 这样就是进入系统了
* ![image-20221017201201821](http://qny.expressisland.cn/schoolOpens/image-20221017201201821.png)

## 网卡设置

* 由于启动服务器时未加载网卡，导致lIP地址初始化失败。
* `ip addr`
* ![image-20221017201324121](http://qny.expressisland.cn/schoolOpens/image-20221017201324121.png)

### 修改网络初始化配置，设定网卡在系统启动时初始化

* ![image-20221017201354449](http://qny.expressisland.cn/schoolOpens/image-20221017201354449.png)
* ![image-20221017201602771](http://qny.expressisland.cn/schoolOpens/image-20221017201602771.png)
* ![image-20221017201627060](http://qny.expressisland.cn/schoolOpens/image-20221017201627060.png)

### 改最后一项ONBOOT

* ![image-20221017201748007](http://qny.expressisland.cn/schoolOpens/image-20221017201748007.png)
* `esc`、`:wq`退出

### 测试

* `ip addr`
* 能看得见IP地址就可以了
* ![image-20221017202011281](http://qny.expressisland.cn/schoolOpens/image-20221017202011281.png)

## 安装SSH连接工具

* SSH，建立在应用层基础上的安全协议。
* 常用的SSH连接工具：
  * putty
  * secureCRT
  * xshell
  * **finalshell**
* 通过SSH连接工具就可以实现从本地连接到远程的Linux服务器

### **finalshell** SSH连接centos

* ![image-20221017202533488](http://qny.expressisland.cn/schoolOpens/image-20221017202533488.png)
* ![image-20221017202632536](http://qny.expressisland.cn/schoolOpens/image-20221017202632536.png)

### Linux和Windows目录结构对比
* Linux系统中的目录
  * `/`是所有目录的顶点。
  * 目录结构像一颗倒挂的树。
* ![image-20221017202758585](http://qny.expressisland.cn/schoolOpens/image-20221017202758585.png)

# Linux目录介绍

* `bin` 存放二进制可执行文件
* `boot` 存放系统引导时使用的各种文件
* `dev` 存放设备文件etc存放系统配置文件
* `home` 存放系统用户的文件·
* `lib` 存放程序运行所需的共享库和内核模块
* `opt` 额外安装的可选应用程序包所放置的位置
* `root` 超级用户目录
* `sbin` 存放二进制可执行文件，只有root用户才能访问
* `tmp` 存放临时文件
* `usr` 存放系统应用程序
* `var` 存放运行时需要改变数据的文件，例如日志文件
* ![image-20221017203018605](http://qny.expressisland.cn/schoolOpens/image-20221017203018605.png)

# Linux常用命令

## Linux命令初体验

* ![image-20221017203353318](http://qny.expressisland.cn/schoolOpens/image-20221017203353318.png)
* 注意事项：在执行Linux命令时，提示信息如果显示为乱码，这是由于编码问题导致，只需要修改Linux的编码即可。
* 命令如下：
* `echo 'LANG="en_US.UTF-8"' >> /etc/profile`
  `source /etc/profile`

### Linux命令初体验

* ![image-20221017204404173](http://qny.expressisland.cn/schoolOpens/image-20221017204404173.png)

### Linux命令使用技巧
* Tab键自动补全
* 连续两次Tab键，给出操作提示
* 使用上下箭头快速调出曾经使用过的命令
* 使用`clear命令`或者`Ctrl+l快捷键`实现清屏

### Linux命令格式

* ![image-20221017212553755](http://qny.expressisland.cn/schoolOpens/image-20221017212553755.png)
* 例：`ls -l`
  * ![image-20221017213206851](http://qny.expressisland.cn/schoolOpens/image-20221017213206851.png)
* 例：`cd /root`、`touch 2.txt 3.txt 4.txt``
* 例：`rm -f 1.txt`（直接删除，不提示）

## 文件目录操作命令

### `ls`显示指定目录下的内容

* ![image-20221017213609513](http://qny.expressisland.cn/schoolOpens/image-20221017213609513.png)
* ![image-20221017213935513](http://qny.expressisland.cn/schoolOpens/image-20221017213935513.png)
* ![image-20221017213954160](http://qny.expressisland.cn/schoolOpens/image-20221017213954160.png)

#### 简写`“ll”=“ls -l”`

* ![image-20221017214045503](http://qny.expressisland.cn/schoolOpens/image-20221017214045503.png)

### `cd`切换当前工作目录，即进入指定目录

* ![image-20221017214145046](http://qny.expressisland.cn/schoolOpens/image-20221017214145046.png)

### `cat`显示文件内容

* ![image-20221017214342761](http://qny.expressisland.cn/schoolOpens/image-20221017214342761.png)

#### 例1：`cat /etc/profile`

* ![image-20221017214538733](http://qny.expressisland.cn/schoolOpens/image-20221017214538733.png)

#### 例2：`cat -n /etc/profile`

* ![image-20221017214833600](http://qny.expressisland.cn/schoolOpens/image-20221017214833600.png)

### `more`以分页的形式显示文件内容

* ![image-20221017215012114](http://qny.expressisland.cn/schoolOpens/image-20221017215012114.png)

#### 例：`more /etc/profile`

![image-20221017215450634](http://qny.expressisland.cn/schoolOpens/image-20221017215450634.png)

### `tail`查看文件末尾的内容

* ![image-20221017215552237](http://qny.expressisland.cn/schoolOpens/image-20221017215552237.png)

#### 例：`tail -f /my/my.log`

* ![image-20221017220031386](http://qny.expressisland.cn/schoolOpens/image-20221017220031386.png)

* ![image-20221017220012326](http://qny.expressisland.cn/schoolOpens/image-20221017220012326.png)
* 按`ctrl + c` 即可退出。

### `mkdir`创建目录

* ![image-20221017220136412](http://qny.expressisland.cn/schoolOpens/image-20221017220136412.png)

#### 举例

* ![image-20221017220548880](http://qny.expressisland.cn/schoolOpens/image-20221017220548880.png)

### `rmdir`删除空目录

* ![image-20221017220644699](http://qny.expressisland.cn/schoolOpens/image-20221017220644699.png)

#### 举例

* ![image-20221017220959990](http://qny.expressisland.cn/schoolOpens/image-20221017220959990.png)

### `rm`删除文件或者目录

* ![image-20221017221043509](http://qny.expressisland.cn/schoolOpens/image-20221017221043509.png)

#### 举例

* ![image-20221017221619617](http://qny.expressisland.cn/schoolOpens/image-20221017221619617.png)

## 拷贝移动命令

### `CP`用于复制文件或目录

* ![image-20221017221832541](http://qny.expressisland.cn/schoolOpens/image-20221017221832541.png)

#### 举例① —— 将cpdd01.txt复制到cpdd目录中

* ![image-20221018200707504](http://qny.expressisland.cn/schoolOpens/image-20221018200707504.png)

#### 举例② —— 将cpdd01.txt复制到当前目录，并改名为cpdd02.txt

* ![image-20221018202703907](http://qny.expressisland.cn/schoolOpens/image-20221018202703907.png)

#### 举例③ —— 将cpdd目录和目录下所有文件复制到ps目录下

* ![image-20221018203045806](http://qny.expressisland.cn/schoolOpens/image-20221018203045806.png)

#### 举例④ —— 将hei目录下所有文件复制到ps目录下

* ![image-20221018203654613](http://qny.expressisland.cn/schoolOpens/image-20221018203654613.png)

### `mv`为文件或目录改名、或将文件或目录移动到其它位置

* ![image-20221018204001674](http://qny.expressisland.cn/schoolOpens/image-20221018204001674.png)

#### ① 将tiktok.txt改名为dou.txt

* ![image-20221018204307272](http://qny.expressisland.cn/schoolOpens/image-20221018204307272.png)

#### ② 将文件dou.txt移动到ps目录中

* ![image-20221018204429964](http://qny.expressisland.cn/schoolOpens/image-20221018204429964.png)

#### ③ 将dou.txt移动到cp9目录中，并改名为yin.txt

* ![image-20221018204742133](http://qny.expressisland.cn/schoolOpens/image-20221018204742133.png)

#### ④ 如果mv1目录不存在，将mv1目录改名为mv2；如果mv1目录存在，将mv1目录移动到mv2目录中

* ![image-20221018205257394](http://qny.expressisland.cn/schoolOpens/image-20221018205257394.png)

## 打包压缩命令

### `tar`对文件进行打包、解包、压缩、解压

* ![image-20221018205931298](http://qny.expressisland.cn/schoolOpens/image-20221018205931298.png)

#### ① 建包 `-cvf`

* ![image-20221018210432484](http://qny.expressisland.cn/schoolOpens/image-20221018210432484.png)、

#### ② 打包压缩 `-zvcf`

* ![image-20221018225049391](http://qny.expressisland.cn/schoolOpens/image-20221018225049391.png)

#### ③ 解包 `-xvf`

* ![](http://qny.expressisland.cn/schoolOpens/image-20221018225350167.png)

#### ④ 解压 `-zxvf`

* ![image-20221018225624433](http://qny.expressisland.cn/schoolOpens/image-20221018225624433.png)

### 举例（打包、解包）

* ![image-20221018225830313](http://qny.expressisland.cn/schoolOpens/image-20221018225830313.png)

#### 解包 - 解压到根目录

* ![image-20221018230105322](http://qny.expressisland.cn/schoolOpens/image-20221018230105322.png)
* ![image-20221018230132521](http://qny.expressisland.cn/schoolOpens/image-20221018230132521.png)

## 文本编辑命令

### `vi/vim`

* ![image-20221018230247912](http://qny.expressisland.cn/schoolOpens/image-20221018230247912.png)

#### 安装vim

* `yum install vim`
* ![image-20221020190230389](http://qny.expressisland.cn/schoolOpens/image-20221020190230389.png)
* ![image-20221020190211699](http://qny.expressisland.cn/schoolOpens/image-20221020190211699.png)

### vim

* ![image-20221020190108957](http://qny.expressisland.cn/schoolOpens/image-20221020190108957.png)

#### 针对vim中的三种模式说明如下：

##### 1、命令模式
* 命令模式下可以查看文件内容、移动光标（上下左右箭头、gg、G）。
* 通过vim命令打开文件后，默认进入命令模式。
* 另外两种模式需要首先进入命令模式，才能进入彼此。

##### 2、插入模式
* 插入模式下可以对文件内容进行编辑。
* 在命令模式下按下[**i,a,o**]任意一个，可以进入插入模式。
* 进入插入模式后，下方会出现【insert】字样。
* 在插入模式下按下**ESC**键，回到命令模式。

##### 3、底行模式
* 底行模式下可以通过命令对文件内容进行查找、显示行号、退出等操作。
* 在命令模式下按下[**:,/**]任意一个，可以进入底行模式。
* 通过**/**方式进入底行模式后，可以对文件内容进行查找。
* 通过**:**方式进入底行模式后，可以输入**wq**(保存并退出)、**q!**(不保存退出)、**set nu**(显示行号)。

## 查找命令

### `find`在指定目录下查找文件

* ![image-20221020191605725](http://qny.expressisland.cn/schoolOpens/image-20221020191605725.png)

#### 在当前目录及其子目录下查找.java结尾文件

* ![image-20221020191738475](http://qny.expressisland.cn/schoolOpens/image-20221020191738475.png)

#### 在/root目录及其子目录下查找.java结尾的文件

* ![image-20221020192127520](http://qny.expressisland.cn/schoolOpens/image-20221020192127520.png)

### `grep`从指定文件中查找指定的文本内容

* ![image-20221020192223065](http://qny.expressisland.cn/schoolOpens/image-20221020192223065.png)

#### 查找Hello.java文件中出现的Hello字符串的位置

* ![image-20221020192523794](http://qny.expressisland.cn/schoolOpens/image-20221020192523794.png)

#### 查找当前目录中所有.java结尾的文件中包含hello字符串的位置

* ![image-20221020192553132](http://qny.expressisland.cn/schoolOpens/image-20221020192553132.png)



# Linux软件安装

## 软件安装方式

### 二进制发布包安装
* 软件已经针对具体平台编译打包发布，只要解压，修改配置即可。

### rpm安装

* 软件已经按照redhat的包管理规范进行打包，使用rpm命令进行安装，不能自行解决库依赖问题。

### yum安装

* 一种在线软件安装方式，本质上还是rpm安装，自动下载安装包并安装，安装过程中自动解决库。

### 依赖问题源码编译安装

* 软件以源码工程的形式发布，需要自己编译打包。

## 安装jdk

* ![image-20221020193314416](http://qny.expressisland.cn/schoolOpens/image-20221020193314416.png)

### 上传jdk文件

* finalshell可以直接上传文件：
  * ![image-20221020193624982](http://qny.expressisland.cn/schoolOpens/image-20221020193624982.png)

* ![image-20221020193502254](http://qny.expressisland.cn/schoolOpens/image-20221020193502254.png)
* ![image-20221020193945836](http://qny.expressisland.cn/schoolOpens/image-20221020193945836.png)

### 解压jdk

* `tar -zxvf jdk-8u171-linux-x64.tar.gz -C /usr/local`
* ![image-20221020194259262](http://qny.expressisland.cn/schoolOpens/image-20221020194259262.png)

### 配置环境变量

* `vim /etc/profile`
* `shift + g` 定位到文件末尾
* 点击 `i键` 进入插入模式
* 输入以下两行变量：

```bash
JAVA_HOME=/usr/local/jdk1.8.0_171

PATH=$JAVA_HOME/bin:$PATH
```

* `esc`返回，`:wq`保存退出。
* 重新加载profile文件，使更改的配置立即生效，命令为`source /etc/profile`
* 检查安装是否成功，命令为`java -version`
  * ![image-20221020195212049](http://qny.expressisland.cn/schoolOpens/image-20221020195212049.png)

## 安装Tomcat

* ![image-20221020195254286](http://qny.expressisland.cn/schoolOpens/image-20221020195254286.png)

### 上传和解压tomcat

* ![image-20221020195441146](http://qny.expressisland.cn/schoolOpens/image-20221020195441146.png)
* 解压安装包：`tar -zxvf apache-tomcat-7.0.57.tar.gz -C /usr/local`
* ![image-20221020195641415](http://qny.expressisland.cn/schoolOpens/image-20221020195641415.png)

### 进入Tomcat的bin目录启动服务

*  `cd apache-tomcat-7.0.57/`
* `cd bin`
* ![image-20221020195902495](http://qny.expressisland.cn/schoolOpens/image-20221020195902495.png)

* 进入Tomcat的bin目录启动服务，命令为`sh startup.sh`或者`./startup.sh`
* ![image-20221020195938025](http://qny.expressisland.cn/schoolOpens/image-20221020195938025.png)

### 验证Tomcat启动是否成功

* ![image-20221020200020051](http://qny.expressisland.cn/schoolOpens/image-20221020200020051.png)

#### 查看启动日志

* 先回到tomcat文件夹根目录下，再`cd logs/`
* ![image-20221020200522713](http://qny.expressisland.cn/schoolOpens/image-20221020200522713.png)
* `more /usr/local/apache-tomcat-7.0.57/logs/catalina.out`
* 无异常信息，出现端口号则为运行成功
  * ![image-20221020200630290](http://qny.expressisland.cn/schoolOpens/image-20221020200630290.png)
* 也可以用`tail -50 /usr/local/apache-tomcat-7.0.57/logs/catalina.out`

#### 查看进程 `ps -ef|grep tomcat`

*  `ps -ef|grep tomcat`
* ![image-20221020201003127](http://qny.expressisland.cn/schoolOpens/image-20221020201003127.png)

### 防火墙操作
* 查看防火墙状态（systemctl status firewalld、firewall-cmd --state）

* 暂时关闭防火墙（systemctl stop firewalld）

* 永久关闭防火墙（systemctl disable firewalld）

* 开启防火墙（systemctl start firewalld）

* 开放指定端口（firewall-cmd --zone=public --add-port=8080/tcp --permanent）

* 关闭指定端口（firewall-cmd --zone=public --remove-port=8080/tcp --permanent）

* 立即生效（firewall-cmd --reload）

* 查看开放的端口（firewall-cmd --zone=public --list-ports）

  <hr>

* 注意：

  * systemctl是管理Linux中服务的命令，可以对服务进行启动、停止、重启、查看状态等操作。
  * firewall-cmd是Linux中专门用于控制防火墙的命令。
  * 为了保证系统安全，服务器的防火墙不建议关闭。

#### 暂时关闭防火墙

* `systemctl stop firewalld`

* ![image-20221020201737483](http://qny.expressisland.cn/schoolOpens/image-20221020201737483.png)
* 输入域名http://192.168.206.130:8080/，能访问成功：
  * ![image-20221020201851660](http://qny.expressisland.cn/schoolOpens/image-20221020201851660.png)

#### 开放指定端口

* `firewall-cmd --zone=public --add-port=8080/tcp --permanent`
* 立即生效：`firewall-cmd --reload`
  * ![image-20221020202204332](http://qny.expressisland.cn/schoolOpens/image-20221020202204332.png)
  * 输入域名http://192.168.206.130:8080/，能访问成功：
    * ![image-20221020201851660](http://qny.expressisland.cn/schoolOpens/image-20221020201851660.png)

#### 查看开放的端口

* `firewall-cmd --zone=public --list-ports`
* ![image-20221020202337238](http://qny.expressisland.cn/schoolOpens/image-20221020202337238.png)

### 停止tomcat服务

* ![image-20221020202519960](http://qny.expressisland.cn/schoolOpens/image-20221020202519960.png)

#### 运行Tomcat的bin目录中提供的停止服务的脚本文件shutdown.sh

* `sh shutdown.sh`
* `./shutdown.sh`
* ![image-20221020202743571](http://qny.expressisland.cn/schoolOpens/image-20221020202743571.png)

#### 结束Tomcat进程 —— 查看Tomcat进程，获得进程id

* 执行命令结束进程`kill -9 XXXXX`
* ![image-20221020203120871](http://qny.expressisland.cn/schoolOpens/image-20221020203120871.png)

## 安装MySQL

* ![image-20221020203228529](http://qny.expressisland.cn/schoolOpens/image-20221020203228529.png)
* 注意事项：如果当前系统中已经安装有MySQL数据库，安装将失败。CentoS7自带mariadb，与MySQL数据库冲突。

### rpm -qa | grep mysql

### rpm -qa | grep mariadb

* ![image-20221020203703796](http://qny.expressisland.cn/schoolOpens/image-20221020203703796.png)
* 有mariadb，没有mysql。
* 移除mariadb。

### 卸载已经安装的冲突软件 —— 移除mariadb

* ![image-20221020203817067](http://qny.expressisland.cn/schoolOpens/image-20221020203817067.png)
* `rpm -e --nodeps mariadb-libs-5.5.60-1.el7_5.x86_64`
* ![image-20221020203913721](http://qny.expressisland.cn/schoolOpens/image-20221020203913721.png)
* 现在mariadb移除掉了。

### 将资料中提供的MySQL安装包上传到Linux并解压

* ![image-20221020204012847](http://qny.expressisland.cn/schoolOpens/image-20221020204012847.png)
* `mkdir /usr/local/mysql`
* `tar -zxvf mysql-5.7.25-1.el7.x86_64.rpm-bundle.tar.gz -C /usr/local/mysql`
* ![image-20221020204305809](http://qny.expressisland.cn/schoolOpens/image-20221020204305809.png)
* ![image-20221020204317209](http://qny.expressisland.cn/schoolOpens/image-20221020204317209.png)

### 按照顺序安装rpm软件包

* ![image-20221020204505084](http://qny.expressisland.cn/schoolOpens/image-20221020204505084.png)

```sql
* rpm -ivh mysql-community-common-5.7.25-1.el7.x86_64.rpm
* rpm -ivh mysql-community-libs-5.7.25-1.el7.x86_64.rpm
* rpm -ivh mysql-community-devel-5.7.25-1.el7.x86_64.rpm
* rpm -ivh mysql-community-libs-compat-5.7.25-1.el7.x86_64.rpm
* rpm -ivh mysql-community-client-5.7.25-1.el7.x86_64.rpm
* yum install net-tools
* rpm -ivh mysql-community-server-5.7.25-1.el7.x86_64.rpm

* yum update   --通过指令升级现有软件及系统内核
```

### 启动mysql

* ![image-20221020205300701](http://qny.expressisland.cn/schoolOpens/image-20221020205300701.png)

#### 查看mysql服务状态

* `systemctl status mysqld`
* ![image-20221020205705667](http://qny.expressisland.cn/schoolOpens/image-20221020205705667.png)

#### 启动mysql服务

* `systemctl start mysqld`
* ![image-20221020205829894](http://qny.expressisland.cn/schoolOpens/image-20221020205829894.png)
* ![image-20221020205928621](http://qny.expressisland.cn/schoolOpens/image-20221020205928621.png)

#### 开机启动mysql服务

* `systemctl enable mysqld`

#### 查看已经启动的服务

* `netstat -tunlp`
  * ![image-20221020210154488](http://qny.expressisland.cn/schoolOpens/image-20221020210154488.png)
* `netstat -tunlp | grep mysql`
  * ![image-20221020210324728](http://qny.expressisland.cn/schoolOpens/image-20221020210324728.png)

#### 查看mysql进程

* `ps -ef | grep mysql`
  * ![image-20221020210352160](http://qny.expressisland.cn/schoolOpens/image-20221020210352160.png)

#### 登录MySQL数据库，查阅临时密码

* ![image-20221021191611342](http://qny.expressisland.cn/schoolOpens/image-20221021191611342.png)
* 注意事项：冒号后面的是密码，注意空格
* `cat /var/log/mysqld.log | grep password`
* ![image-20221021191818779](http://qny.expressisland.cn/schoolOpens/image-20221021191818779.png)
* 临时密码：iTeBuy)ue7er

#### 登录MySQL，修改密码，开放访问权限

* ![image-20221021191907744](http://qny.expressisland.cn/schoolOpens/image-20221021191907744.png)
* set global validate_password_length=4;
* set global validate_password_policy=LOW;
* set password = password('root');
* `grant all on *.* to 'root'@'%' identified by 'root';`
* `flush privileges;`

### 外部连接数据库（Navicat）

* 开启3306端口号

* ![image-20221021195620151](http://qny.expressisland.cn/schoolOpens/image-20221021195620151.png)
* reload
* ![image-20221021195929004](http://qny.expressisland.cn/schoolOpens/image-20221021195929004.png)

#### 连接成功

* ![image-20221021195950482](http://qny.expressisland.cn/schoolOpens/image-20221021195950482.png)
* ![image-20221021200002571](http://qny.expressisland.cn/schoolOpens/image-20221021200002571.png)

## 安装lrzsz —— 文件上传、下载

* 搜索lrzsz安装包，命令为`yum list lrzsz`
* 使用yum命令在线安装，命令为`yum install lrzsz.x86_64`
* ![image-20221021200059141](http://qny.expressisland.cn/schoolOpens/image-20221021200059141.png)

### `rz` —— “选择上传文件”

* ![image-20221021200421320](http://qny.expressisland.cn/schoolOpens/image-20221021200421320.png)
* ![image-20221021200427162](http://qny.expressisland.cn/schoolOpens/image-20221021200427162.png)

# 项目部署

## 手工部署项目

### ① 在IDEA中开发SpringBoot项目并打成jar包

### ② 将jar包上传到Linux服务器
```sql
mkdir /usr/local/app                      --创建目录，将项目jar包放到此目录
```

### ③ 启动SpringBoot程序

* `java -jar hello.jar`

![image-20221021202952173](http://qny.expressisland.cn/schoolOpens/image-20221021202952173.png)

### ④ 检查防火墙，确保8080端口对外开放，访问SpringBoot项目

* ![image-20221021203021885](http://qny.expressisland.cn/schoolOpens/image-20221021203021885.png)

### ⑤ 改为后台运行SpringBoot程序，并将日志输出到日志文件

* 目前程序运行的问题：
  * 线上程序不会采用控制台霸屏的形式运行程序，而是将程序在后台运行；
  * 线上程序不会将日志输出到控制台，而是输出到日志文件，方便运维查阅信息。
* ![image-20221021203210593](http://qny.expressisland.cn/schoolOpens/image-20221021203210593.png)

### ⑥ 停止SpringBoot程序

* ![image-20221021203630842](http://qny.expressisland.cn/schoolOpens/image-20221021203630842.png)

## 通过Shell脚本自动部署项目

* 在Linux中安装Git
* 在Linux中安装maven
* 编写Shell脚本（拉取代码、编译、打包、启动）
* 为用户授予执行Shell脚本的权限
* 执行Shell脚本

![image-20221021203743496](http://qny.expressisland.cn/schoolOpens/image-20221021203743496.png)

### ① 在Linux中安装Git

```sql
yum list git          --列出git安装包
yum install git      --在线安装git
```

### ② 使用Git克隆代码

```sql
cd /usr/local/
git clone https://gitee.com/xxxxxxx/xxxxx.git
```

### ③ 将资料中提供的maven安装包上传到Linux，在Linux中安装maven

* ![image-20221021204540423](http://qny.expressisland.cn/schoolOpens/image-20221021204540423.png)

```sql
tar -zxvf apache-maven-3.5.4-bin.tar.gz -C /usr/local
vim /etc/profile

export MAVEN_HOME=/usr/local/apache-maven-3.5.4
export PATH=$JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH

source /etc/profile
mvn -version
vim /usr/local/apache-maven-3.5.4/conf/settings.xml
<localRepository>/usr/local/repo</localRepository>
```

### ④ 将资料中提供的Shell脚本文件复制到Linux —— bootstart.sh

* Shell脚本（shell script），是一种Linux系统中的脚本程序。
* 使用Shell脚本编程跟JavaScript、 Java编程一样，只要有一个能编写代码的文本编辑器和一个能解释执行的脚本解释器就可以了。

#### bootstart.sh

```shell
#!/bin/sh
echo =================================
echo  自动化部署脚本启动
echo =================================

echo 停止原来运行中的工程
APP_NAME=helloworld

tpid=`ps -ef|grep $APP_NAME|grep -v grep|grep -v kill|awk '{print $2}'`
if [ ${tpid} ]; then
    echo 'Stop Process...'
    kill -15 $tpid
fi
sleep 2
tpid=`ps -ef|grep $APP_NAME|grep -v grep|grep -v kill|awk '{print $2}'`
if [ ${tpid} ]; then
    echo 'Kill Process!'
    kill -9 $tpid
else
    echo 'Stop Success!'
fi

echo 准备从Git仓库拉取最新代码
cd /usr/local/helloworld

echo 开始从Git仓库拉取最新代码
git pull
echo 代码拉取完成

echo 开始打包
output=`mvn clean package -Dmaven.test.skip=true`

cd target

echo 启动项目
nohup java -jar helloworld-1.0-SNAPSHOT.jar &> helloworld.log &
echo 项目启动完成
```

#### 新建脚本

* ![image-20221021205812301](http://qny.expressisland.cn/schoolOpens/image-20221021205812301.png)

### ⑤ 为用户授权
* chmod（change mode）命令是控制用户对文件的权限的命令。
* Linux中的权限分为：读（r）、写（w）、执行（x）三种权限。
* Linux的文件调用权限分为三级：文件所有者（Owner）、用户组（Group）、其它用户（Other users）。
* 只有文件的所有者和超级用户可以修改文件或目录的权限。
* 要执行Shell脚本需要有对此脚本文件的执行权限，如果没有则不能执行。

![image-20221021210020890](http://qny.expressisland.cn/schoolOpens/image-20221021210020890.png)

#### chmod命令可以使用八进制数来指定权限

* ![image-20221021210903538](http://qny.expressisland.cn/schoolOpens/image-20221021210903538.png)
* ![image-20221021210911717](http://qny.expressisland.cn/schoolOpens/image-20221021210911717.png)
* ![image-20221021211128820](http://qny.expressisland.cn/schoolOpens/image-20221021211128820.png)

### ⑥ 设置静态ip

* ![image-20221021211428842](http://qny.expressisland.cn/schoolOpens/image-20221021211428842.png)
* ![image-20221021211437921](http://qny.expressisland.cn/schoolOpens/image-20221021211437921.png)

```sql

BOOTPROTo="static"         # 使用静态IP地址，默认为dhcp

IPADDR="192.168.138.100"       # 设置的静态IP地址

NETMASK="255.255.255.0"       # 子网掩码

GATEWAY="192.168.138.2"      # 网关地址

DNS1="192.168.138.2"             # DNS服务器
```

### ⑦ 重启网络服务

* `systemctl restart network`
* ![image-20221021212827885](http://qny.expressisland.cn/schoolOpens/image-20221021212827885.png)
* 注意：重启完网络服务后ip地址已经发生了改变，此时FinalShell已经连接不上Linux系统，需要创建一个新连接才能连接到Linux。
