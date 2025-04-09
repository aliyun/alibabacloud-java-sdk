// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAnnotationMissionSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAnnotationMissionSummaryResponseBody body;

    public static GetAnnotationMissionSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationMissionSummaryResponse self = new GetAnnotationMissionSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetAnnotationMissionSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnnotationMissionSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnnotationMissionSummaryResponse setBody(GetAnnotationMissionSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAnnotationMissionSummaryResponseBody getBody() {
        return this.body;
    }

}
