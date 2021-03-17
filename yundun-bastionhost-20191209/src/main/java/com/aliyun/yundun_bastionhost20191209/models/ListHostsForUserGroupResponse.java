// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostsForUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostsForUserGroupResponseBody body;

    public static ListHostsForUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostsForUserGroupResponse self = new ListHostsForUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListHostsForUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostsForUserGroupResponse setBody(ListHostsForUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostsForUserGroupResponseBody getBody() {
        return this.body;
    }

}
