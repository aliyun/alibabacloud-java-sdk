// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListClothesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClothesResponseBody body;

    public static ListClothesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClothesResponse self = new ListClothesResponse();
        return TeaModel.build(map, self);
    }

    public ListClothesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClothesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClothesResponse setBody(ListClothesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClothesResponseBody getBody() {
        return this.body;
    }

}
