// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteIngressRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DeleteIngressQuery query;

    public static DeleteIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIngressRequest self = new DeleteIngressRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIngressRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIngressRequest setQuery(DeleteIngressQuery query) {
        this.query = query;
        return this;
    }
    public DeleteIngressQuery getQuery() {
        return this.query;
    }

}
