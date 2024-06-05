// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetVideoPreviewPlayMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoPreviewPlayMetaResponseBody body;

    public static GetVideoPreviewPlayMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPreviewPlayMetaResponse self = new GetVideoPreviewPlayMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoPreviewPlayMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoPreviewPlayMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoPreviewPlayMetaResponse setBody(GetVideoPreviewPlayMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoPreviewPlayMetaResponseBody getBody() {
        return this.body;
    }

}
