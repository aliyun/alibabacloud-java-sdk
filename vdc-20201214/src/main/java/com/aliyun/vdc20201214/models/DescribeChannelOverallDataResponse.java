// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelOverallDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelOverallDataResponseBody body;

    public static DescribeChannelOverallDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelOverallDataResponse self = new DescribeChannelOverallDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelOverallDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelOverallDataResponse setBody(DescribeChannelOverallDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelOverallDataResponseBody getBody() {
        return this.body;
    }

}
