// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasContainerWebDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSasContainerWebDefenseRuleResponseBody body;

    public static AddSasContainerWebDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSasContainerWebDefenseRuleResponse self = new AddSasContainerWebDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddSasContainerWebDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSasContainerWebDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSasContainerWebDefenseRuleResponse setBody(AddSasContainerWebDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSasContainerWebDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
