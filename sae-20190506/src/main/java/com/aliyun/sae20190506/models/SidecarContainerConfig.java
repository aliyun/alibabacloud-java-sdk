// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SidecarContainerConfig extends TeaModel {
    @NameInMap("Command")
    public String command;

    @NameInMap("CommandArgs")
    public String commandArgs;

    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("EmptyDirDesc")
    public String emptyDirDesc;

    @NameInMap("Envs")
    public String envs;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("Name")
    public String name;

    public static SidecarContainerConfig build(java.util.Map<String, ?> map) throws Exception {
        SidecarContainerConfig self = new SidecarContainerConfig();
        return TeaModel.build(map, self);
    }

    public SidecarContainerConfig setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public SidecarContainerConfig setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public SidecarContainerConfig setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public SidecarContainerConfig setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public SidecarContainerConfig setEmptyDirDesc(String emptyDirDesc) {
        this.emptyDirDesc = emptyDirDesc;
        return this;
    }
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
    }

    public SidecarContainerConfig setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public SidecarContainerConfig setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SidecarContainerConfig setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public SidecarContainerConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
