// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaScreenshotByDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHuYaScreenshotByDomainResponseBody body;

    public static DescribeHuYaScreenshotByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaScreenshotByDomainResponse self = new DescribeHuYaScreenshotByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaScreenshotByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHuYaScreenshotByDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHuYaScreenshotByDomainResponse setBody(DescribeHuYaScreenshotByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHuYaScreenshotByDomainResponseBody getBody() {
        return this.body;
    }

}
