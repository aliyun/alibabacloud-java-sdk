// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoDNAResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoDNAResultResponseBody body;

    public static GetVideoDNAResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDNAResultResponse self = new GetVideoDNAResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoDNAResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoDNAResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoDNAResultResponse setBody(GetVideoDNAResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoDNAResultResponseBody getBody() {
        return this.body;
    }

}
