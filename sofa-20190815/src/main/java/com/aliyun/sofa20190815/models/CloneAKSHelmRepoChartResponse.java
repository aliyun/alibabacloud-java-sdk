// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneAKSHelmRepoChartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneAKSHelmRepoChartResponseBody body;

    public static CloneAKSHelmRepoChartResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneAKSHelmRepoChartResponse self = new CloneAKSHelmRepoChartResponse();
        return TeaModel.build(map, self);
    }

    public CloneAKSHelmRepoChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneAKSHelmRepoChartResponse setBody(CloneAKSHelmRepoChartResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneAKSHelmRepoChartResponseBody getBody() {
        return this.body;
    }

}
