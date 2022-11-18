// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyQosCarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyQosCarResponseBody body;

    public static ModifyQosCarResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosCarResponse self = new ModifyQosCarResponse();
        return TeaModel.build(map, self);
    }

    public ModifyQosCarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyQosCarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyQosCarResponse setBody(ModifyQosCarResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyQosCarResponseBody getBody() {
        return this.body;
    }

}
