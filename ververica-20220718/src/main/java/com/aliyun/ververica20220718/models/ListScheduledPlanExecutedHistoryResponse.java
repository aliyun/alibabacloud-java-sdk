// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListScheduledPlanExecutedHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduledPlanExecutedHistoryResponseBody body;

    public static ListScheduledPlanExecutedHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPlanExecutedHistoryResponse self = new ListScheduledPlanExecutedHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduledPlanExecutedHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduledPlanExecutedHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduledPlanExecutedHistoryResponse setBody(ListScheduledPlanExecutedHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduledPlanExecutedHistoryResponseBody getBody() {
        return this.body;
    }

}
