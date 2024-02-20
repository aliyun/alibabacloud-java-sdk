// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePeakTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePeakTrendResponseBody body;

    public static DescribePeakTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePeakTrendResponse self = new DescribePeakTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribePeakTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePeakTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePeakTrendResponse setBody(DescribePeakTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePeakTrendResponseBody getBody() {
        return this.body;
    }

}
