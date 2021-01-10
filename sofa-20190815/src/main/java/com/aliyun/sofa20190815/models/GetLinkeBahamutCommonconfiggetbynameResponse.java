// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCommonconfiggetbynameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCommonconfiggetbynameResponseBody body;

    public static GetLinkeBahamutCommonconfiggetbynameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCommonconfiggetbynameResponse self = new GetLinkeBahamutCommonconfiggetbynameResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCommonconfiggetbynameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCommonconfiggetbynameResponse setBody(GetLinkeBahamutCommonconfiggetbynameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCommonconfiggetbynameResponseBody getBody() {
        return this.body;
    }

}
