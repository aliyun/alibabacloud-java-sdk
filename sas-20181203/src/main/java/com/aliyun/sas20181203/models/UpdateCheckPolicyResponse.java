// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCheckPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCheckPolicyResponseBody body;

    public static UpdateCheckPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckPolicyResponse self = new UpdateCheckPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCheckPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCheckPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCheckPolicyResponse setBody(UpdateCheckPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCheckPolicyResponseBody getBody() {
        return this.body;
    }

}
