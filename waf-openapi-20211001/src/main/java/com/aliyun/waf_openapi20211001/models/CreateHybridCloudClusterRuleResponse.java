// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateHybridCloudClusterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHybridCloudClusterRuleResponseBody body;

    public static CreateHybridCloudClusterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridCloudClusterRuleResponse self = new CreateHybridCloudClusterRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridCloudClusterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridCloudClusterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHybridCloudClusterRuleResponse setBody(CreateHybridCloudClusterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridCloudClusterRuleResponseBody getBody() {
        return this.body;
    }

}
