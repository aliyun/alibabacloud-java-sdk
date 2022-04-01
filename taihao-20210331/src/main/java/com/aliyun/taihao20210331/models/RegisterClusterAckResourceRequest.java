// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RegisterClusterAckResourceRequest extends TeaModel {
    // registerClusterAckResourceParam
    @NameInMap("registerClusterAckResourceParam")
    public RegisterClusterAckResourceParam registerClusterAckResourceParam;

    public static RegisterClusterAckResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterClusterAckResourceRequest self = new RegisterClusterAckResourceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterClusterAckResourceRequest setRegisterClusterAckResourceParam(RegisterClusterAckResourceParam registerClusterAckResourceParam) {
        this.registerClusterAckResourceParam = registerClusterAckResourceParam;
        return this;
    }
    public RegisterClusterAckResourceParam getRegisterClusterAckResourceParam() {
        return this.registerClusterAckResourceParam;
    }

}
