// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class SetQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetQuotaResponseBody body;

    public static SetQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetQuotaResponse self = new SetQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetQuotaResponse setBody(SetQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetQuotaResponseBody getBody() {
        return this.body;
    }

}
