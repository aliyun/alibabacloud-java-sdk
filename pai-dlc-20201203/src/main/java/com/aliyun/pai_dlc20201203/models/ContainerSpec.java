// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ContainerSpec extends TeaModel {
    // 命令参数
    @NameInMap("Args")
    public java.util.List<String> args;

    // 用户命令
    @NameInMap("Command")
    public java.util.List<String> command;

    // 环境变量
    @NameInMap("Env")
    public java.util.List<EnvVar> env;

    // 容器镜像地址
    @NameInMap("Image")
    public String image;

    // 容器名称
    @NameInMap("Name")
    public String name;

    // 容器内工作目录
    @NameInMap("WorkingDir")
    public String workingDir;

    public static ContainerSpec build(java.util.Map<String, ?> map) throws Exception {
        ContainerSpec self = new ContainerSpec();
        return TeaModel.build(map, self);
    }

    public ContainerSpec setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public ContainerSpec setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public ContainerSpec setEnv(java.util.List<EnvVar> env) {
        this.env = env;
        return this;
    }
    public java.util.List<EnvVar> getEnv() {
        return this.env;
    }

    public ContainerSpec setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContainerSpec setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

}
