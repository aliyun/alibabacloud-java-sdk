// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsgroupsownedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsgroupsownedResponseBody body;

    public static GetLinkeBahamutVcsgroupsownedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsgroupsownedResponse self = new GetLinkeBahamutVcsgroupsownedResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsgroupsownedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsgroupsownedResponse setBody(GetLinkeBahamutVcsgroupsownedResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsgroupsownedResponseBody getBody() {
        return this.body;
    }

}
