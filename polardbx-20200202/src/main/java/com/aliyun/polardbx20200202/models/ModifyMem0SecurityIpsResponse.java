// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyMem0SecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMem0SecurityIpsResponseBody body;

    public static ModifyMem0SecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMem0SecurityIpsResponse self = new ModifyMem0SecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMem0SecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMem0SecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMem0SecurityIpsResponse setBody(ModifyMem0SecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMem0SecurityIpsResponseBody getBody() {
        return this.body;
    }

}
