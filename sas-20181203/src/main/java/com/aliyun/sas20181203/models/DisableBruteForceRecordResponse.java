// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DisableBruteForceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableBruteForceRecordResponseBody body;

    public static DisableBruteForceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableBruteForceRecordResponse self = new DisableBruteForceRecordResponse();
        return TeaModel.build(map, self);
    }

    public DisableBruteForceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableBruteForceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableBruteForceRecordResponse setBody(DisableBruteForceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableBruteForceRecordResponseBody getBody() {
        return this.body;
    }

}
