// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ExecAction extends TeaModel {
    @NameInMap("command")
    public java.util.List<String> command;

    public static ExecAction build(java.util.Map<String, ?> map) throws Exception {
        ExecAction self = new ExecAction();
        return TeaModel.build(map, self);
    }

    public ExecAction setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

}
