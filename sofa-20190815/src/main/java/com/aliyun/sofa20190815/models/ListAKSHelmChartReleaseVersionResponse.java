// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSHelmChartReleaseVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSHelmChartReleaseVersionResponseBody body;

    public static ListAKSHelmChartReleaseVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSHelmChartReleaseVersionResponse self = new ListAKSHelmChartReleaseVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSHelmChartReleaseVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSHelmChartReleaseVersionResponse setBody(ListAKSHelmChartReleaseVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSHelmChartReleaseVersionResponseBody getBody() {
        return this.body;
    }

}
