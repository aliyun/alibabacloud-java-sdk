// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbyempldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUsergetbyempldsResponseBody body;

    public static GetLinkeBahamutUsergetbyempldsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbyempldsResponse self = new GetLinkeBahamutUsergetbyempldsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbyempldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUsergetbyempldsResponse setBody(GetLinkeBahamutUsergetbyempldsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUsergetbyempldsResponseBody getBody() {
        return this.body;
    }

}
