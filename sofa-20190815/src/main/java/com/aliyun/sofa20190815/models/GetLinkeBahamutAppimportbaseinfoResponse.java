// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppimportbaseinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAppimportbaseinfoResponseBody body;

    public static GetLinkeBahamutAppimportbaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppimportbaseinfoResponse self = new GetLinkeBahamutAppimportbaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppimportbaseinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAppimportbaseinfoResponse setBody(GetLinkeBahamutAppimportbaseinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAppimportbaseinfoResponseBody getBody() {
        return this.body;
    }

}
