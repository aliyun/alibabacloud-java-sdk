// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitWorkflowJobResponseBody body;

    public static SubmitWorkflowJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitWorkflowJobResponse self = new SubmitWorkflowJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitWorkflowJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitWorkflowJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitWorkflowJobResponse setBody(SubmitWorkflowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitWorkflowJobResponseBody getBody() {
        return this.body;
    }

}
