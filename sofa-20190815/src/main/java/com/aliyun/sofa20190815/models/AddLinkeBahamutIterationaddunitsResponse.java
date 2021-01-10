// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationaddunitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeBahamutIterationaddunitsResponseBody body;

    public static AddLinkeBahamutIterationaddunitsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationaddunitsResponse self = new AddLinkeBahamutIterationaddunitsResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationaddunitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeBahamutIterationaddunitsResponse setBody(AddLinkeBahamutIterationaddunitsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeBahamutIterationaddunitsResponseBody getBody() {
        return this.body;
    }

}
