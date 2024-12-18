// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class EnDisableScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnDisableScalingRulesResponseBody body;

    public static EnDisableScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        EnDisableScalingRulesResponse self = new EnDisableScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public EnDisableScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnDisableScalingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnDisableScalingRulesResponse setBody(EnDisableScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnDisableScalingRulesResponseBody getBody() {
        return this.body;
    }

}
