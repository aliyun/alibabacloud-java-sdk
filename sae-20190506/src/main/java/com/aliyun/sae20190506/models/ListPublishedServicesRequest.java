// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListPublishedServicesRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ListPublishedServicesQuery query;

    public static ListPublishedServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedServicesRequest self = new ListPublishedServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedServicesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedServicesRequest setQuery(ListPublishedServicesQuery query) {
        this.query = query;
        return this;
    }
    public ListPublishedServicesQuery getQuery() {
        return this.query;
    }

}
