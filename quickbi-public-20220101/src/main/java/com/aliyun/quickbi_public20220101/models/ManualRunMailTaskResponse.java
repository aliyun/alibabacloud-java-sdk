// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ManualRunMailTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManualRunMailTaskResponseBody body;

    public static ManualRunMailTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ManualRunMailTaskResponse self = new ManualRunMailTaskResponse();
        return TeaModel.build(map, self);
    }

    public ManualRunMailTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManualRunMailTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManualRunMailTaskResponse setBody(ManualRunMailTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ManualRunMailTaskResponseBody getBody() {
        return this.body;
    }

}
