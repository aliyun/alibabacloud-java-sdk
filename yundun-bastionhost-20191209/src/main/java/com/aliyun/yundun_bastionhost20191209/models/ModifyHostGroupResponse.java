// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHostGroupResponseBody body;

    public static ModifyHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostGroupResponse self = new ModifyHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHostGroupResponse setBody(ModifyHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostGroupResponseBody getBody() {
        return this.body;
    }

}
