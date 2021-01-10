// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveAKSHelmChartPackageTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveAKSHelmChartPackageTreeResponseBody body;

    public static SaveAKSHelmChartPackageTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAKSHelmChartPackageTreeResponse self = new SaveAKSHelmChartPackageTreeResponse();
        return TeaModel.build(map, self);
    }

    public SaveAKSHelmChartPackageTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAKSHelmChartPackageTreeResponse setBody(SaveAKSHelmChartPackageTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAKSHelmChartPackageTreeResponseBody getBody() {
        return this.body;
    }

}
