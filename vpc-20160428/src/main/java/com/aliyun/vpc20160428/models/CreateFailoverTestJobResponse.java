// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFailoverTestJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFailoverTestJobResponseBody body;

    public static CreateFailoverTestJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFailoverTestJobResponse self = new CreateFailoverTestJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateFailoverTestJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFailoverTestJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFailoverTestJobResponse setBody(CreateFailoverTestJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFailoverTestJobResponseBody getBody() {
        return this.body;
    }

}
