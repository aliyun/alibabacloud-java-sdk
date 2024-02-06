// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListShardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<Shard> body;

    public static ListShardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShardsResponse self = new ListShardsResponse();
        return TeaModel.build(map, self);
    }

    public ListShardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShardsResponse setBody(java.util.List<Shard> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Shard> getBody() {
        return this.body;
    }

}
