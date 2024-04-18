// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SearchInventoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchInventoryResponseBody body;

    public static SearchInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryResponse self = new SearchInventoryResponse();
        return TeaModel.build(map, self);
    }

    public SearchInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchInventoryResponse setBody(SearchInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchInventoryResponseBody getBody() {
        return this.body;
    }

}
