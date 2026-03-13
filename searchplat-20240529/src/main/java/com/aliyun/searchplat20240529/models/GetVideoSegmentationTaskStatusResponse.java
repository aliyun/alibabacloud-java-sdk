// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetVideoSegmentationTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoSegmentationTaskStatusResponseBody body;

    public static GetVideoSegmentationTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSegmentationTaskStatusResponse self = new GetVideoSegmentationTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoSegmentationTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoSegmentationTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoSegmentationTaskStatusResponse setBody(GetVideoSegmentationTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoSegmentationTaskStatusResponseBody getBody() {
        return this.body;
    }

}
