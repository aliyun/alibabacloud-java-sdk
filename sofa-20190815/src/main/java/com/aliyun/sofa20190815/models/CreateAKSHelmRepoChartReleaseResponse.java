// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSHelmRepoChartReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSHelmRepoChartReleaseResponseBody body;

    public static CreateAKSHelmRepoChartReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSHelmRepoChartReleaseResponse self = new CreateAKSHelmRepoChartReleaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSHelmRepoChartReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSHelmRepoChartReleaseResponse setBody(CreateAKSHelmRepoChartReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSHelmRepoChartReleaseResponseBody getBody() {
        return this.body;
    }

}
