// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloseLinkeBahamutVcsmergerequestsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseLinkeBahamutVcsmergerequestsResponseBody body;

    public static CloseLinkeBahamutVcsmergerequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseLinkeBahamutVcsmergerequestsResponse self = new CloseLinkeBahamutVcsmergerequestsResponse();
        return TeaModel.build(map, self);
    }

    public CloseLinkeBahamutVcsmergerequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseLinkeBahamutVcsmergerequestsResponse setBody(CloseLinkeBahamutVcsmergerequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseLinkeBahamutVcsmergerequestsResponseBody getBody() {
        return this.body;
    }

}
