// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobGroupExportTaskProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeJobGroupExportTaskProgressResponseBody body;

    public static DescribeJobGroupExportTaskProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobGroupExportTaskProgressResponse self = new DescribeJobGroupExportTaskProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobGroupExportTaskProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobGroupExportTaskProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobGroupExportTaskProgressResponse setBody(DescribeJobGroupExportTaskProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobGroupExportTaskProgressResponseBody getBody() {
        return this.body;
    }

}
