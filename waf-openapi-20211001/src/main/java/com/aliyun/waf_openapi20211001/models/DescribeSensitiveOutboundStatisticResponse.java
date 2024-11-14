// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveOutboundStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSensitiveOutboundStatisticResponseBody body;

    public static DescribeSensitiveOutboundStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveOutboundStatisticResponse self = new DescribeSensitiveOutboundStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveOutboundStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSensitiveOutboundStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSensitiveOutboundStatisticResponse setBody(DescribeSensitiveOutboundStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSensitiveOutboundStatisticResponseBody getBody() {
        return this.body;
    }

}
