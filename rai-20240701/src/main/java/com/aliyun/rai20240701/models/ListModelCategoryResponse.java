// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListModelCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelCategoryResponseBody body;

    public static ListModelCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelCategoryResponse self = new ListModelCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListModelCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelCategoryResponse setBody(ListModelCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelCategoryResponseBody getBody() {
        return this.body;
    }

}
