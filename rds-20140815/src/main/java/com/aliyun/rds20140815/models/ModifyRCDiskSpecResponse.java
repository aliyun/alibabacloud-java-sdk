// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCDiskSpecResponseBody body;

    public static ModifyRCDiskSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDiskSpecResponse self = new ModifyRCDiskSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCDiskSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCDiskSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCDiskSpecResponse setBody(ModifyRCDiskSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCDiskSpecResponseBody getBody() {
        return this.body;
    }

}
