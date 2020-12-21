// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetVideoSummaryTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoSummaryTaskResultResponseBody body;

    public static GetVideoSummaryTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSummaryTaskResultResponse self = new GetVideoSummaryTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoSummaryTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoSummaryTaskResultResponse setBody(GetVideoSummaryTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoSummaryTaskResultResponseBody getBody() {
        return this.body;
    }

}
