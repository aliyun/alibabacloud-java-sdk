// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListSecretParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSecretParametersResponse setBody(ListSecretParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecretParametersResponseBody getBody() {
        return this.body;
    }

}
