// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagLanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySagLanResponseBody body;

    public static ModifySagLanResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagLanResponse self = new ModifySagLanResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagLanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagLanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySagLanResponse setBody(ModifySagLanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagLanResponseBody getBody() {
        return this.body;
    }

}
