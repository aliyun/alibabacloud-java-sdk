// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCheckWarningDetailResponseBody body;

    public static DescribeCheckWarningDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningDetailResponse self = new DescribeCheckWarningDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckWarningDetailResponse setBody(DescribeCheckWarningDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckWarningDetailResponseBody getBody() {
        return this.body;
    }

}
