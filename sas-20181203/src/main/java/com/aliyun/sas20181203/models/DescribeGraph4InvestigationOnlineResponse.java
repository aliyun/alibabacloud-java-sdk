// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGraph4InvestigationOnlineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGraph4InvestigationOnlineResponseBody body;

    public static DescribeGraph4InvestigationOnlineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4InvestigationOnlineResponse self = new DescribeGraph4InvestigationOnlineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4InvestigationOnlineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGraph4InvestigationOnlineResponse setBody(DescribeGraph4InvestigationOnlineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGraph4InvestigationOnlineResponseBody getBody() {
        return this.body;
    }

}
