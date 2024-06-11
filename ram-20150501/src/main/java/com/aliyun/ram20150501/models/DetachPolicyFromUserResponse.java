// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachPolicyFromUserResponseBody body;

    public static DetachPolicyFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromUserResponse self = new DetachPolicyFromUserResponse();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachPolicyFromUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachPolicyFromUserResponse setBody(DetachPolicyFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachPolicyFromUserResponseBody getBody() {
        return this.body;
    }

}
