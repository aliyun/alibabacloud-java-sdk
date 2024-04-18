// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParameterVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecretParameterVersionsResponseBody body;

    public static ListSecretParameterVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecretParameterVersionsResponse self = new ListSecretParameterVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSecretParameterVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecretParameterVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecretParameterVersionsResponse setBody(ListSecretParameterVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecretParameterVersionsResponseBody getBody() {
        return this.body;
    }

}
