// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairKVCacheVNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTairKVCacheVNodeResponseBody body;

    public static CreateTairKVCacheVNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTairKVCacheVNodeResponse self = new CreateTairKVCacheVNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateTairKVCacheVNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTairKVCacheVNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTairKVCacheVNodeResponse setBody(CreateTairKVCacheVNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTairKVCacheVNodeResponseBody getBody() {
        return this.body;
    }

}
