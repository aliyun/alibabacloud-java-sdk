// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ClearDynamicTagCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearDynamicTagCacheResponseBody body;

    public static ClearDynamicTagCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearDynamicTagCacheResponse self = new ClearDynamicTagCacheResponse();
        return TeaModel.build(map, self);
    }

    public ClearDynamicTagCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearDynamicTagCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearDynamicTagCacheResponse setBody(ClearDynamicTagCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearDynamicTagCacheResponseBody getBody() {
        return this.body;
    }

}
