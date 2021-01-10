// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmSubChartReleaseLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSHelmSubChartReleaseLogResponseBody body;

    public static GetAKSHelmSubChartReleaseLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmSubChartReleaseLogResponse self = new GetAKSHelmSubChartReleaseLogResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmSubChartReleaseLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSHelmSubChartReleaseLogResponse setBody(GetAKSHelmSubChartReleaseLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSHelmSubChartReleaseLogResponseBody getBody() {
        return this.body;
    }

}
