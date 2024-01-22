// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InstanceExecAuthorizationInputOptions extends TeaModel {
    @NameInMap("command")
    public java.util.List<String> command;

    @NameInMap("stderr")
    public Boolean stderr;

    @NameInMap("stdin")
    public Boolean stdin;

    @NameInMap("stdout")
    public Boolean stdout;

    @NameInMap("tty")
    public Boolean tty;

    public static InstanceExecAuthorizationInputOptions build(java.util.Map<String, ?> map) throws Exception {
        InstanceExecAuthorizationInputOptions self = new InstanceExecAuthorizationInputOptions();
        return TeaModel.build(map, self);
    }

    public InstanceExecAuthorizationInputOptions setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public InstanceExecAuthorizationInputOptions setStderr(Boolean stderr) {
        this.stderr = stderr;
        return this;
    }
    public Boolean getStderr() {
        return this.stderr;
    }

    public InstanceExecAuthorizationInputOptions setStdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }
    public Boolean getStdin() {
        return this.stdin;
    }

    public InstanceExecAuthorizationInputOptions setStdout(Boolean stdout) {
        this.stdout = stdout;
        return this;
    }
    public Boolean getStdout() {
        return this.stdout;
    }

    public InstanceExecAuthorizationInputOptions setTty(Boolean tty) {
        this.tty = tty;
        return this;
    }
    public Boolean getTty() {
        return this.tty;
    }

}
