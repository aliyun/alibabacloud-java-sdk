// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataSourceResponseBody body;

    public static ListDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceResponse self = new ListDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceResponse setBody(ListDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceResponseBody getBody() {
        return this.body;
    }

}
