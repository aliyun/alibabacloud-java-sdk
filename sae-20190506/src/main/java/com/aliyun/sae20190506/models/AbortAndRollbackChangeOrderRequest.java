// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public AbortAndRollbackChangeOrderQuery query;

    public static AbortAndRollbackChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortAndRollbackChangeOrderRequest self = new AbortAndRollbackChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public AbortAndRollbackChangeOrderRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortAndRollbackChangeOrderRequest setQuery(AbortAndRollbackChangeOrderQuery query) {
        this.query = query;
        return this;
    }
    public AbortAndRollbackChangeOrderQuery getQuery() {
        return this.query;
    }

}
