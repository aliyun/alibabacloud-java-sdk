// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceConfigPreCheckResponseBody body;

    public static ModifyInstanceConfigPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceConfigPreCheckResponse self = new ModifyInstanceConfigPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceConfigPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceConfigPreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceConfigPreCheckResponse setBody(ModifyInstanceConfigPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceConfigPreCheckResponseBody getBody() {
        return this.body;
    }

}
