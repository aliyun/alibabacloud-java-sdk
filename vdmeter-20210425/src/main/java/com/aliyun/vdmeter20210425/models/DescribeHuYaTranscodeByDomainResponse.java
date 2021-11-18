// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeHuYaTranscodeByDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHuYaTranscodeByDomainResponseBody body;

    public static DescribeHuYaTranscodeByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHuYaTranscodeByDomainResponse self = new DescribeHuYaTranscodeByDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHuYaTranscodeByDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHuYaTranscodeByDomainResponse setBody(DescribeHuYaTranscodeByDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHuYaTranscodeByDomainResponseBody getBody() {
        return this.body;
    }

}
