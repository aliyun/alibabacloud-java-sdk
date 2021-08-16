// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniSupportRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUniSupportRegionResponseBody body;

    public static DescribeUniSupportRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniSupportRegionResponse self = new DescribeUniSupportRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUniSupportRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUniSupportRegionResponse setBody(DescribeUniSupportRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUniSupportRegionResponseBody getBody() {
        return this.body;
    }

}
