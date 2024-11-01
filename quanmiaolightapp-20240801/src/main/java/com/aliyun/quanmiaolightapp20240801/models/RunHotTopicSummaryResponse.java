// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunHotTopicSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunHotTopicSummaryResponseBody body;

    public static RunHotTopicSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        RunHotTopicSummaryResponse self = new RunHotTopicSummaryResponse();
        return TeaModel.build(map, self);
    }

    public RunHotTopicSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunHotTopicSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunHotTopicSummaryResponse setBody(RunHotTopicSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public RunHotTopicSummaryResponseBody getBody() {
        return this.body;
    }

}
