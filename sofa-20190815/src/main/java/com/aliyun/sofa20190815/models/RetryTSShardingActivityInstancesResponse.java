// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryTSShardingActivityInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryTSShardingActivityInstancesResponseBody body;

    public static RetryTSShardingActivityInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryTSShardingActivityInstancesResponse self = new RetryTSShardingActivityInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RetryTSShardingActivityInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryTSShardingActivityInstancesResponse setBody(RetryTSShardingActivityInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryTSShardingActivityInstancesResponseBody getBody() {
        return this.body;
    }

}
