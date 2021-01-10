// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutOpenaddtrialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutOpenaddtrialResponseBody body;

    public static AddLinkeBahamutOpenaddtrialResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutOpenaddtrialResponse self = new AddLinkeBahamutOpenaddtrialResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutOpenaddtrialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutOpenaddtrialResponse setBody(AddLinkeBahamutOpenaddtrialResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutOpenaddtrialResponseBody getBody() {
        return this.body;
    }

}
