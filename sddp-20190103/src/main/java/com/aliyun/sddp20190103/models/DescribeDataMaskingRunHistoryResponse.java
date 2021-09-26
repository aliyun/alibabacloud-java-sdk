// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingRunHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataMaskingRunHistoryResponseBody body;

    public static DescribeDataMaskingRunHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingRunHistoryResponse self = new DescribeDataMaskingRunHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingRunHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataMaskingRunHistoryResponse setBody(DescribeDataMaskingRunHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataMaskingRunHistoryResponseBody getBody() {
        return this.body;
    }

}
