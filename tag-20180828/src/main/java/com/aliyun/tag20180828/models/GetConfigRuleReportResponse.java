// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetConfigRuleReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConfigRuleReportResponseBody body;

    public static GetConfigRuleReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleReportResponse self = new GetConfigRuleReportResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigRuleReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigRuleReportResponse setBody(GetConfigRuleReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigRuleReportResponseBody getBody() {
        return this.body;
    }

}
