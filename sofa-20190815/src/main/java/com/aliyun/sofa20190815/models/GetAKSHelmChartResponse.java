// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSHelmChartResponseBody body;

    public static GetAKSHelmChartResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartResponse self = new GetAKSHelmChartResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSHelmChartResponse setBody(GetAKSHelmChartResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSHelmChartResponseBody getBody() {
        return this.body;
    }

}
