// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeTTSConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeTTSConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTTSConfigResponse setBody(DescribeTTSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTTSConfigResponseBody getBody() {
        return this.body;
    }

}
