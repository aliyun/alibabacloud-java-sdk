// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InstanceExecAuthorizationInput extends TeaModel {
    @NameInMap("options")
    public InstanceExecAuthorizationInputOptions options;

    public static InstanceExecAuthorizationInput build(java.util.Map<String, ?> map) throws Exception {
        InstanceExecAuthorizationInput self = new InstanceExecAuthorizationInput();
        return TeaModel.build(map, self);
    }

    public InstanceExecAuthorizationInput setOptions(InstanceExecAuthorizationInputOptions options) {
        this.options = options;
        return this;
    }
    public InstanceExecAuthorizationInputOptions getOptions() {
        return this.options;
    }

}
