// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetServiceRegistrySourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Status")
    public String status;

    public static GetServiceRegistrySourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRegistrySourceResponseBody self = new GetServiceRegistrySourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceRegistrySourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceRegistrySourceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetServiceRegistrySourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
