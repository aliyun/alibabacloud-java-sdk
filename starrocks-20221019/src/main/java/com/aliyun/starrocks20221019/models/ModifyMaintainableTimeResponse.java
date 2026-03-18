// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyMaintainableTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMaintainableTimeResponseBody body;

    public static ModifyMaintainableTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaintainableTimeResponse self = new ModifyMaintainableTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaintainableTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaintainableTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMaintainableTimeResponse setBody(ModifyMaintainableTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaintainableTimeResponseBody getBody() {
        return this.body;
    }

}
