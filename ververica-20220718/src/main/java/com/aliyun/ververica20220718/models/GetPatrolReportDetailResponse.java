// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPatrolReportDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPatrolReportDetailResponseBody body;

    public static GetPatrolReportDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolReportDetailResponse self = new GetPatrolReportDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetPatrolReportDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatrolReportDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPatrolReportDetailResponse setBody(GetPatrolReportDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatrolReportDetailResponseBody getBody() {
        return this.body;
    }

}
