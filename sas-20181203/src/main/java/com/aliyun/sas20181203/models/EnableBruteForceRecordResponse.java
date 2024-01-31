// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableBruteForceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableBruteForceRecordResponseBody body;

    public static EnableBruteForceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBruteForceRecordResponse self = new EnableBruteForceRecordResponse();
        return TeaModel.build(map, self);
    }

    public EnableBruteForceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableBruteForceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableBruteForceRecordResponse setBody(EnableBruteForceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableBruteForceRecordResponseBody getBody() {
        return this.body;
    }

}
