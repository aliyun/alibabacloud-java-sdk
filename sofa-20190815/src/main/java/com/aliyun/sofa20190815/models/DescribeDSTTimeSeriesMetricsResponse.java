// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTimeSeriesMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDSTTimeSeriesMetricsResponseBody body;

    public static DescribeDSTTimeSeriesMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTimeSeriesMetricsResponse self = new DescribeDSTTimeSeriesMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTimeSeriesMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDSTTimeSeriesMetricsResponse setBody(DescribeDSTTimeSeriesMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDSTTimeSeriesMetricsResponseBody getBody() {
        return this.body;
    }

}
