// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddProjectResponseBody body;

    public static AddProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProjectResponse self = new AddProjectResponse();
        return TeaModel.build(map, self);
    }

    public AddProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProjectResponse setBody(AddProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProjectResponseBody getBody() {
        return this.body;
    }

}
