// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVSwitchAttributesResponseBody body;

    public static DescribeVSwitchAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesResponse self = new DescribeVSwitchAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVSwitchAttributesResponse setBody(DescribeVSwitchAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVSwitchAttributesResponseBody getBody() {
        return this.body;
    }

}
