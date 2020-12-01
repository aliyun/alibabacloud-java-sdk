// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public CreateIngressQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIngressBody body;

    public static CreateIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressRequest self = new CreateIngressRequest();
        return TeaModel.build(map, self);
    }

    public CreateIngressRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIngressRequest setQuery(CreateIngressQuery query) {
        this.query = query;
        return this;
    }
    public CreateIngressQuery getQuery() {
        return this.query;
    }

    public CreateIngressRequest setBody(CreateIngressBody body) {
        this.body = body;
        return this;
    }
    public CreateIngressBody getBody() {
        return this.body;
    }

}
