// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSensitiveStatisticResponseBody body;

    public static DescribeSensitiveStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveStatisticResponse self = new DescribeSensitiveStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSensitiveStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSensitiveStatisticResponse setBody(DescribeSensitiveStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSensitiveStatisticResponseBody getBody() {
        return this.body;
    }

}
