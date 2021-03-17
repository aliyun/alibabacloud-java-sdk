// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostGroupAccountsFromUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachHostGroupAccountsFromUserGroupResponseBody body;

    public static DetachHostGroupAccountsFromUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachHostGroupAccountsFromUserGroupResponse self = new DetachHostGroupAccountsFromUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public DetachHostGroupAccountsFromUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachHostGroupAccountsFromUserGroupResponse setBody(DetachHostGroupAccountsFromUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachHostGroupAccountsFromUserGroupResponseBody getBody() {
        return this.body;
    }

}
