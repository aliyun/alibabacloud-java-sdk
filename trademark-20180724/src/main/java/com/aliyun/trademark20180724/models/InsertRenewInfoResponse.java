// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertRenewInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertRenewInfoResponseBody body;

    public static InsertRenewInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertRenewInfoResponse self = new InsertRenewInfoResponse();
        return TeaModel.build(map, self);
    }

    public InsertRenewInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertRenewInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertRenewInfoResponse setBody(InsertRenewInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertRenewInfoResponseBody getBody() {
        return this.body;
    }

}
