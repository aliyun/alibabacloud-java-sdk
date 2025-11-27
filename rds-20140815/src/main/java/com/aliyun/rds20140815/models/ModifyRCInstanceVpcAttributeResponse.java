// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceVpcAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCInstanceVpcAttributeResponseBody body;

    public static ModifyRCInstanceVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceVpcAttributeResponse self = new ModifyRCInstanceVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceVpcAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCInstanceVpcAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCInstanceVpcAttributeResponse setBody(ModifyRCInstanceVpcAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCInstanceVpcAttributeResponseBody getBody() {
        return this.body;
    }

}
