// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class ListComponentAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComponentAssetsResponseBody body;

    public static ListComponentAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComponentAssetsResponse self = new ListComponentAssetsResponse();
        return TeaModel.build(map, self);
    }

    public ListComponentAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComponentAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComponentAssetsResponse setBody(ListComponentAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComponentAssetsResponseBody getBody() {
        return this.body;
    }

}
