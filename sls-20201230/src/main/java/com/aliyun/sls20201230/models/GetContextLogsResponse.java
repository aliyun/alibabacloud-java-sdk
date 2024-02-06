// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetContextLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextLogsResponseBody body;

    public static GetContextLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextLogsResponse self = new GetContextLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetContextLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextLogsResponse setBody(GetContextLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextLogsResponseBody getBody() {
        return this.body;
    }

}
