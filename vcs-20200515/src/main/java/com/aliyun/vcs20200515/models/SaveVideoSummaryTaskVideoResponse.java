// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SaveVideoSummaryTaskVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveVideoSummaryTaskVideoResponseBody body;

    public static SaveVideoSummaryTaskVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveVideoSummaryTaskVideoResponse self = new SaveVideoSummaryTaskVideoResponse();
        return TeaModel.build(map, self);
    }

    public SaveVideoSummaryTaskVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveVideoSummaryTaskVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveVideoSummaryTaskVideoResponse setBody(SaveVideoSummaryTaskVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveVideoSummaryTaskVideoResponseBody getBody() {
        return this.body;
    }

}
