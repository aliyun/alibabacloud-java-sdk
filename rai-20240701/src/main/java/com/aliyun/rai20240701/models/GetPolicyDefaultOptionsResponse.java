// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetPolicyDefaultOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolicyDefaultOptionsResponseBody body;

    public static GetPolicyDefaultOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyDefaultOptionsResponse self = new GetPolicyDefaultOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyDefaultOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyDefaultOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolicyDefaultOptionsResponse setBody(GetPolicyDefaultOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyDefaultOptionsResponseBody getBody() {
        return this.body;
    }

}
