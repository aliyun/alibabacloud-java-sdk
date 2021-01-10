// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSHelmChartDownloadUrlResponseBody body;

    public static GetAKSHelmChartDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartDownloadUrlResponse self = new GetAKSHelmChartDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSHelmChartDownloadUrlResponse setBody(GetAKSHelmChartDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSHelmChartDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
