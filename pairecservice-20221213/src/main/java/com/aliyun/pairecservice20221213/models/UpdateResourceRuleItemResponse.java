// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateResourceRuleItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceRuleItemResponseBody body;

    public static UpdateResourceRuleItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRuleItemResponse self = new UpdateResourceRuleItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRuleItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceRuleItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceRuleItemResponse setBody(UpdateResourceRuleItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceRuleItemResponseBody getBody() {
        return this.body;
    }

}
