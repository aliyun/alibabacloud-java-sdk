// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyMPULayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMPULayoutResponseBody body;

    public static ModifyMPULayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMPULayoutResponse self = new ModifyMPULayoutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMPULayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMPULayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMPULayoutResponse setBody(ModifyMPULayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMPULayoutResponseBody getBody() {
        return this.body;
    }

}
