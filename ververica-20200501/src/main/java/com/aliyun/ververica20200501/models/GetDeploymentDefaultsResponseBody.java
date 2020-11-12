// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class GetDeploymentDefaultsResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static GetDeploymentDefaultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentDefaultsResponseBody self = new GetDeploymentDefaultsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentDefaultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentDefaultsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
