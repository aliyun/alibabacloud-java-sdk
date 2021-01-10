// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmRepoChartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSHelmRepoChartResponseBody body;

    public static GetAKSHelmRepoChartResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmRepoChartResponse self = new GetAKSHelmRepoChartResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmRepoChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSHelmRepoChartResponse setBody(GetAKSHelmRepoChartResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSHelmRepoChartResponseBody getBody() {
        return this.body;
    }

}
