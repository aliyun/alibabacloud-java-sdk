// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCDiskChargeTypeResponseBody body;

    public static ModifyRCDiskChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDiskChargeTypeResponse self = new ModifyRCDiskChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCDiskChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCDiskChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCDiskChargeTypeResponse setBody(ModifyRCDiskChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCDiskChargeTypeResponseBody getBody() {
        return this.body;
    }

}
