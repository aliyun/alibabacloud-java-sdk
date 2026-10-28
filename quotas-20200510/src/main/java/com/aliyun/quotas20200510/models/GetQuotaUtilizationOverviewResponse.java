// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaUtilizationOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQuotaUtilizationOverviewResponseBody body;

    public static GetQuotaUtilizationOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaUtilizationOverviewResponse self = new GetQuotaUtilizationOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaUtilizationOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaUtilizationOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaUtilizationOverviewResponse setBody(GetQuotaUtilizationOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaUtilizationOverviewResponseBody getBody() {
        return this.body;
    }

}
