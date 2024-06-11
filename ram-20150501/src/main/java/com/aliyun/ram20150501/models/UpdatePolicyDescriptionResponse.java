// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdatePolicyDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePolicyDescriptionResponseBody body;

    public static UpdatePolicyDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyDescriptionResponse self = new UpdatePolicyDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolicyDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolicyDescriptionResponse setBody(UpdatePolicyDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolicyDescriptionResponseBody getBody() {
        return this.body;
    }

}
