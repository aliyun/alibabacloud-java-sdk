// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetSummaryInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSummaryInfoResponseBody body;

    public static GetSummaryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryInfoResponse self = new GetSummaryInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSummaryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSummaryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSummaryInfoResponse setBody(GetSummaryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSummaryInfoResponseBody getBody() {
        return this.body;
    }

}
