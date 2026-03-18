// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifySpecTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySpecTypeResponseBody body;

    public static ModifySpecTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySpecTypeResponse self = new ModifySpecTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySpecTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySpecTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySpecTypeResponse setBody(ModifySpecTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySpecTypeResponseBody getBody() {
        return this.body;
    }

}
