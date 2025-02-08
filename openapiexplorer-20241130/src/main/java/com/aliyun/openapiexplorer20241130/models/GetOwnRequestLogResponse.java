// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetOwnRequestLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOwnRequestLogResponseBody body;

    public static GetOwnRequestLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOwnRequestLogResponse self = new GetOwnRequestLogResponse();
        return TeaModel.build(map, self);
    }

    public GetOwnRequestLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOwnRequestLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOwnRequestLogResponse setBody(GetOwnRequestLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOwnRequestLogResponseBody getBody() {
        return this.body;
    }

}
