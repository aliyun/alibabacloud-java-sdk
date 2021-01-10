// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutAppdatastctenantidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutAppdatastctenantidResponseBody body;

    public static CheckLinkeBahamutAppdatastctenantidResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutAppdatastctenantidResponse self = new CheckLinkeBahamutAppdatastctenantidResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutAppdatastctenantidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutAppdatastctenantidResponse setBody(CheckLinkeBahamutAppdatastctenantidResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutAppdatastctenantidResponseBody getBody() {
        return this.body;
    }

}
