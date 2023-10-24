// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListContainerDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListContainerDefenseRuleResponseBody body;

    public static ListContainerDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContainerDefenseRuleResponse self = new ListContainerDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListContainerDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContainerDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContainerDefenseRuleResponse setBody(ListContainerDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContainerDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
