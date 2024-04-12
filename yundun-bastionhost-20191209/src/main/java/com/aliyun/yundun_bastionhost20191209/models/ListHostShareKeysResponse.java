// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostShareKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHostShareKeysResponseBody body;

    public static ListHostShareKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostShareKeysResponse self = new ListHostShareKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListHostShareKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostShareKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostShareKeysResponse setBody(ListHostShareKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostShareKeysResponseBody getBody() {
        return this.body;
    }

}
