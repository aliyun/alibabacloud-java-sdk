// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveOutboundDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSensitiveOutboundDistributionResponseBody body;

    public static DescribeSensitiveOutboundDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveOutboundDistributionResponse self = new DescribeSensitiveOutboundDistributionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveOutboundDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSensitiveOutboundDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSensitiveOutboundDistributionResponse setBody(DescribeSensitiveOutboundDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSensitiveOutboundDistributionResponseBody getBody() {
        return this.body;
    }

}
