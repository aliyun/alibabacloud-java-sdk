// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListUserGroupsByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserGroupsByUserIdResponseBody body;

    public static ListUserGroupsByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsByUserIdResponse self = new ListUserGroupsByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGroupsByUserIdResponse setBody(ListUserGroupsByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGroupsByUserIdResponseBody getBody() {
        return this.body;
    }

}
