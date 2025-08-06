// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListDRMCertInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDRMCertInfoResponseBody body;

    public static ListDRMCertInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDRMCertInfoResponse self = new ListDRMCertInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListDRMCertInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDRMCertInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDRMCertInfoResponse setBody(ListDRMCertInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDRMCertInfoResponseBody getBody() {
        return this.body;
    }

}
