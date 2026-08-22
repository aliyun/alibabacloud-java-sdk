// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyOpenSearchWhitelistGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOpenSearchWhitelistGroupResponseBody body;

    public static ModifyOpenSearchWhitelistGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenSearchWhitelistGroupResponse self = new ModifyOpenSearchWhitelistGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOpenSearchWhitelistGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOpenSearchWhitelistGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOpenSearchWhitelistGroupResponse setBody(ModifyOpenSearchWhitelistGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOpenSearchWhitelistGroupResponseBody getBody() {
        return this.body;
    }

}
