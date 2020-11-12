// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class GetDeploymentResponseBody extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static GetDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponseBody self = new GetDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
