// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessLogsDownloadAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
