// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserPublicKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
