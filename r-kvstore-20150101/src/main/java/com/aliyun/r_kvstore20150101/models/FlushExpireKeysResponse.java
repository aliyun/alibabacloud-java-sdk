// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class FlushExpireKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FlushExpireKeysResponseBody body;

    public static FlushExpireKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        FlushExpireKeysResponse self = new FlushExpireKeysResponse();
        return TeaModel.build(map, self);
    }

    public FlushExpireKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlushExpireKeysResponse setBody(FlushExpireKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public FlushExpireKeysResponseBody getBody() {
        return this.body;
    }

}
