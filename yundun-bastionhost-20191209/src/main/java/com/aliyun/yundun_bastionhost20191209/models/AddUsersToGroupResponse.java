// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddUsersToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUsersToGroupResponseBody body;

    public static AddUsersToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUsersToGroupResponse self = new AddUsersToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddUsersToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUsersToGroupResponse setBody(AddUsersToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUsersToGroupResponseBody getBody() {
        return this.body;
    }

}
