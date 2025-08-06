// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListStrategyExecutionRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStrategyExecutionRecordResponseBody body;

    public static ListStrategyExecutionRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStrategyExecutionRecordResponse self = new ListStrategyExecutionRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListStrategyExecutionRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStrategyExecutionRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStrategyExecutionRecordResponse setBody(ListStrategyExecutionRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStrategyExecutionRecordResponseBody getBody() {
        return this.body;
    }

}
