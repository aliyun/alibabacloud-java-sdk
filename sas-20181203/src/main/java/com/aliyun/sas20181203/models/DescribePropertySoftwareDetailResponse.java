// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertySoftwareDetailResponseBody body;

    public static DescribePropertySoftwareDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareDetailResponse self = new DescribePropertySoftwareDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertySoftwareDetailResponse setBody(DescribePropertySoftwareDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertySoftwareDetailResponseBody getBody() {
        return this.body;
    }

}
