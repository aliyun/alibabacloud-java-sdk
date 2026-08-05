// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListFunctionRestrictionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFunctionRestrictionsResponseBody body;

    public static ListFunctionRestrictionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionRestrictionsResponse self = new ListFunctionRestrictionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionRestrictionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionRestrictionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionRestrictionsResponse setBody(ListFunctionRestrictionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionRestrictionsResponseBody getBody() {
        return this.body;
    }

}
