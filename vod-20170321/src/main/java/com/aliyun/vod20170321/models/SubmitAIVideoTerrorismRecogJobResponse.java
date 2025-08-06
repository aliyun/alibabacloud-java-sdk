// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoTerrorismRecogJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIVideoTerrorismRecogJobResponseBody body;

    public static SubmitAIVideoTerrorismRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoTerrorismRecogJobResponse self = new SubmitAIVideoTerrorismRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoTerrorismRecogJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIVideoTerrorismRecogJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIVideoTerrorismRecogJobResponse setBody(SubmitAIVideoTerrorismRecogJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIVideoTerrorismRecogJobResponseBody getBody() {
        return this.body;
    }

}
