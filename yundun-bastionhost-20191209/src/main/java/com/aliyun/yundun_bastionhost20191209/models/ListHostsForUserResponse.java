// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostsForUserResponseBody body;

    public static ListHostsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostsForUserResponse self = new ListHostsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListHostsForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostsForUserResponse setBody(ListHostsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostsForUserResponseBody getBody() {
        return this.body;
    }

}
