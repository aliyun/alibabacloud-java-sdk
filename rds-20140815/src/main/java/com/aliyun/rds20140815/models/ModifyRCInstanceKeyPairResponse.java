// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCInstanceKeyPairResponseBody body;

    public static ModifyRCInstanceKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceKeyPairResponse self = new ModifyRCInstanceKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCInstanceKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCInstanceKeyPairResponse setBody(ModifyRCInstanceKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCInstanceKeyPairResponseBody getBody() {
        return this.body;
    }

}
