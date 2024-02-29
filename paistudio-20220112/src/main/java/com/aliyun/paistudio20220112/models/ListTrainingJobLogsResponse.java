// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrainingJobLogsResponseBody body;

    public static ListTrainingJobLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobLogsResponse self = new ListTrainingJobLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrainingJobLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrainingJobLogsResponse setBody(ListTrainingJobLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrainingJobLogsResponseBody getBody() {
        return this.body;
    }

}
