// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class CreateVideoSegmentationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoSegmentationTaskResponseBody body;

    public static CreateVideoSegmentationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoSegmentationTaskResponse self = new CreateVideoSegmentationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoSegmentationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoSegmentationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoSegmentationTaskResponse setBody(CreateVideoSegmentationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoSegmentationTaskResponseBody getBody() {
        return this.body;
    }

}
