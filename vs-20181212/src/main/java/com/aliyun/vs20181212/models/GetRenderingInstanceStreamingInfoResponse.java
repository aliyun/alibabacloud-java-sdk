// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingInstanceStreamingInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRenderingInstanceStreamingInfoResponseBody body;

    public static GetRenderingInstanceStreamingInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingInstanceStreamingInfoResponse self = new GetRenderingInstanceStreamingInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRenderingInstanceStreamingInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRenderingInstanceStreamingInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRenderingInstanceStreamingInfoResponse setBody(GetRenderingInstanceStreamingInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRenderingInstanceStreamingInfoResponseBody getBody() {
        return this.body;
    }

}
