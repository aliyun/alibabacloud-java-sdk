// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGroupResponseBody body;

    public static ModifyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupResponse self = new ModifyGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGroupResponse setBody(ModifyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGroupResponseBody getBody() {
        return this.body;
    }

}
