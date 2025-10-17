// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountPasswordZonalResponseBody body;

    public static ModifyAccountPasswordZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordZonalResponse self = new ModifyAccountPasswordZonalResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPasswordZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountPasswordZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountPasswordZonalResponse setBody(ModifyAccountPasswordZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountPasswordZonalResponseBody getBody() {
        return this.body;
    }

}
