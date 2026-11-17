// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class GetEduHomeworkCorrectionResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEduHomeworkCorrectionResultResponseBody body;

    public static GetEduHomeworkCorrectionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEduHomeworkCorrectionResultResponse self = new GetEduHomeworkCorrectionResultResponse();
        return TeaModel.build(map, self);
    }

    public GetEduHomeworkCorrectionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEduHomeworkCorrectionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEduHomeworkCorrectionResultResponse setBody(GetEduHomeworkCorrectionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEduHomeworkCorrectionResultResponseBody getBody() {
        return this.body;
    }

}
