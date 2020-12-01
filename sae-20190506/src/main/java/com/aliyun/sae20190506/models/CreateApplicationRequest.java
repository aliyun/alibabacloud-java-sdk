// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public CreateApplicationQuery query;

    @NameInMap("body")
    public CreateApplicationBody body;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationRequest setQuery(CreateApplicationQuery query) {
        this.query = query;
        return this;
    }
    public CreateApplicationQuery getQuery() {
        return this.query;
    }

    public CreateApplicationRequest setBody(CreateApplicationBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationBody getBody() {
        return this.body;
    }

}
