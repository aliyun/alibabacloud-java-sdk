// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class GetResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceUsageResponseBody body;

    public static GetResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceUsageResponse self = new GetResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceUsageResponse setBody(GetResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceUsageResponseBody getBody() {
        return this.body;
    }

}
