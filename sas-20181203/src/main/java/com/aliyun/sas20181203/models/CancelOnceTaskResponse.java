// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CancelOnceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOnceTaskResponseBody body;

    public static CancelOnceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOnceTaskResponse self = new CancelOnceTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelOnceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOnceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOnceTaskResponse setBody(CancelOnceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOnceTaskResponseBody getBody() {
        return this.body;
    }

}
