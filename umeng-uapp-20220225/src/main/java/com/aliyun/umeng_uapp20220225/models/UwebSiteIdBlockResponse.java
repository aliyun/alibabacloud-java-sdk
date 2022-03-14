// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_uapp20220225.models;

import com.aliyun.tea.*;

public class UwebSiteIdBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UwebSiteIdBlockResponseBody body;

    public static UwebSiteIdBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        UwebSiteIdBlockResponse self = new UwebSiteIdBlockResponse();
        return TeaModel.build(map, self);
    }

    public UwebSiteIdBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UwebSiteIdBlockResponse setBody(UwebSiteIdBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public UwebSiteIdBlockResponseBody getBody() {
        return this.body;
    }

}
