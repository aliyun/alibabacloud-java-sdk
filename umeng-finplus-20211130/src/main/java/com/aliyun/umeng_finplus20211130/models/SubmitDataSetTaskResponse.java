// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class SubmitDataSetTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDataSetTaskResponseBody body;

    public static SubmitDataSetTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDataSetTaskResponse self = new SubmitDataSetTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDataSetTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDataSetTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDataSetTaskResponse setBody(SubmitDataSetTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDataSetTaskResponseBody getBody() {
        return this.body;
    }

}
