// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutAppdatascoretenantidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLinkeBahamutAppdatascoretenantidResponseBody body;

    public static CheckLinkeBahamutAppdatascoretenantidResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutAppdatascoretenantidResponse self = new CheckLinkeBahamutAppdatascoretenantidResponse();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutAppdatascoretenantidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLinkeBahamutAppdatascoretenantidResponse setBody(CheckLinkeBahamutAppdatascoretenantidResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLinkeBahamutAppdatascoretenantidResponseBody getBody() {
        return this.body;
    }

}
