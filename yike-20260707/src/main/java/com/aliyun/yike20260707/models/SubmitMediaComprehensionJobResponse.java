// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitMediaComprehensionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitMediaComprehensionJobResponseBody body;

    public static SubmitMediaComprehensionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaComprehensionJobResponse self = new SubmitMediaComprehensionJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaComprehensionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaComprehensionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitMediaComprehensionJobResponse setBody(SubmitMediaComprehensionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaComprehensionJobResponseBody getBody() {
        return this.body;
    }

}
