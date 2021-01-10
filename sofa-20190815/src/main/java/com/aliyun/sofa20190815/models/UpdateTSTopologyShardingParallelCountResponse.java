// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateTSTopologyShardingParallelCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTSTopologyShardingParallelCountResponseBody body;

    public static UpdateTSTopologyShardingParallelCountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTSTopologyShardingParallelCountResponse self = new UpdateTSTopologyShardingParallelCountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTSTopologyShardingParallelCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTSTopologyShardingParallelCountResponse setBody(UpdateTSTopologyShardingParallelCountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTSTopologyShardingParallelCountResponseBody getBody() {
        return this.body;
    }

}
