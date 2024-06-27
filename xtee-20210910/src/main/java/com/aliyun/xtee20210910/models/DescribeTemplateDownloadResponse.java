// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplateDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplateDownloadResponseBody body;

    public static DescribeTemplateDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateDownloadResponse self = new DescribeTemplateDownloadResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateDownloadResponse setBody(DescribeTemplateDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateDownloadResponseBody getBody() {
        return this.body;
    }

}
