// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSasContainerWebDefenseRuleResponseBody body;

    public static GetSasContainerWebDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleResponse self = new GetSasContainerWebDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSasContainerWebDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSasContainerWebDefenseRuleResponse setBody(GetSasContainerWebDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSasContainerWebDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
