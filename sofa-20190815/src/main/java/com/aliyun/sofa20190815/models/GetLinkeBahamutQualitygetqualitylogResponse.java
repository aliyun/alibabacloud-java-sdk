// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutQualitygetqualitylogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutQualitygetqualitylogResponseBody body;

    public static GetLinkeBahamutQualitygetqualitylogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutQualitygetqualitylogResponse self = new GetLinkeBahamutQualitygetqualitylogResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutQualitygetqualitylogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutQualitygetqualitylogResponse setBody(GetLinkeBahamutQualitygetqualitylogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutQualitygetqualitylogResponseBody getBody() {
        return this.body;
    }

}
