// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWanSnatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySagWanSnatResponseBody body;

    public static ModifySagWanSnatResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWanSnatResponse self = new ModifySagWanSnatResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagWanSnatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagWanSnatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySagWanSnatResponse setBody(ModifySagWanSnatResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagWanSnatResponseBody getBody() {
        return this.body;
    }

}
