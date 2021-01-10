// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSHelmChartReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSHelmChartReleaseResponseBody body;

    public static CreateAKSHelmChartReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSHelmChartReleaseResponse self = new CreateAKSHelmChartReleaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSHelmChartReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSHelmChartReleaseResponse setBody(CreateAKSHelmChartReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSHelmChartReleaseResponseBody getBody() {
        return this.body;
    }

}
