// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTranscodeSummaryResponseBody body;

    public static GetTranscodeSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeSummaryResponse self = new GetTranscodeSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetTranscodeSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranscodeSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranscodeSummaryResponse setBody(GetTranscodeSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranscodeSummaryResponseBody getBody() {
        return this.body;
    }

}
