// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddRuleV4Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRuleV4ResponseBody body;

    public static AddRuleV4Response build(java.util.Map<String, ?> map) throws Exception {
        AddRuleV4Response self = new AddRuleV4Response();
        return TeaModel.build(map, self);
    }

    public AddRuleV4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRuleV4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRuleV4Response setBody(AddRuleV4ResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRuleV4ResponseBody getBody() {
        return this.body;
    }

}
