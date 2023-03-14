// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsForUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostGroupsForUserGroupResponseBody body;

    public static ListHostGroupsForUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsForUserGroupResponse self = new ListHostGroupsForUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsForUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostGroupsForUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostGroupsForUserGroupResponse setBody(ListHostGroupsForUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostGroupsForUserGroupResponseBody getBody() {
        return this.body;
    }

}
