// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeExportProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExportProgressResponseBody body;

    public static DescribeExportProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportProgressResponse self = new DescribeExportProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExportProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExportProgressResponse setBody(DescribeExportProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExportProgressResponseBody getBody() {
        return this.body;
    }

}
