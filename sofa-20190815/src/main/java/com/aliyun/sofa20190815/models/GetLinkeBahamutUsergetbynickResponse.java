// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUsergetbynickResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutUsergetbynickResponseBody body;

    public static GetLinkeBahamutUsergetbynickResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUsergetbynickResponse self = new GetLinkeBahamutUsergetbynickResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUsergetbynickResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutUsergetbynickResponse setBody(GetLinkeBahamutUsergetbynickResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutUsergetbynickResponseBody getBody() {
        return this.body;
    }

}
