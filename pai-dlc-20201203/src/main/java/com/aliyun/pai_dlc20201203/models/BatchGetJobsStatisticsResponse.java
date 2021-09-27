// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class BatchGetJobsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetJobsStatisticsResponseBody body;

    public static BatchGetJobsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetJobsStatisticsResponse self = new BatchGetJobsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetJobsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetJobsStatisticsResponse setBody(BatchGetJobsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetJobsStatisticsResponseBody getBody() {
        return this.body;
    }

}
