// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSHelmChartReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSHelmChartReleaseResponseBody body;

    public static DeleteAKSHelmChartReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSHelmChartReleaseResponse self = new DeleteAKSHelmChartReleaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSHelmChartReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSHelmChartReleaseResponse setBody(DeleteAKSHelmChartReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSHelmChartReleaseResponseBody getBody() {
        return this.body;
    }

}
