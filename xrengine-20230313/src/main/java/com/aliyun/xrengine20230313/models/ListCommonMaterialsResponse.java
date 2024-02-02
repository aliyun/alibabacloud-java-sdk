// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListCommonMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCommonMaterialsResponseBody body;

    public static ListCommonMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCommonMaterialsResponse self = new ListCommonMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public ListCommonMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCommonMaterialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCommonMaterialsResponse setBody(ListCommonMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCommonMaterialsResponseBody getBody() {
        return this.body;
    }

}
