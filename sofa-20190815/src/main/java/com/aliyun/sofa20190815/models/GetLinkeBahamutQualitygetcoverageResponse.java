// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutQualitygetcoverageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutQualitygetcoverageResponseBody body;

    public static GetLinkeBahamutQualitygetcoverageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutQualitygetcoverageResponse self = new GetLinkeBahamutQualitygetcoverageResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutQualitygetcoverageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutQualitygetcoverageResponse setBody(GetLinkeBahamutQualitygetcoverageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutQualitygetcoverageResponseBody getBody() {
        return this.body;
    }

}
