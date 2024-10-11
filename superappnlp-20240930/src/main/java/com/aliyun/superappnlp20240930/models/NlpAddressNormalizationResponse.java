// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.superappnlp20240930.models;

import com.aliyun.tea.*;

public class NlpAddressNormalizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NlpAddressNormalizationResponseBody body;

    public static NlpAddressNormalizationResponse build(java.util.Map<String, ?> map) throws Exception {
        NlpAddressNormalizationResponse self = new NlpAddressNormalizationResponse();
        return TeaModel.build(map, self);
    }

    public NlpAddressNormalizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NlpAddressNormalizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NlpAddressNormalizationResponse setBody(NlpAddressNormalizationResponseBody body) {
        this.body = body;
        return this;
    }
    public NlpAddressNormalizationResponseBody getBody() {
        return this.body;
    }

}
