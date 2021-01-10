// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsgroupResponseBody body;

    public static GetLinkeBahamutVcsgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsgroupResponse self = new GetLinkeBahamutVcsgroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsgroupResponse setBody(GetLinkeBahamutVcsgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsgroupResponseBody getBody() {
        return this.body;
    }

}
