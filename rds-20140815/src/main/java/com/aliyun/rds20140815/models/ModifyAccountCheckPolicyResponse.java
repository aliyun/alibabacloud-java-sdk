// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountCheckPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountCheckPolicyResponseBody body;

    public static ModifyAccountCheckPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountCheckPolicyResponse self = new ModifyAccountCheckPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountCheckPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountCheckPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountCheckPolicyResponse setBody(ModifyAccountCheckPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountCheckPolicyResponseBody getBody() {
        return this.body;
    }

}
