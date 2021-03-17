// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyHostGroupResponse setBody(ModifyHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostGroupResponseBody getBody() {
        return this.body;
    }

}
