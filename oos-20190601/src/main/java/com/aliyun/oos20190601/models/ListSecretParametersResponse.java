// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecretParametersResponseBody body;

    public static ListSecretParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecretParametersResponse self = new ListSecretParametersResponse();
        return TeaModel.build(map, self);
    }

    public ListSecretParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecretParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecretParametersResponse setBody(ListSecretParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecretParametersResponseBody getBody() {
        return this.body;
    }

}
