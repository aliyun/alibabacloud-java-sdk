// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationaddmemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutIterationaddmemberResponseBody body;

    public static AddLinkeBahamutIterationaddmemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationaddmemberResponse self = new AddLinkeBahamutIterationaddmemberResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationaddmemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutIterationaddmemberResponse setBody(AddLinkeBahamutIterationaddmemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutIterationaddmemberResponseBody getBody() {
        return this.body;
    }

}
