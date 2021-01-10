// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartReleaseResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSHelmChartReleaseResourceResponseBody body;

    public static GetAKSHelmChartReleaseResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartReleaseResourceResponse self = new GetAKSHelmChartReleaseResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartReleaseResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSHelmChartReleaseResourceResponse setBody(GetAKSHelmChartReleaseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSHelmChartReleaseResourceResponseBody getBody() {
        return this.body;
    }

}
