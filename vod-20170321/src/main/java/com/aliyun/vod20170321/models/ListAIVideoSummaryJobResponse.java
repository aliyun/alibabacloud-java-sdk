// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoSummaryJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIVideoSummaryJobResponseBody body;

    public static ListAIVideoSummaryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoSummaryJobResponse self = new ListAIVideoSummaryJobResponse();
        return TeaModel.build(map, self);
    }

    public ListAIVideoSummaryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIVideoSummaryJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIVideoSummaryJobResponse setBody(ListAIVideoSummaryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIVideoSummaryJobResponseBody getBody() {
        return this.body;
    }

}
