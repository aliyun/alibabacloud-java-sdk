// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackTotalPackagesSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBuildpackTotalPackagesSizeResponseBody body;

    public static DescribeBuildpackTotalPackagesSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackTotalPackagesSizeResponse self = new DescribeBuildpackTotalPackagesSizeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackTotalPackagesSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBuildpackTotalPackagesSizeResponse setBody(DescribeBuildpackTotalPackagesSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBuildpackTotalPackagesSizeResponseBody getBody() {
        return this.body;
    }

}
