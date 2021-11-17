// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf_vpc_cloud20211115_131123360.models;

import com.aliyun.tea.*;

public class AdadaAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AdadaAResponseBody body;

    public static AdadaAResponse build(java.util.Map<String, ?> map) throws Exception {
        AdadaAResponse self = new AdadaAResponse();
        return TeaModel.build(map, self);
    }

    public AdadaAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdadaAResponse setBody(AdadaAResponseBody body) {
        this.body = body;
        return this;
    }
    public AdadaAResponseBody getBody() {
        return this.body;
    }

}
