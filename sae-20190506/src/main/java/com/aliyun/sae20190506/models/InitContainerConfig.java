// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InitContainerConfig extends TeaModel {
    @NameInMap("Command")
    public String command;

    @NameInMap("CommandArgs")
    public String commandArgs;

    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    @NameInMap("Envs")
    public String envs;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Name")
    public String name;

    public static InitContainerConfig build(java.util.Map<String, ?> map) throws Exception {
        InitContainerConfig self = new InitContainerConfig();
        return TeaModel.build(map, self);
    }

    public InitContainerConfig setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public InitContainerConfig setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public InitContainerConfig setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public InitContainerConfig setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public InitContainerConfig setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public InitContainerConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
