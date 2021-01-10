// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHelmChartUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHelmChartUploadUrlResponseBody body;

    public static GetHelmChartUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHelmChartUploadUrlResponse self = new GetHelmChartUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetHelmChartUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHelmChartUploadUrlResponse setBody(GetHelmChartUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHelmChartUploadUrlResponseBody getBody() {
        return this.body;
    }

}
