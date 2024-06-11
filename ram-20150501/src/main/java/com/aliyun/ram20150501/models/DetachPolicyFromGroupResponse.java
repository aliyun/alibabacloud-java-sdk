// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachPolicyFromGroupResponseBody body;

    public static DetachPolicyFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromGroupResponse self = new DetachPolicyFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachPolicyFromGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachPolicyFromGroupResponse setBody(DetachPolicyFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachPolicyFromGroupResponseBody getBody() {
        return this.body;
    }

}
