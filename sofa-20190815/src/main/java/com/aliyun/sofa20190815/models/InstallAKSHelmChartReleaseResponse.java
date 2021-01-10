// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InstallAKSHelmChartReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallAKSHelmChartReleaseResponseBody body;

    public static InstallAKSHelmChartReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallAKSHelmChartReleaseResponse self = new InstallAKSHelmChartReleaseResponse();
        return TeaModel.build(map, self);
    }

    public InstallAKSHelmChartReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallAKSHelmChartReleaseResponse setBody(InstallAKSHelmChartReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallAKSHelmChartReleaseResponseBody getBody() {
        return this.body;
    }

}
