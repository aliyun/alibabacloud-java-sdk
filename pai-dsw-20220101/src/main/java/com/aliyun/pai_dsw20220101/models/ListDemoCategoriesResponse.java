// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListDemoCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDemoCategoriesResponseBody body;

    public static ListDemoCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDemoCategoriesResponse self = new ListDemoCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListDemoCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDemoCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDemoCategoriesResponse setBody(ListDemoCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDemoCategoriesResponseBody getBody() {
        return this.body;
    }

}
