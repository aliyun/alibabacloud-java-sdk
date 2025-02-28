// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTargetItemReportDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrafficControlTargetItemReportDetailResponseBody body;

    public static QueryTrafficControlTargetItemReportDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrafficControlTargetItemReportDetailResponse self = new QueryTrafficControlTargetItemReportDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrafficControlTargetItemReportDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrafficControlTargetItemReportDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrafficControlTargetItemReportDetailResponse setBody(QueryTrafficControlTargetItemReportDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrafficControlTargetItemReportDetailResponseBody getBody() {
        return this.body;
    }

}
