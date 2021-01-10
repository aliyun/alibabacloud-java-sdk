// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsmemberResponseBody body;

    public static GetLinkeBahamutVcsmemberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmemberResponse self = new GetLinkeBahamutVcsmemberResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsmemberResponse setBody(GetLinkeBahamutVcsmemberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsmemberResponseBody getBody() {
        return this.body;
    }

}
