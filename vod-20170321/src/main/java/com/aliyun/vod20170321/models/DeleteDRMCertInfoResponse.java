// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDRMCertInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDRMCertInfoResponseBody body;

    public static DeleteDRMCertInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDRMCertInfoResponse self = new DeleteDRMCertInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDRMCertInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDRMCertInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDRMCertInfoResponse setBody(DeleteDRMCertInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDRMCertInfoResponseBody getBody() {
        return this.body;
    }

}
