// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaScreenshotByDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeHuYaScreenshotByDomainResponse setBody(DescribeHuYaScreenshotByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHuYaScreenshotByDomainResponseBody getBody() {
        return this.body;
    }

}
