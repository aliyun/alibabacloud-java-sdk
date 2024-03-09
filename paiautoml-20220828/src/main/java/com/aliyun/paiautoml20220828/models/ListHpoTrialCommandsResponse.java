// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialCommandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHpoTrialCommandsResponseBody body;

    public static ListHpoTrialCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialCommandsResponse self = new ListHpoTrialCommandsResponse();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHpoTrialCommandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHpoTrialCommandsResponse setBody(ListHpoTrialCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHpoTrialCommandsResponseBody getBody() {
        return this.body;
    }

}
