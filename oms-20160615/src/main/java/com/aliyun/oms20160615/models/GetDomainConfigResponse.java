// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainConfigResponseBody body;

    public static GetDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainConfigResponse self = new GetDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainConfigResponse setBody(GetDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainConfigResponseBody getBody() {
        return this.body;
    }

}
