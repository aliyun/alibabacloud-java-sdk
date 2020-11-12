// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class UpdateDeploymentDesiredStateResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static UpdateDeploymentDesiredStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentDesiredStateResponseBody self = new UpdateDeploymentDesiredStateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentDesiredStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDeploymentDesiredStateResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
