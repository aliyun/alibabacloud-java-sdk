// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateConfigMapRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public CreateConfigMapQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConfigMapBody body;

    public static CreateConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigMapRequest self = new CreateConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigMapRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigMapRequest setQuery(CreateConfigMapQuery query) {
        this.query = query;
        return this;
    }
    public CreateConfigMapQuery getQuery() {
        return this.query;
    }

    public CreateConfigMapRequest setBody(CreateConfigMapBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigMapBody getBody() {
        return this.body;
    }

}
