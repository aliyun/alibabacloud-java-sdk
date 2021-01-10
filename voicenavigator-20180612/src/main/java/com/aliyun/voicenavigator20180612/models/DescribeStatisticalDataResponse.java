// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStatisticalDataResponseBody body;

    public static DescribeStatisticalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataResponse self = new DescribeStatisticalDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStatisticalDataResponse setBody(DescribeStatisticalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStatisticalDataResponseBody getBody() {
        return this.body;
    }

}
