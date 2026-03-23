// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationPromptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationPromptResponseBody body;

    public static ModifyApplicationPromptResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationPromptResponse self = new ModifyApplicationPromptResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationPromptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationPromptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationPromptResponse setBody(ModifyApplicationPromptResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationPromptResponseBody getBody() {
        return this.body;
    }

}
