// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public UpdateIngressQuery query;

    @NameInMap("body")
    public UpdateIngressBody body;

    public static UpdateIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIngressRequest self = new UpdateIngressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIngressRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIngressRequest setQuery(UpdateIngressQuery query) {
        this.query = query;
        return this;
    }
    public UpdateIngressQuery getQuery() {
        return this.query;
    }

    public UpdateIngressRequest setBody(UpdateIngressBody body) {
        this.body = body;
        return this;
    }
    public UpdateIngressBody getBody() {
        return this.body;
    }

}
