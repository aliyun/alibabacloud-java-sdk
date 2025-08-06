// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditResultResponseBody body;

    public static GetAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditResultResponse self = new GetAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditResultResponse setBody(GetAuditResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditResultResponseBody getBody() {
        return this.body;
    }

}
