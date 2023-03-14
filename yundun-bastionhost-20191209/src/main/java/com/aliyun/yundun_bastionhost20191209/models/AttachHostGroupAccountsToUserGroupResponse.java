// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachHostGroupAccountsToUserGroupResponseBody body;

    public static AttachHostGroupAccountsToUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserGroupResponse self = new AttachHostGroupAccountsToUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachHostGroupAccountsToUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachHostGroupAccountsToUserGroupResponse setBody(AttachHostGroupAccountsToUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachHostGroupAccountsToUserGroupResponseBody getBody() {
        return this.body;
    }

}
