// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmrworkitemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsmrworkitemsResponseBody body;

    public static GetLinkeBahamutVcsmrworkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmrworkitemsResponse self = new GetLinkeBahamutVcsmrworkitemsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmrworkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsmrworkitemsResponse setBody(GetLinkeBahamutVcsmrworkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsmrworkitemsResponseBody getBody() {
        return this.body;
    }

}
