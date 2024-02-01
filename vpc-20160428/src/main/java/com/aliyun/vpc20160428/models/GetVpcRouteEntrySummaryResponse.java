// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcRouteEntrySummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpcRouteEntrySummaryResponseBody body;

    public static GetVpcRouteEntrySummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcRouteEntrySummaryResponse self = new GetVpcRouteEntrySummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcRouteEntrySummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcRouteEntrySummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcRouteEntrySummaryResponse setBody(GetVpcRouteEntrySummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcRouteEntrySummaryResponseBody getBody() {
        return this.body;
    }

}
