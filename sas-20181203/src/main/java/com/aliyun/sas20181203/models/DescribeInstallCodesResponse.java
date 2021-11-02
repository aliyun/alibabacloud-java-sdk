// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstallCodesResponseBody body;

    public static DescribeInstallCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCodesResponse self = new DescribeInstallCodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstallCodesResponse setBody(DescribeInstallCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstallCodesResponseBody getBody() {
        return this.body;
    }

}
