// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateDeveloperResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Developer body;

    public static UpdateDeveloperResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeveloperResponse self = new UpdateDeveloperResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeveloperResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeveloperResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeveloperResponse setBody(Developer body) {
        this.body = body;
        return this;
    }
    public Developer getBody() {
        return this.body;
    }

}
