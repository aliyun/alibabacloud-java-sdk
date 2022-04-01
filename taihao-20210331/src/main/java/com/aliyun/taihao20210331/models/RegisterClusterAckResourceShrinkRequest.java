// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RegisterClusterAckResourceShrinkRequest extends TeaModel {
    // registerClusterAckResourceParam
    @NameInMap("registerClusterAckResourceParam")
    public String registerClusterAckResourceParamShrink;

    public static RegisterClusterAckResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterClusterAckResourceShrinkRequest self = new RegisterClusterAckResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RegisterClusterAckResourceShrinkRequest setRegisterClusterAckResourceParamShrink(String registerClusterAckResourceParamShrink) {
        this.registerClusterAckResourceParamShrink = registerClusterAckResourceParamShrink;
        return this;
    }
    public String getRegisterClusterAckResourceParamShrink() {
        return this.registerClusterAckResourceParamShrink;
    }

}
