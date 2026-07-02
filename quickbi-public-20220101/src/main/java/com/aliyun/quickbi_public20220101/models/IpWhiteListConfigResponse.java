// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class IpWhiteListConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IpWhiteListConfigResponseBody body;

    public static IpWhiteListConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        IpWhiteListConfigResponse self = new IpWhiteListConfigResponse();
        return TeaModel.build(map, self);
    }

    public IpWhiteListConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IpWhiteListConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IpWhiteListConfigResponse setBody(IpWhiteListConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public IpWhiteListConfigResponseBody getBody() {
        return this.body;
    }

}
