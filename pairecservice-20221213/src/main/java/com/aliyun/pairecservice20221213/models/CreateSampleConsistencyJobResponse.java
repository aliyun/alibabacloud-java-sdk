// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateSampleConsistencyJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSampleConsistencyJobResponseBody body;

    public static CreateSampleConsistencyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleConsistencyJobResponse self = new CreateSampleConsistencyJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateSampleConsistencyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSampleConsistencyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSampleConsistencyJobResponse setBody(CreateSampleConsistencyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSampleConsistencyJobResponseBody getBody() {
        return this.body;
    }

}
