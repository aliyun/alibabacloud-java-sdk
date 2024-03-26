// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaAuditResultDetailResponseBody body;

    public static GetMediaAuditResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultDetailResponse self = new GetMediaAuditResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaAuditResultDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaAuditResultDetailResponse setBody(GetMediaAuditResultDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaAuditResultDetailResponseBody getBody() {
        return this.body;
    }

}
