// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationunitaddmemberforunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody body;

    public static AddLinkeBahamutIterationunitaddmemberforunitResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationunitaddmemberforunitResponse self = new AddLinkeBahamutIterationunitaddmemberforunitResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponse setBody(AddLinkeBahamutIterationunitaddmemberforunitResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody getBody() {
        return this.body;
    }

}
