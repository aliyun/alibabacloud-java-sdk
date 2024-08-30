// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobInstanceEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrainingJobInstanceEventsResponseBody body;

    public static ListTrainingJobInstanceEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobInstanceEventsResponse self = new ListTrainingJobInstanceEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobInstanceEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrainingJobInstanceEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrainingJobInstanceEventsResponse setBody(ListTrainingJobInstanceEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrainingJobInstanceEventsResponseBody getBody() {
        return this.body;
    }

}
