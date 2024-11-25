// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCInstanceAttributeResponseBody body;

    public static ModifyRCInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceAttributeResponse self = new ModifyRCInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCInstanceAttributeResponse setBody(ModifyRCInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
