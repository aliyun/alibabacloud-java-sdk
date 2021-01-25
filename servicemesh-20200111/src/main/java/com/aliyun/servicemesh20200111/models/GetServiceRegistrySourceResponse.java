// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetServiceRegistrySourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static GetServiceRegistrySourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRegistrySourceResponse self = new GetServiceRegistrySourceResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceRegistrySourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceRegistrySourceResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetServiceRegistrySourceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
