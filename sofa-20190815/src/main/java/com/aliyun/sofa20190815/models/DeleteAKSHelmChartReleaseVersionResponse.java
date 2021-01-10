// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSHelmChartReleaseVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSHelmChartReleaseVersionResponseBody body;

    public static DeleteAKSHelmChartReleaseVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSHelmChartReleaseVersionResponse self = new DeleteAKSHelmChartReleaseVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSHelmChartReleaseVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSHelmChartReleaseVersionResponse setBody(DeleteAKSHelmChartReleaseVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSHelmChartReleaseVersionResponseBody getBody() {
        return this.body;
    }

}
