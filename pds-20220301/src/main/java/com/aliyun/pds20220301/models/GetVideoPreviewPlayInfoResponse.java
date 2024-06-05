// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoPreviewPlayInfoResponseBody body;

    public static GetVideoPreviewPlayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPreviewPlayInfoResponse self = new GetVideoPreviewPlayInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoPreviewPlayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoPreviewPlayInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoPreviewPlayInfoResponse setBody(GetVideoPreviewPlayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoPreviewPlayInfoResponseBody getBody() {
        return this.body;
    }

}
