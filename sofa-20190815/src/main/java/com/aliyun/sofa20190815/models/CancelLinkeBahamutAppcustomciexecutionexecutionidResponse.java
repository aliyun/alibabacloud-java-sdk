// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeBahamutAppcustomciexecutionexecutionidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLinkeBahamutAppcustomciexecutionexecutionidResponseBody body;

    public static CancelLinkeBahamutAppcustomciexecutionexecutionidResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeBahamutAppcustomciexecutionexecutionidResponse self = new CancelLinkeBahamutAppcustomciexecutionexecutionidResponse();
        return TeaModel.build(map, self);
    }

    public CancelLinkeBahamutAppcustomciexecutionexecutionidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLinkeBahamutAppcustomciexecutionexecutionidResponse setBody(CancelLinkeBahamutAppcustomciexecutionexecutionidResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLinkeBahamutAppcustomciexecutionexecutionidResponseBody getBody() {
        return this.body;
    }

}
