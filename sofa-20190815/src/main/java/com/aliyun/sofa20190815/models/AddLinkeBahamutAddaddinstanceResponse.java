// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAddaddinstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutAddaddinstanceResponseBody body;

    public static AddLinkeBahamutAddaddinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAddaddinstanceResponse self = new AddLinkeBahamutAddaddinstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAddaddinstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutAddaddinstanceResponse setBody(AddLinkeBahamutAddaddinstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutAddaddinstanceResponseBody getBody() {
        return this.body;
    }

}
