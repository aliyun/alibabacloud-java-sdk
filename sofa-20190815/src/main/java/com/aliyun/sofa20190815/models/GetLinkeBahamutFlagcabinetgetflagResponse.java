// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutFlagcabinetgetflagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutFlagcabinetgetflagResponseBody body;

    public static GetLinkeBahamutFlagcabinetgetflagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutFlagcabinetgetflagResponse self = new GetLinkeBahamutFlagcabinetgetflagResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutFlagcabinetgetflagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutFlagcabinetgetflagResponse setBody(GetLinkeBahamutFlagcabinetgetflagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutFlagcabinetgetflagResponseBody getBody() {
        return this.body;
    }

}
