// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleV4Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRuleV4ResponseBody body;

    public static UpdateRuleV4Response build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleV4Response self = new UpdateRuleV4Response();
        return TeaModel.build(map, self);
    }

    public UpdateRuleV4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleV4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRuleV4Response setBody(UpdateRuleV4ResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleV4ResponseBody getBody() {
        return this.body;
    }

}
