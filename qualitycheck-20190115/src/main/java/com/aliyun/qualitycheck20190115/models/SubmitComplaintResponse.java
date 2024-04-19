// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitComplaintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitComplaintResponseBody body;

    public static SubmitComplaintResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitComplaintResponse self = new SubmitComplaintResponse();
        return TeaModel.build(map, self);
    }

    public SubmitComplaintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitComplaintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitComplaintResponse setBody(SubmitComplaintResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitComplaintResponseBody getBody() {
        return this.body;
    }

}
