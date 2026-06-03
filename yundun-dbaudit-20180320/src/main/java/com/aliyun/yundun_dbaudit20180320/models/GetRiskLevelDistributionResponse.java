// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRiskLevelDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskLevelDistributionResponseBody body;

    public static GetRiskLevelDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskLevelDistributionResponse self = new GetRiskLevelDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskLevelDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskLevelDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskLevelDistributionResponse setBody(GetRiskLevelDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskLevelDistributionResponseBody getBody() {
        return this.body;
    }

}
