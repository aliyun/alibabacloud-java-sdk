// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeDialogueNodeStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDialogueNodeStatisticsResponseBody body;

    public static DescribeDialogueNodeStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogueNodeStatisticsResponse self = new DescribeDialogueNodeStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDialogueNodeStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDialogueNodeStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDialogueNodeStatisticsResponse setBody(DescribeDialogueNodeStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDialogueNodeStatisticsResponseBody getBody() {
        return this.body;
    }

}
