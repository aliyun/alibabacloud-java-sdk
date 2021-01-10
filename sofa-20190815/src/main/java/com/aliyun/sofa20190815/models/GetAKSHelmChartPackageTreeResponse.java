// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartPackageTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSHelmChartPackageTreeResponseBody body;

    public static GetAKSHelmChartPackageTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartPackageTreeResponse self = new GetAKSHelmChartPackageTreeResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartPackageTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSHelmChartPackageTreeResponse setBody(GetAKSHelmChartPackageTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSHelmChartPackageTreeResponseBody getBody() {
        return this.body;
    }

}
