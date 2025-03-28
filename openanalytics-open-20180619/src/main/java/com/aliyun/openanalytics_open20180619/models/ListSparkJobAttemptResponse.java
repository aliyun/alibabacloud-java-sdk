// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobAttemptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSparkJobAttemptResponseBody body;

    public static ListSparkJobAttemptResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkJobAttemptResponse self = new ListSparkJobAttemptResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkJobAttemptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSparkJobAttemptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSparkJobAttemptResponse setBody(ListSparkJobAttemptResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSparkJobAttemptResponseBody getBody() {
        return this.body;
    }

}
