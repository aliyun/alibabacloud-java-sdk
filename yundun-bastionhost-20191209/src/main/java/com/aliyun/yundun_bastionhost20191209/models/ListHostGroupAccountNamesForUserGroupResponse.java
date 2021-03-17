// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupAccountNamesForUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostGroupAccountNamesForUserGroupResponseBody body;

    public static ListHostGroupAccountNamesForUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupAccountNamesForUserGroupResponse self = new ListHostGroupAccountNamesForUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListHostGroupAccountNamesForUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostGroupAccountNamesForUserGroupResponse setBody(ListHostGroupAccountNamesForUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostGroupAccountNamesForUserGroupResponseBody getBody() {
        return this.body;
    }

}
