// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParameterVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSecretParameterVersionsResponse setBody(ListSecretParameterVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecretParameterVersionsResponseBody getBody() {
        return this.body;
    }

}
