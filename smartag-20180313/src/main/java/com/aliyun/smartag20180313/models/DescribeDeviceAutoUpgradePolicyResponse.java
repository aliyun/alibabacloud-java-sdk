// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeDeviceAutoUpgradePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeviceAutoUpgradePolicyResponseBody body;

    public static DescribeDeviceAutoUpgradePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceAutoUpgradePolicyResponse self = new DescribeDeviceAutoUpgradePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceAutoUpgradePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceAutoUpgradePolicyResponse setBody(DescribeDeviceAutoUpgradePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceAutoUpgradePolicyResponseBody getBody() {
        return this.body;
    }

}
