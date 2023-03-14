// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachHostAccountsToUserGroupResponseBody body;

    public static AttachHostAccountsToUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserGroupResponse self = new AttachHostAccountsToUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachHostAccountsToUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachHostAccountsToUserGroupResponse setBody(AttachHostAccountsToUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachHostAccountsToUserGroupResponseBody getBody() {
        return this.body;
    }

}
