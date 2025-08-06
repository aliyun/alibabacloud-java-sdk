// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDRMCertInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDRMCertInfoResponseBody body;

    public static GetDRMCertInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDRMCertInfoResponse self = new GetDRMCertInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDRMCertInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDRMCertInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDRMCertInfoResponse setBody(GetDRMCertInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDRMCertInfoResponseBody getBody() {
        return this.body;
    }

}
