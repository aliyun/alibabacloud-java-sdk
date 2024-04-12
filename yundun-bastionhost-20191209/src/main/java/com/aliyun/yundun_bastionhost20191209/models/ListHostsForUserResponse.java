// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListHostsForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostsForUserResponse setBody(ListHostsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostsForUserResponseBody getBody() {
        return this.body;
    }

}
