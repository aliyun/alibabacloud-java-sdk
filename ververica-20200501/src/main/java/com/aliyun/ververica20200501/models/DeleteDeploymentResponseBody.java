// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class DeleteDeploymentResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentResponseBody self = new DeleteDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
