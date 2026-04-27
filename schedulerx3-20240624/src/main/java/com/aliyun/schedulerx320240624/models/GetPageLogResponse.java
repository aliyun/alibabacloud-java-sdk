// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetPageLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPageLogResponseBody body;

    public static GetPageLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageLogResponse self = new GetPageLogResponse();
        return TeaModel.build(map, self);
    }

    public GetPageLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPageLogResponse setBody(GetPageLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageLogResponseBody getBody() {
        return this.body;
    }

}
