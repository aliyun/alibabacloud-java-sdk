// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVSwitchesResponseBody body;

    public static DescribeVSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesResponse self = new DescribeVSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVSwitchesResponse setBody(DescribeVSwitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVSwitchesResponseBody getBody() {
        return this.body;
    }

}
