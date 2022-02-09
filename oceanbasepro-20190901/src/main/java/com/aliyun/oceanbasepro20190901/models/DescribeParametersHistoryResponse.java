// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeParametersHistoryResponseBody body;

    public static DescribeParametersHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersHistoryResponse self = new DescribeParametersHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParametersHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParametersHistoryResponse setBody(DescribeParametersHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParametersHistoryResponseBody getBody() {
        return this.body;
    }

}
