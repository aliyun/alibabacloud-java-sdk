// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaAuditResultResponseBody body;

    public static GetMediaAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultResponse self = new GetMediaAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaAuditResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaAuditResultResponse setBody(GetMediaAuditResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaAuditResultResponseBody getBody() {
        return this.body;
    }

}
