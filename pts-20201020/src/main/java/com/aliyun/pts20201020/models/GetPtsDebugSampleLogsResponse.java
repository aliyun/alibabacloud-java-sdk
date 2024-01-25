// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsDebugSampleLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPtsDebugSampleLogsResponseBody body;

    public static GetPtsDebugSampleLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPtsDebugSampleLogsResponse self = new GetPtsDebugSampleLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetPtsDebugSampleLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPtsDebugSampleLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPtsDebugSampleLogsResponse setBody(GetPtsDebugSampleLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsDebugSampleLogsResponseBody getBody() {
        return this.body;
    }

}
