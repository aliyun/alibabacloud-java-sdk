// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateComponentTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ComponentTemplate body;

    public static UpdateComponentTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentTemplateResponse self = new UpdateComponentTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComponentTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComponentTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComponentTemplateResponse setBody(ComponentTemplate body) {
        this.body = body;
        return this;
    }
    public ComponentTemplate getBody() {
        return this.body;
    }

}
