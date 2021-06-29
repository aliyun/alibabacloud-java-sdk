// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeNvrDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNvrDevicesResponseBody body;

    public static DescribeNvrDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNvrDevicesResponse self = new DescribeNvrDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNvrDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNvrDevicesResponse setBody(DescribeNvrDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNvrDevicesResponseBody getBody() {
        return this.body;
    }

}
