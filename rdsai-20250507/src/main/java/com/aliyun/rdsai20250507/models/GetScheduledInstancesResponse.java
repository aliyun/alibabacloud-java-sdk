// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetScheduledInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledInstancesResponseBody body;

    public static GetScheduledInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledInstancesResponse self = new GetScheduledInstancesResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledInstancesResponse setBody(GetScheduledInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledInstancesResponseBody getBody() {
        return this.body;
    }

}
