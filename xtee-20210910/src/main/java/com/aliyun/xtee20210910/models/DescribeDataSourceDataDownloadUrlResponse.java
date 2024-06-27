// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDataSourceDataDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataSourceDataDownloadUrlResponseBody body;

    public static DescribeDataSourceDataDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceDataDownloadUrlResponse self = new DescribeDataSourceDataDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceDataDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourceDataDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataSourceDataDownloadUrlResponse setBody(DescribeDataSourceDataDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourceDataDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
