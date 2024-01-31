// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableCustomInstanceBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCustomInstanceBlockRecordResponseBody body;

    public static EnableCustomInstanceBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomInstanceBlockRecordResponse self = new EnableCustomInstanceBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public EnableCustomInstanceBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCustomInstanceBlockRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCustomInstanceBlockRecordResponse setBody(EnableCustomInstanceBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCustomInstanceBlockRecordResponseBody getBody() {
        return this.body;
    }

}
