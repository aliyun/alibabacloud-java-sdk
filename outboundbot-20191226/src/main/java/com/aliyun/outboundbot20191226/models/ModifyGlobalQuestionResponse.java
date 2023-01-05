// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyGlobalQuestionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGlobalQuestionResponseBody body;

    public static ModifyGlobalQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalQuestionResponse self = new ModifyGlobalQuestionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGlobalQuestionResponse setBody(ModifyGlobalQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalQuestionResponseBody getBody() {
        return this.body;
    }

}
