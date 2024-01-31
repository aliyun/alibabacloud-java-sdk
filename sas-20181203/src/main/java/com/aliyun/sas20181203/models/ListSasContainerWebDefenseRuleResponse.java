// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSasContainerWebDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSasContainerWebDefenseRuleResponseBody body;

    public static ListSasContainerWebDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSasContainerWebDefenseRuleResponse self = new ListSasContainerWebDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListSasContainerWebDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSasContainerWebDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSasContainerWebDefenseRuleResponse setBody(ListSasContainerWebDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSasContainerWebDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
