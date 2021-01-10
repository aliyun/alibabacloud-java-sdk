// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXTransactionChartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDTXTransactionChartResponseBody body;

    public static GetDTXTransactionChartResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDTXTransactionChartResponse self = new GetDTXTransactionChartResponse();
        return TeaModel.build(map, self);
    }

    public GetDTXTransactionChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDTXTransactionChartResponse setBody(GetDTXTransactionChartResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDTXTransactionChartResponseBody getBody() {
        return this.body;
    }

}
