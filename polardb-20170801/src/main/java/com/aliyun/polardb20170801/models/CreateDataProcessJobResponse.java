// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDataProcessJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataProcessJobResponseBody body;

    public static CreateDataProcessJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataProcessJobResponse self = new CreateDataProcessJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataProcessJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataProcessJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataProcessJobResponse setBody(CreateDataProcessJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataProcessJobResponseBody getBody() {
        return this.body;
    }

}
