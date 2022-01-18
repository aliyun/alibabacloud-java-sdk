// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigurationPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigurationPriceResponseBody body;

    public static DescribeConfigurationPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationPriceResponse self = new DescribeConfigurationPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigurationPriceResponse setBody(DescribeConfigurationPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigurationPriceResponseBody getBody() {
        return this.body;
    }

}
