// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPublicUrlIpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPublicUrlIpListResponseBody body;

    public static ModifyPublicUrlIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPublicUrlIpListResponse self = new ModifyPublicUrlIpListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPublicUrlIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPublicUrlIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPublicUrlIpListResponse setBody(ModifyPublicUrlIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPublicUrlIpListResponseBody getBody() {
        return this.body;
    }

}
