// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkelinkflowLinkflowProcessdefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody body;

    public static ListLinkelinkflowLinkflowProcessdefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkelinkflowLinkflowProcessdefinitionResponse self = new ListLinkelinkflowLinkflowProcessdefinitionResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkelinkflowLinkflowProcessdefinitionResponse setBody(ListLinkelinkflowLinkflowProcessdefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkelinkflowLinkflowProcessdefinitionResponseBody getBody() {
        return this.body;
    }

}
