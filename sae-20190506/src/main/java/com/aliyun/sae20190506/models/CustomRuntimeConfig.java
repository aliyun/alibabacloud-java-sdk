// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CustomRuntimeConfig extends TeaModel {
    @NameInMap("args")
    public java.util.List<String> args;

    @NameInMap("command")
    public java.util.List<String> command;

    public static CustomRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
        CustomRuntimeConfig self = new CustomRuntimeConfig();
        return TeaModel.build(map, self);
    }

    public CustomRuntimeConfig setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public CustomRuntimeConfig setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

}
