// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleV4Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRuleV4ResponseBody body;

    public static GetRuleV4Response build(java.util.Map<String, ?> map) throws Exception {
        GetRuleV4Response self = new GetRuleV4Response();
        return TeaModel.build(map, self);
    }

    public GetRuleV4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleV4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuleV4Response setBody(GetRuleV4ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleV4ResponseBody getBody() {
        return this.body;
    }

}
