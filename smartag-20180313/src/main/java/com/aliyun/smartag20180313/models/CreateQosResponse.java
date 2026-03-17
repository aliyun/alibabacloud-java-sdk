// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQosResponseBody body;

    public static CreateQosResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQosResponse self = new CreateQosResponse();
        return TeaModel.build(map, self);
    }

    public CreateQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQosResponse setBody(CreateQosResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQosResponseBody getBody() {
        return this.body;
    }

}
