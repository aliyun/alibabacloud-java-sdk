// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrainingJobEventsResponseBody body;

    public static ListTrainingJobEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobEventsResponse self = new ListTrainingJobEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrainingJobEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrainingJobEventsResponse setBody(ListTrainingJobEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrainingJobEventsResponseBody getBody() {
        return this.body;
    }

}
