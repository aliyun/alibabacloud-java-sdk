// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody body;

    public static CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse self = new CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse();
        return TeaModel.build(map, self);
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse setBody(CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseBody getBody() {
        return this.body;
    }

}
