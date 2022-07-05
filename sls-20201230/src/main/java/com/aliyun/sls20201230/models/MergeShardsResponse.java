// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MergeShardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<Shard> body;

    public static MergeShardsResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeShardsResponse self = new MergeShardsResponse();
        return TeaModel.build(map, self);
    }

    public MergeShardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeShardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MergeShardsResponse setBody(java.util.List<Shard> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Shard> getBody() {
        return this.body;
    }

}
