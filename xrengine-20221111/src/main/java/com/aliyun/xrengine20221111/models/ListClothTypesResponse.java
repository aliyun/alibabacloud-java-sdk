// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListClothTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClothTypesResponseBody body;

    public static ListClothTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClothTypesResponse self = new ListClothTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListClothTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClothTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClothTypesResponse setBody(ListClothTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClothTypesResponseBody getBody() {
        return this.body;
    }

}
