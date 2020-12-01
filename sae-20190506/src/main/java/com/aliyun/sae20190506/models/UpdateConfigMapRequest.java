// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public UpdateConfigMapQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConfigMapBody body;

    public static UpdateConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigMapRequest self = new UpdateConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigMapRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigMapRequest setQuery(UpdateConfigMapQuery query) {
        this.query = query;
        return this;
    }
    public UpdateConfigMapQuery getQuery() {
        return this.query;
    }

    public UpdateConfigMapRequest setBody(UpdateConfigMapBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigMapBody getBody() {
        return this.body;
    }

}
