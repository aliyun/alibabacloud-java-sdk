// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseUsageResponseBody body;

    public static GetContextDatabaseUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseUsageResponse self = new GetContextDatabaseUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseUsageResponse setBody(GetContextDatabaseUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseUsageResponseBody getBody() {
        return this.body;
    }

}
