// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachHostAccountsFromUserGroupResponseBody body;

    public static DetachHostAccountsFromUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromUserGroupResponse self = new DetachHostAccountsFromUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachHostAccountsFromUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachHostAccountsFromUserGroupResponse setBody(DetachHostAccountsFromUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachHostAccountsFromUserGroupResponseBody getBody() {
        return this.body;
    }

}
