// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyRenderingInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRenderingInstanceAttributeResponseBody body;

    public static ModifyRenderingInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRenderingInstanceAttributeResponse self = new ModifyRenderingInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRenderingInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRenderingInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRenderingInstanceAttributeResponse setBody(ModifyRenderingInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRenderingInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
