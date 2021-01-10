// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSHelmChartReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSHelmChartReleaseResponseBody body;

    public static ListAKSHelmChartReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSHelmChartReleaseResponse self = new ListAKSHelmChartReleaseResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSHelmChartReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSHelmChartReleaseResponse setBody(ListAKSHelmChartReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSHelmChartReleaseResponseBody getBody() {
        return this.body;
    }

}
