// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveApiStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSensitiveApiStatisticResponseBody body;

    public static DescribeSensitiveApiStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveApiStatisticResponse self = new DescribeSensitiveApiStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveApiStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSensitiveApiStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSensitiveApiStatisticResponse setBody(DescribeSensitiveApiStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSensitiveApiStatisticResponseBody getBody() {
        return this.body;
    }

}
