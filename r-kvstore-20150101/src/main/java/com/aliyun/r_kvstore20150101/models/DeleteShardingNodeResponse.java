// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteShardingNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteShardingNodeResponseBody body;

    public static DeleteShardingNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteShardingNodeResponse self = new DeleteShardingNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteShardingNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteShardingNodeResponse setBody(DeleteShardingNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteShardingNodeResponseBody getBody() {
        return this.body;
    }

}
