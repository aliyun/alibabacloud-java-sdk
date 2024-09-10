// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FinishGuidTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FinishGuidTaskResponseBody body;

    public static FinishGuidTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishGuidTaskResponse self = new FinishGuidTaskResponse();
        return TeaModel.build(map, self);
    }

    public FinishGuidTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishGuidTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishGuidTaskResponse setBody(FinishGuidTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishGuidTaskResponseBody getBody() {
        return this.body;
    }

}
