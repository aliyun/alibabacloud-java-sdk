// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleasestatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutReleasestatusResponseBody body;

    public static CheckLinkeBahamutReleasestatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleasestatusResponse self = new CheckLinkeBahamutReleasestatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleasestatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutReleasestatusResponse setBody(CheckLinkeBahamutReleasestatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutReleasestatusResponseBody getBody() {
        return this.body;
    }

}
