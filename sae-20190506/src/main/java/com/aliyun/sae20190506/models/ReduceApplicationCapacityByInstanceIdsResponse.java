// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ReduceApplicationCapacityByInstanceIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReduceApplicationCapacityByInstanceIdsResponseBody body;

    public static ReduceApplicationCapacityByInstanceIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReduceApplicationCapacityByInstanceIdsResponse self = new ReduceApplicationCapacityByInstanceIdsResponse();
        return TeaModel.build(map, self);
    }

    public ReduceApplicationCapacityByInstanceIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReduceApplicationCapacityByInstanceIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReduceApplicationCapacityByInstanceIdsResponse setBody(ReduceApplicationCapacityByInstanceIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReduceApplicationCapacityByInstanceIdsResponseBody getBody() {
        return this.body;
    }

}
