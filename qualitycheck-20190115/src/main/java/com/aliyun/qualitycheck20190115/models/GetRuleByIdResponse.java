// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRuleByIdResponseBody body;

    public static GetRuleByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleByIdResponse self = new GetRuleByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuleByIdResponse setBody(GetRuleByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleByIdResponseBody getBody() {
        return this.body;
    }

}
