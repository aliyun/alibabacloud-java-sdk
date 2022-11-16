// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessLogsDownloadAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessLogsDownloadAttributeResponseBody body;

    public static DescribeAccessLogsDownloadAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessLogsDownloadAttributeResponse self = new DescribeAccessLogsDownloadAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessLogsDownloadAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessLogsDownloadAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessLogsDownloadAttributeResponse setBody(DescribeAccessLogsDownloadAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessLogsDownloadAttributeResponseBody getBody() {
        return this.body;
    }

}
