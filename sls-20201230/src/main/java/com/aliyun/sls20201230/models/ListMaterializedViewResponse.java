// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMaterializedViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMaterializedViewResponseBody body;

    public static ListMaterializedViewResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMaterializedViewResponse self = new ListMaterializedViewResponse();
        return TeaModel.build(map, self);
    }

    public ListMaterializedViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMaterializedViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMaterializedViewResponse setBody(ListMaterializedViewResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMaterializedViewResponseBody getBody() {
        return this.body;
    }

}
