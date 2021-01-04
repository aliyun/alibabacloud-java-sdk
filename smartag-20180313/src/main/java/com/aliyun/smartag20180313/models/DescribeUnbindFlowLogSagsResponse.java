// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUnbindFlowLogSagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUnbindFlowLogSagsResponseBody body;

    public static DescribeUnbindFlowLogSagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnbindFlowLogSagsResponse self = new DescribeUnbindFlowLogSagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnbindFlowLogSagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUnbindFlowLogSagsResponse setBody(DescribeUnbindFlowLogSagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnbindFlowLogSagsResponseBody getBody() {
        return this.body;
    }

}
