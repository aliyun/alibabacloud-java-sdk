// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateResourceRuleItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceRuleItemResponseBody body;

    public static CreateResourceRuleItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRuleItemResponse self = new CreateResourceRuleItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceRuleItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceRuleItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceRuleItemResponse setBody(CreateResourceRuleItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceRuleItemResponseBody getBody() {
        return this.body;
    }

}
