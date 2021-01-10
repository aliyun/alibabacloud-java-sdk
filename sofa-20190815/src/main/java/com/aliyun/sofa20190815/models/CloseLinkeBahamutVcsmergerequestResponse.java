// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloseLinkeBahamutVcsmergerequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseLinkeBahamutVcsmergerequestResponseBody body;

    public static CloseLinkeBahamutVcsmergerequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseLinkeBahamutVcsmergerequestResponse self = new CloseLinkeBahamutVcsmergerequestResponse();
        return TeaModel.build(map, self);
    }

    public CloseLinkeBahamutVcsmergerequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseLinkeBahamutVcsmergerequestResponse setBody(CloseLinkeBahamutVcsmergerequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseLinkeBahamutVcsmergerequestResponseBody getBody() {
        return this.body;
    }

}
