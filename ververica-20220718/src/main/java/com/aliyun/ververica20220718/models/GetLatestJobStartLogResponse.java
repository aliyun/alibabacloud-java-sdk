// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetLatestJobStartLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLatestJobStartLogResponseBody body;

    public static GetLatestJobStartLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLatestJobStartLogResponse self = new GetLatestJobStartLogResponse();
        return TeaModel.build(map, self);
    }

    public GetLatestJobStartLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLatestJobStartLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLatestJobStartLogResponse setBody(GetLatestJobStartLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLatestJobStartLogResponseBody getBody() {
        return this.body;
    }

}
