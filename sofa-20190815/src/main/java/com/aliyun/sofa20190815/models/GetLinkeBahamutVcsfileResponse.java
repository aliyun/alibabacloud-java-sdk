// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsfileResponseBody body;

    public static GetLinkeBahamutVcsfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsfileResponse self = new GetLinkeBahamutVcsfileResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsfileResponse setBody(GetLinkeBahamutVcsfileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsfileResponseBody getBody() {
        return this.body;
    }

}
