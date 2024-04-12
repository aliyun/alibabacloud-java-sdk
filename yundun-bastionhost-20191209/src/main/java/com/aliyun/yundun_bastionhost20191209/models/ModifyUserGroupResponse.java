// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserGroupResponseBody body;

    public static ModifyUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserGroupResponse self = new ModifyUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserGroupResponse setBody(ModifyUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserGroupResponseBody getBody() {
        return this.body;
    }

}
