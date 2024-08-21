// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCInstanceChargeTypeResponseBody body;

    public static ModifyRCInstanceChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceChargeTypeResponse self = new ModifyRCInstanceChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCInstanceChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCInstanceChargeTypeResponse setBody(ModifyRCInstanceChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCInstanceChargeTypeResponseBody getBody() {
        return this.body;
    }

}
