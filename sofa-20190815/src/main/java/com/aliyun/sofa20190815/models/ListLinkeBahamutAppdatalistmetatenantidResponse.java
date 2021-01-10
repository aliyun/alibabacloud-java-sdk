// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppdatalistmetatenantidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutAppdatalistmetatenantidResponseBody body;

    public static ListLinkeBahamutAppdatalistmetatenantidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppdatalistmetatenantidResponse self = new ListLinkeBahamutAppdatalistmetatenantidResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppdatalistmetatenantidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutAppdatalistmetatenantidResponse setBody(ListLinkeBahamutAppdatalistmetatenantidResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutAppdatalistmetatenantidResponseBody getBody() {
        return this.body;
    }

}
