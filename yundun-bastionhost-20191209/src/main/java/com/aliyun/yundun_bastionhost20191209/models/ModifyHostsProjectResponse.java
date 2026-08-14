// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHostsProjectResponseBody body;

    public static ModifyHostsProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsProjectResponse self = new ModifyHostsProjectResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostsProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostsProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHostsProjectResponse setBody(ModifyHostsProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostsProjectResponseBody getBody() {
        return this.body;
    }

}
