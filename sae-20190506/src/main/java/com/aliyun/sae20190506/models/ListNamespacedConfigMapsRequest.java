// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespacedConfigMapsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListNamespacedConfigMapsQuery query;

    public static ListNamespacedConfigMapsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacedConfigMapsRequest self = new ListNamespacedConfigMapsRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespacedConfigMapsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNamespacedConfigMapsRequest setQuery(ListNamespacedConfigMapsQuery query) {
        this.query = query;
        return this;
    }
    public ListNamespacedConfigMapsQuery getQuery() {
        return this.query;
    }

}
