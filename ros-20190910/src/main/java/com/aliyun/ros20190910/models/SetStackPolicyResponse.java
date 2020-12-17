// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetStackPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetStackPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetStackPolicyResponse self = new SetStackPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetStackPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
