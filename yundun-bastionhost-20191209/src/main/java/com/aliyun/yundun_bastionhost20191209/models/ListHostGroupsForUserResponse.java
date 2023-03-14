// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsForUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostGroupsForUserResponseBody body;

    public static ListHostGroupsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsForUserResponse self = new ListHostGroupsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostGroupsForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostGroupsForUserResponse setBody(ListHostGroupsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostGroupsForUserResponseBody getBody() {
        return this.body;
    }

}
