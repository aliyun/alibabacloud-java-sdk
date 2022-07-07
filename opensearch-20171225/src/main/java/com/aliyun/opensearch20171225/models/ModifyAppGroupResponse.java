// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAppGroupResponseBody body;

    public static ModifyAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppGroupResponse self = new ModifyAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppGroupResponse setBody(ModifyAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppGroupResponseBody getBody() {
        return this.body;
    }

}
