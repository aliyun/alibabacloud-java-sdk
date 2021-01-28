// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class AddShardingNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddShardingNodeResponseBody body;

    public static AddShardingNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddShardingNodeResponse self = new AddShardingNodeResponse();
        return TeaModel.build(map, self);
    }

    public AddShardingNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddShardingNodeResponse setBody(AddShardingNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddShardingNodeResponseBody getBody() {
        return this.body;
    }

}
