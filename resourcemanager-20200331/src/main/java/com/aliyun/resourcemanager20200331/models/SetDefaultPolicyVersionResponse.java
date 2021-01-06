// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetDefaultPolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPolicyVersionResponse self = new SetDefaultPolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultPolicyVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
