// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class DeleteDataMaskingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataMaskingRuleResponseBody body;

    public static DeleteDataMaskingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataMaskingRuleResponse self = new DeleteDataMaskingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataMaskingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataMaskingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataMaskingRuleResponse setBody(DeleteDataMaskingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataMaskingRuleResponseBody getBody() {
        return this.body;
    }

}
