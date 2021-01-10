// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadHelmChartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadHelmChartResponseBody body;

    public static UploadHelmChartResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadHelmChartResponse self = new UploadHelmChartResponse();
        return TeaModel.build(map, self);
    }

    public UploadHelmChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadHelmChartResponse setBody(UploadHelmChartResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadHelmChartResponseBody getBody() {
        return this.body;
    }

}
