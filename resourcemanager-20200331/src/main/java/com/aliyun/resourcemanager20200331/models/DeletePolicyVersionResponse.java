// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeletePolicyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeletePolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyVersionResponse self = new DeletePolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
