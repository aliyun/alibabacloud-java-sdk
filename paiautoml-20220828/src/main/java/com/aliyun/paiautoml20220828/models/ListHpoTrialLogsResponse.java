// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHpoTrialLogsResponseBody body;

    public static ListHpoTrialLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialLogsResponse self = new ListHpoTrialLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHpoTrialLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHpoTrialLogsResponse setBody(ListHpoTrialLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHpoTrialLogsResponseBody getBody() {
        return this.body;
    }

}
