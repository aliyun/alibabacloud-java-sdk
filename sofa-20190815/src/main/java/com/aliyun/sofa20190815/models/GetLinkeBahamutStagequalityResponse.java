// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStagequalityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutStagequalityResponseBody body;

    public static GetLinkeBahamutStagequalityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStagequalityResponse self = new GetLinkeBahamutStagequalityResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStagequalityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutStagequalityResponse setBody(GetLinkeBahamutStagequalityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutStagequalityResponseBody getBody() {
        return this.body;
    }

}
