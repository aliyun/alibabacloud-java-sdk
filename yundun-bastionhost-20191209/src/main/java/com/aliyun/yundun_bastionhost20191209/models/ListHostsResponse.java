// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostsResponseBody body;

    public static ListHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostsResponse self = new ListHostsResponse();
        return TeaModel.build(map, self);
    }

    public ListHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostsResponse setBody(ListHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostsResponseBody getBody() {
        return this.body;
    }

}
