// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandPlanListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUrgentDemandPlanListResponseBody body;

    public static GetUrgentDemandPlanListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandPlanListResponse self = new GetUrgentDemandPlanListResponse();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandPlanListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUrgentDemandPlanListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUrgentDemandPlanListResponse setBody(GetUrgentDemandPlanListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUrgentDemandPlanListResponseBody getBody() {
        return this.body;
    }

}
