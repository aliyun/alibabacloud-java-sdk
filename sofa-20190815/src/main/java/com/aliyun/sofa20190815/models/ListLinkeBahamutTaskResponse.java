// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutTaskResponseBody body;

    public static ListLinkeBahamutTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutTaskResponse self = new ListLinkeBahamutTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutTaskResponse setBody(ListLinkeBahamutTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutTaskResponseBody getBody() {
        return this.body;
    }

}
