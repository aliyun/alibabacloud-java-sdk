// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridCloudClusterRuleResponseBody body;

    public static ModifyHybridCloudClusterRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterRuleResponse self = new ModifyHybridCloudClusterRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridCloudClusterRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridCloudClusterRuleResponse setBody(ModifyHybridCloudClusterRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridCloudClusterRuleResponseBody getBody() {
        return this.body;
    }

}
