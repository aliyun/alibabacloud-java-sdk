// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitAgentJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAgentJobResponseBody body;

    public static SubmitAgentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAgentJobResponse self = new SubmitAgentJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAgentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAgentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAgentJobResponse setBody(SubmitAgentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAgentJobResponseBody getBody() {
        return this.body;
    }

}
