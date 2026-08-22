// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyOpenSearchAccessProtocolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOpenSearchAccessProtocolResponseBody body;

    public static ModifyOpenSearchAccessProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenSearchAccessProtocolResponse self = new ModifyOpenSearchAccessProtocolResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOpenSearchAccessProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOpenSearchAccessProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOpenSearchAccessProtocolResponse setBody(ModifyOpenSearchAccessProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOpenSearchAccessProtocolResponseBody getBody() {
        return this.body;
    }

}
