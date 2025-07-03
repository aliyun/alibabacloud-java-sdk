// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppAgentFunctionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppAgentFunctionStatusResponseBody body;

    public static ModifyAppAgentFunctionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppAgentFunctionStatusResponse self = new ModifyAppAgentFunctionStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppAgentFunctionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppAgentFunctionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppAgentFunctionStatusResponse setBody(ModifyAppAgentFunctionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppAgentFunctionStatusResponseBody getBody() {
        return this.body;
    }

}
