// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelAKSHelmChartReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelAKSHelmChartReleaseResponseBody body;

    public static CancelAKSHelmChartReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAKSHelmChartReleaseResponse self = new CancelAKSHelmChartReleaseResponse();
        return TeaModel.build(map, self);
    }

    public CancelAKSHelmChartReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAKSHelmChartReleaseResponse setBody(CancelAKSHelmChartReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAKSHelmChartReleaseResponseBody getBody() {
        return this.body;
    }

}
