// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckRiskStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCheckRiskStatisticsResponseBody body;

    public static GetCheckRiskStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckRiskStatisticsResponse self = new GetCheckRiskStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckRiskStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckRiskStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckRiskStatisticsResponse setBody(GetCheckRiskStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckRiskStatisticsResponseBody getBody() {
        return this.body;
    }

}
