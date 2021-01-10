// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReopenLinkeBahamutVcsmergerequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReopenLinkeBahamutVcsmergerequestResponseBody body;

    public static ReopenLinkeBahamutVcsmergerequestResponse build(java.util.Map<String, ?> map) throws Exception {
        ReopenLinkeBahamutVcsmergerequestResponse self = new ReopenLinkeBahamutVcsmergerequestResponse();
        return TeaModel.build(map, self);
    }

    public ReopenLinkeBahamutVcsmergerequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReopenLinkeBahamutVcsmergerequestResponse setBody(ReopenLinkeBahamutVcsmergerequestResponseBody body) {
        this.body = body;
        return this;
    }
    public ReopenLinkeBahamutVcsmergerequestResponseBody getBody() {
        return this.body;
    }

}
