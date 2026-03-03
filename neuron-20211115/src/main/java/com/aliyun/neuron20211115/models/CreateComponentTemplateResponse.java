// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateComponentTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ComponentTemplate body;

    public static CreateComponentTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentTemplateResponse self = new CreateComponentTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateComponentTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComponentTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComponentTemplateResponse setBody(ComponentTemplate body) {
        this.body = body;
        return this;
    }
    public ComponentTemplate getBody() {
        return this.body;
    }

}
