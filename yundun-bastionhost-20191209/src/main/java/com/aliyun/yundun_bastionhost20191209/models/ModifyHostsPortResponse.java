// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsPortResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHostsPortResponseBody body;

    public static ModifyHostsPortResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsPortResponse self = new ModifyHostsPortResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostsPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostsPortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHostsPortResponse setBody(ModifyHostsPortResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostsPortResponseBody getBody() {
        return this.body;
    }

}
