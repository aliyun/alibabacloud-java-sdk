// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartReleaseStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSHelmChartReleaseStatusResponseBody body;

    public static GetAKSHelmChartReleaseStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartReleaseStatusResponse self = new GetAKSHelmChartReleaseStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartReleaseStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSHelmChartReleaseStatusResponse setBody(GetAKSHelmChartReleaseStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSHelmChartReleaseStatusResponseBody getBody() {
        return this.body;
    }

}
