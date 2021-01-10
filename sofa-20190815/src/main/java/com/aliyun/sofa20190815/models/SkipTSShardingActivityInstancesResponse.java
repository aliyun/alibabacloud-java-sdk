// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipTSShardingActivityInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipTSShardingActivityInstancesResponseBody body;

    public static SkipTSShardingActivityInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipTSShardingActivityInstancesResponse self = new SkipTSShardingActivityInstancesResponse();
        return TeaModel.build(map, self);
    }

    public SkipTSShardingActivityInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipTSShardingActivityInstancesResponse setBody(SkipTSShardingActivityInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipTSShardingActivityInstancesResponseBody getBody() {
        return this.body;
    }

}
