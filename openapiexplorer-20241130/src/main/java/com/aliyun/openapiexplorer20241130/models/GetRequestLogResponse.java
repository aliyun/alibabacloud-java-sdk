// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetRequestLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRequestLogResponseBody body;

    public static GetRequestLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRequestLogResponse self = new GetRequestLogResponse();
        return TeaModel.build(map, self);
    }

    public GetRequestLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRequestLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRequestLogResponse setBody(GetRequestLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRequestLogResponseBody getBody() {
        return this.body;
    }

}
