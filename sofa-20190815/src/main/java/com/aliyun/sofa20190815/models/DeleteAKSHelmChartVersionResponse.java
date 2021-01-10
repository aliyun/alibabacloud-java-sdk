// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSHelmChartVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSHelmChartVersionResponseBody body;

    public static DeleteAKSHelmChartVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSHelmChartVersionResponse self = new DeleteAKSHelmChartVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSHelmChartVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSHelmChartVersionResponse setBody(DeleteAKSHelmChartVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSHelmChartVersionResponseBody getBody() {
        return this.body;
    }

}
