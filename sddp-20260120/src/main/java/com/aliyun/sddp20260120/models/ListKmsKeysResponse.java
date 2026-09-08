// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListKmsKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKmsKeysResponseBody body;

    public static ListKmsKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKmsKeysResponse self = new ListKmsKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListKmsKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKmsKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKmsKeysResponse setBody(ListKmsKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKmsKeysResponseBody getBody() {
        return this.body;
    }

}
