// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ListAssetCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssetCategoriesResponseBody body;

    public static ListAssetCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetCategoriesResponse self = new ListAssetCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetCategoriesResponse setBody(ListAssetCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetCategoriesResponseBody getBody() {
        return this.body;
    }

}
