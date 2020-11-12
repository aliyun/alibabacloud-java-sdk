// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class UpdateDeploymentResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public Integer data;

    public static UpdateDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentResponseBody self = new UpdateDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDeploymentResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

}
