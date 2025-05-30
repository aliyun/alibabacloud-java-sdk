// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandPlanDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUrgentDemandPlanDetailResponseBody body;

    public static GetUrgentDemandPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandPlanDetailResponse self = new GetUrgentDemandPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandPlanDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUrgentDemandPlanDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUrgentDemandPlanDetailResponse setBody(GetUrgentDemandPlanDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUrgentDemandPlanDetailResponseBody getBody() {
        return this.body;
    }

}
