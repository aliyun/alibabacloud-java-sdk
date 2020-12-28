// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeUpgradeVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUpgradeVersionResponseBody body;

    public static DescribeUpgradeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeVersionResponse self = new DescribeUpgradeVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpgradeVersionResponse setBody(DescribeUpgradeVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpgradeVersionResponseBody getBody() {
        return this.body;
    }

}
