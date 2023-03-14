// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserPublicKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserPublicKeysResponseBody body;

    public static ListUserPublicKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPublicKeysResponse self = new ListUserPublicKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPublicKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPublicKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserPublicKeysResponse setBody(ListUserPublicKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPublicKeysResponseBody getBody() {
        return this.body;
    }

}
