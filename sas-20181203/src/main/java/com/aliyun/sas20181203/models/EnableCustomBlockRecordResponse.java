// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableCustomBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCustomBlockRecordResponseBody body;

    public static EnableCustomBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomBlockRecordResponse self = new EnableCustomBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public EnableCustomBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCustomBlockRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCustomBlockRecordResponse setBody(EnableCustomBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCustomBlockRecordResponseBody getBody() {
        return this.body;
    }

}
