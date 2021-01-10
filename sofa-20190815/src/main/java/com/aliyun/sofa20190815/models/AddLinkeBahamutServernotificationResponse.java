// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutServernotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutServernotificationResponseBody body;

    public static AddLinkeBahamutServernotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutServernotificationResponse self = new AddLinkeBahamutServernotificationResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutServernotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutServernotificationResponse setBody(AddLinkeBahamutServernotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutServernotificationResponseBody getBody() {
        return this.body;
    }

}
