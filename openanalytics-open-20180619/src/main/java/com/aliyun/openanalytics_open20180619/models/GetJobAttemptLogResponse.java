// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobAttemptLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobAttemptLogResponseBody body;

    public static GetJobAttemptLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobAttemptLogResponse self = new GetJobAttemptLogResponse();
        return TeaModel.build(map, self);
    }

    public GetJobAttemptLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobAttemptLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobAttemptLogResponse setBody(GetJobAttemptLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobAttemptLogResponseBody getBody() {
        return this.body;
    }

}
