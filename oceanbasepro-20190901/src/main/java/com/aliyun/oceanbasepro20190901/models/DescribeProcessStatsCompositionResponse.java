// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProcessStatsCompositionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProcessStatsCompositionResponseBody body;

    public static DescribeProcessStatsCompositionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessStatsCompositionResponse self = new DescribeProcessStatsCompositionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessStatsCompositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessStatsCompositionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessStatsCompositionResponse setBody(DescribeProcessStatsCompositionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessStatsCompositionResponseBody getBody() {
        return this.body;
    }

}
