// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GenerateConfigRuleReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateConfigRuleReportResponseBody body;

    public static GenerateConfigRuleReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateConfigRuleReportResponse self = new GenerateConfigRuleReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateConfigRuleReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateConfigRuleReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateConfigRuleReportResponse setBody(GenerateConfigRuleReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateConfigRuleReportResponseBody getBody() {
        return this.body;
    }

}
