// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsForUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHostAccountsForUserGroupResponseBody body;

    public static ListHostAccountsForUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsForUserGroupResponse self = new ListHostAccountsForUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsForUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostAccountsForUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostAccountsForUserGroupResponse setBody(ListHostAccountsForUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostAccountsForUserGroupResponseBody getBody() {
        return this.body;
    }

}
