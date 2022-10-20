// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadRuleResponseBody body;

    public static UploadRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadRuleResponse self = new UploadRuleResponse();
        return TeaModel.build(map, self);
    }

    public UploadRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadRuleResponse setBody(UploadRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadRuleResponseBody getBody() {
        return this.body;
    }

}
