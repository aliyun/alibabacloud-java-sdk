// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateStep extends TeaModel {
    /**
     * <p>The build instruction parameters, whose meaning varies depending on the type: for USER, it is [username, optional passwordless sudo flag], where the second item configures passwordless sudo when it is the string true; for WORKDIR, it is [directory]; for ENV, it is [key, value, ...], allowing multiple pairs to be set at once; for RUN, it is [command, optional temporary user].</p>
     */
    @NameInMap("args")
    public java.util.List<String> args;

    /**
     * <p>The build instruction type, which supports four values: USER, WORKDIR, ENV, and RUN, executed sequentially in the order of the array.</p>
     * 
     * <strong>example:</strong>
     * <p>RUN</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateTemplateStep build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateStep self = new CreateTemplateStep();
        return TeaModel.build(map, self);
    }

    public CreateTemplateStep setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public CreateTemplateStep setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
