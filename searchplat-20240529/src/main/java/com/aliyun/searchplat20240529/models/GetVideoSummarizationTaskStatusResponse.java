// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetVideoSummarizationTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoSummarizationTaskStatusResponseBody body;

    public static GetVideoSummarizationTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSummarizationTaskStatusResponse self = new GetVideoSummarizationTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoSummarizationTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoSummarizationTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoSummarizationTaskStatusResponse setBody(GetVideoSummarizationTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoSummarizationTaskStatusResponseBody getBody() {
        return this.body;
    }

}
