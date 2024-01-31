// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceCatalogResponseBody body;

    public static ListInstanceCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceCatalogResponse self = new ListInstanceCatalogResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceCatalogResponse setBody(ListInstanceCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceCatalogResponseBody getBody() {
        return this.body;
    }

}
