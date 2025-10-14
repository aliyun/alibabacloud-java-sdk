// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCdcClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCdcClassResponseBody body;

    public static ModifyCdcClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdcClassResponse self = new ModifyCdcClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdcClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdcClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCdcClassResponse setBody(ModifyCdcClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdcClassResponseBody getBody() {
        return this.body;
    }

}
