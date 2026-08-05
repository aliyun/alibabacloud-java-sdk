// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetTableFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableFieldsResponseBody body;

    public static GetTableFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableFieldsResponse self = new GetTableFieldsResponse();
        return TeaModel.build(map, self);
    }

    public GetTableFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableFieldsResponse setBody(GetTableFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableFieldsResponseBody getBody() {
        return this.body;
    }

}
