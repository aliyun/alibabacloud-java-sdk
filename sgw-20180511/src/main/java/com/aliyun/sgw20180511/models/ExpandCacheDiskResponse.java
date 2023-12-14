// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ExpandCacheDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExpandCacheDiskResponseBody body;

    public static ExpandCacheDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExpandCacheDiskResponse self = new ExpandCacheDiskResponse();
        return TeaModel.build(map, self);
    }

    public ExpandCacheDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExpandCacheDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExpandCacheDiskResponse setBody(ExpandCacheDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExpandCacheDiskResponseBody getBody() {
        return this.body;
    }

}
