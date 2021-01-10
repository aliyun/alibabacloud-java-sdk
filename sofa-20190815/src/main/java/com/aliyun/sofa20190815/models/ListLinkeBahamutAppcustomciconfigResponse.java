// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppcustomciconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeBahamutAppcustomciconfigResponseBody body;

    public static ListLinkeBahamutAppcustomciconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppcustomciconfigResponse self = new ListLinkeBahamutAppcustomciconfigResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppcustomciconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeBahamutAppcustomciconfigResponse setBody(ListLinkeBahamutAppcustomciconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeBahamutAppcustomciconfigResponseBody getBody() {
        return this.body;
    }

}
