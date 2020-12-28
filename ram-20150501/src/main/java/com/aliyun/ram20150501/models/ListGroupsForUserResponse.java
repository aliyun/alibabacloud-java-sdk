// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListGroupsForUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupsForUserResponseBody body;

    public static ListGroupsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserResponse self = new ListGroupsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupsForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupsForUserResponse setBody(ListGroupsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupsForUserResponseBody getBody() {
        return this.body;
    }

}
