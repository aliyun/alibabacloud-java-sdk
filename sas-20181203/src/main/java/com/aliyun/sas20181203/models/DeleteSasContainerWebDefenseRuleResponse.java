// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSasContainerWebDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSasContainerWebDefenseRuleResponseBody body;

    public static DeleteSasContainerWebDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSasContainerWebDefenseRuleResponse self = new DeleteSasContainerWebDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSasContainerWebDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSasContainerWebDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSasContainerWebDefenseRuleResponse setBody(DeleteSasContainerWebDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSasContainerWebDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
