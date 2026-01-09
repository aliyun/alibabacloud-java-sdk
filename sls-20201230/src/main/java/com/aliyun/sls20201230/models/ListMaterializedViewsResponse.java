// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMaterializedViewsResponseBody body;

    public static ListMaterializedViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMaterializedViewsResponse self = new ListMaterializedViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListMaterializedViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMaterializedViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMaterializedViewsResponse setBody(ListMaterializedViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMaterializedViewsResponseBody getBody() {
        return this.body;
    }

}
