// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetPolicyEnableStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolicyEnableStatusResponseBody body;

    public static GetPolicyEnableStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyEnableStatusResponse self = new GetPolicyEnableStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyEnableStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyEnableStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolicyEnableStatusResponse setBody(GetPolicyEnableStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyEnableStatusResponseBody getBody() {
        return this.body;
    }

}
