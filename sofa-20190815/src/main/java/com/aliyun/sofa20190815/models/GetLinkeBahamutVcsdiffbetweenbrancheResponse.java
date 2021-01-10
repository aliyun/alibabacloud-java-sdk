// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsdiffbetweenbrancheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsdiffbetweenbrancheResponseBody body;

    public static GetLinkeBahamutVcsdiffbetweenbrancheResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsdiffbetweenbrancheResponse self = new GetLinkeBahamutVcsdiffbetweenbrancheResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsdiffbetweenbrancheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsdiffbetweenbrancheResponse setBody(GetLinkeBahamutVcsdiffbetweenbrancheResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsdiffbetweenbrancheResponseBody getBody() {
        return this.body;
    }

}
