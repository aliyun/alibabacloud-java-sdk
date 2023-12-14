// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayAutoUpgradeConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayAutoUpgradeConfigurationResponseBody body;

    public static DescribeGatewayAutoUpgradeConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAutoUpgradeConfigurationResponse self = new DescribeGatewayAutoUpgradeConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAutoUpgradeConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayAutoUpgradeConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayAutoUpgradeConfigurationResponse setBody(DescribeGatewayAutoUpgradeConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayAutoUpgradeConfigurationResponseBody getBody() {
        return this.body;
    }

}
