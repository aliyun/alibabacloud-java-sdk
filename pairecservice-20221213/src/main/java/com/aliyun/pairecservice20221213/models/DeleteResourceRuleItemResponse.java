// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteResourceRuleItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceRuleItemResponseBody body;

    public static DeleteResourceRuleItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRuleItemResponse self = new DeleteResourceRuleItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRuleItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceRuleItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceRuleItemResponse setBody(DeleteResourceRuleItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceRuleItemResponseBody getBody() {
        return this.body;
    }

}
