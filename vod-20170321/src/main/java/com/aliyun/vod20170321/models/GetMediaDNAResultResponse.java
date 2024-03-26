// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaDNAResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaDNAResultResponseBody body;

    public static GetMediaDNAResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaDNAResultResponse self = new GetMediaDNAResultResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaDNAResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaDNAResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaDNAResultResponse setBody(GetMediaDNAResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaDNAResultResponseBody getBody() {
        return this.body;
    }

}
