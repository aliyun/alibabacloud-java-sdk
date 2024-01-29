// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMinorVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceMinorVersionResponseBody body;

    public static ModifyInstanceMinorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMinorVersionResponse self = new ModifyInstanceMinorVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMinorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMinorVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceMinorVersionResponse setBody(ModifyInstanceMinorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMinorVersionResponseBody getBody() {
        return this.body;
    }

}
