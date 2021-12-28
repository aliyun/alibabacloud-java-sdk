// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeControlPlaneLogAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeControlPlaneLogAlertRulesResponseBody body;

    public static DescribeControlPlaneLogAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPlaneLogAlertRulesResponse self = new DescribeControlPlaneLogAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeControlPlaneLogAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeControlPlaneLogAlertRulesResponse setBody(DescribeControlPlaneLogAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeControlPlaneLogAlertRulesResponseBody getBody() {
        return this.body;
    }

}
