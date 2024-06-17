// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPausePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPausePolicyResponseBody body;

    public static ModifyPausePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPausePolicyResponse self = new ModifyPausePolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPausePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPausePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPausePolicyResponse setBody(ModifyPausePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPausePolicyResponseBody getBody() {
        return this.body;
    }

}
