// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserGroupsResponseBody body;

    public static ListUserGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsResponse self = new ListUserGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGroupsResponse setBody(ListUserGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGroupsResponseBody getBody() {
        return this.body;
    }

}
