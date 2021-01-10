// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTTSConfigResponseBody body;

    public static DescribeTTSConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSConfigResponse self = new DescribeTTSConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTTSConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTTSConfigResponse setBody(DescribeTTSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTTSConfigResponseBody getBody() {
        return this.body;
    }

}
