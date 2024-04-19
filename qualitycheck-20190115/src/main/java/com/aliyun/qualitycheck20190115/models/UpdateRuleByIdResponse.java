// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRuleByIdResponseBody body;

    public static UpdateRuleByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleByIdResponse self = new UpdateRuleByIdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRuleByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRuleByIdResponse setBody(UpdateRuleByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleByIdResponseBody getBody() {
        return this.body;
    }

}
