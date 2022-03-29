// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class GetAnalysisTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAnalysisTaskResultResponseBody body;

    public static GetAnalysisTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnalysisTaskResultResponse self = new GetAnalysisTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAnalysisTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnalysisTaskResultResponse setBody(GetAnalysisTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAnalysisTaskResultResponseBody getBody() {
        return this.body;
    }

}
