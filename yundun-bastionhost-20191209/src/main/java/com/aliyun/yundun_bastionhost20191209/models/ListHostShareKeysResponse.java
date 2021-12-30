// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostShareKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListHostShareKeysResponse setBody(ListHostShareKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostShareKeysResponseBody getBody() {
        return this.body;
    }

}
