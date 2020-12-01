// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteConfigMapRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DeleteConfigMapQuery query;

    public static DeleteConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigMapRequest self = new DeleteConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigMapRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigMapRequest setQuery(DeleteConfigMapQuery query) {
        this.query = query;
        return this;
    }
    public DeleteConfigMapQuery getQuery() {
        return this.query;
    }

}
