// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveOutboundTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSensitiveOutboundTrendResponseBody body;

    public static DescribeSensitiveOutboundTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveOutboundTrendResponse self = new DescribeSensitiveOutboundTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveOutboundTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSensitiveOutboundTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSensitiveOutboundTrendResponse setBody(DescribeSensitiveOutboundTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSensitiveOutboundTrendResponseBody getBody() {
        return this.body;
    }

}
