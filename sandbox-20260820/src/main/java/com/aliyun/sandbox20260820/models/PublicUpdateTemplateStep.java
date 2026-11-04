// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateStep extends TeaModel {
    /**
     * <p>The build instruction parameters. The meaning varies depending on type: for USER, it is [username, optional passwordless sudo flag], and the second item configures passwordless sudo when the string is true; for WORKDIR, it is [directory]; for ENV, it is [key, value, ...], and multiple pairs can be set at once; for RUN, it is [command, optional temporary user].</p>
     */
    @NameInMap("args")
    public java.util.List<String> args;

    /**
     * <p>The build instruction type. Valid values: USER, WORKDIR, ENV, and RUN. The instructions are executed sequentially in the order of the array.</p>
     * 
     * <strong>example:</strong>
     * <p>RUN</p>
     */
    @NameInMap("type")
    public String type;

    public static PublicUpdateTemplateStep build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateStep self = new PublicUpdateTemplateStep();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateStep setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public PublicUpdateTemplateStep setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
