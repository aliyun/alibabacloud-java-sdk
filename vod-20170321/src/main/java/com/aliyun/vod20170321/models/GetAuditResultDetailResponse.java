// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditResultDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditResultDetailResponseBody body;

    public static GetAuditResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditResultDetailResponse self = new GetAuditResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditResultDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditResultDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditResultDetailResponse setBody(GetAuditResultDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditResultDetailResponseBody getBody() {
        return this.body;
    }

}
