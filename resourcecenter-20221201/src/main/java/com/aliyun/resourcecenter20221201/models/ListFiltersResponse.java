// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListFiltersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFiltersResponseBody body;

    public static ListFiltersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFiltersResponse self = new ListFiltersResponse();
        return TeaModel.build(map, self);
    }

    public ListFiltersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFiltersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFiltersResponse setBody(ListFiltersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFiltersResponseBody getBody() {
        return this.body;
    }

}
