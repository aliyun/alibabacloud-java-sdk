// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminaddsecmenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAdminaddsecmenuResponseBody body;

    public static AddLinkeBahamutAdminaddsecmenuResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminaddsecmenuResponse self = new AddLinkeBahamutAdminaddsecmenuResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminaddsecmenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAdminaddsecmenuResponse setBody(AddLinkeBahamutAdminaddsecmenuResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAdminaddsecmenuResponseBody getBody() {
        return this.body;
    }

}
