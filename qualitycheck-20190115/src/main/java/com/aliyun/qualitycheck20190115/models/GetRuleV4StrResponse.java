// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleV4StrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRuleV4StrResponseBody body;

    public static GetRuleV4StrResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleV4StrResponse self = new GetRuleV4StrResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleV4StrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleV4StrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuleV4StrResponse setBody(GetRuleV4StrResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleV4StrResponseBody getBody() {
        return this.body;
    }

}
