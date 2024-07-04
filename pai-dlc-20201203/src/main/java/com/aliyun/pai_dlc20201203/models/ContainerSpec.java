// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ContainerSpec extends TeaModel {
    @NameInMap("Args")
    public java.util.List<String> args;

    @NameInMap("Command")
    public java.util.List<String> command;

    @NameInMap("Env")
    public java.util.List<EnvVar> env;

    /**
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/pai-dlc/curl:v1.0.0</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <strong>example:</strong>
     * <p>data-init</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Resources")
    public ResourceRequirements resources;

    /**
     * <strong>example:</strong>
     * <p>/root</p>
     */
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

    public ContainerSpec setResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }
    public ResourceRequirements getResources() {
        return this.resources;
    }

    public ContainerSpec setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

}
