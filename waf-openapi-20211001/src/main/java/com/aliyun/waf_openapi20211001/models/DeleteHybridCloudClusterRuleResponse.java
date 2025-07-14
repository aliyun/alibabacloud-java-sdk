// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteHybridCloudClusterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHybridCloudClusterRuleResponseBody body;

    public static DeleteHybridCloudClusterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridCloudClusterRuleResponse self = new DeleteHybridCloudClusterRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHybridCloudClusterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHybridCloudClusterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHybridCloudClusterRuleResponse setBody(DeleteHybridCloudClusterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHybridCloudClusterRuleResponseBody getBody() {
        return this.body;
    }

}
