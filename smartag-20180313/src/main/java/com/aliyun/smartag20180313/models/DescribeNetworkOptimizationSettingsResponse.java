// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeNetworkOptimizationSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkOptimizationSettingsResponseBody body;

    public static DescribeNetworkOptimizationSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkOptimizationSettingsResponse self = new DescribeNetworkOptimizationSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkOptimizationSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkOptimizationSettingsResponse setBody(DescribeNetworkOptimizationSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkOptimizationSettingsResponseBody getBody() {
        return this.body;
    }

}
