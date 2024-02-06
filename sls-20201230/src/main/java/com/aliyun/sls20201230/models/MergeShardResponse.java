// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MergeShardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<Shard> body;

    public static MergeShardResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeShardResponse self = new MergeShardResponse();
        return TeaModel.build(map, self);
    }

    public MergeShardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeShardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MergeShardResponse setBody(java.util.List<Shard> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Shard> getBody() {
        return this.body;
    }

}
