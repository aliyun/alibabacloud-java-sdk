// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCDiskAttributeResponseBody body;

    public static ModifyRCDiskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDiskAttributeResponse self = new ModifyRCDiskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCDiskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCDiskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCDiskAttributeResponse setBody(ModifyRCDiskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCDiskAttributeResponseBody getBody() {
        return this.body;
    }

}
