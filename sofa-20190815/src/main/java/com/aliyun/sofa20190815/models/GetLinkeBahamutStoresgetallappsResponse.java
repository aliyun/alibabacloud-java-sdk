// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStoresgetallappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutStoresgetallappsResponseBody body;

    public static GetLinkeBahamutStoresgetallappsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStoresgetallappsResponse self = new GetLinkeBahamutStoresgetallappsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStoresgetallappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutStoresgetallappsResponse setBody(GetLinkeBahamutStoresgetallappsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutStoresgetallappsResponseBody getBody() {
        return this.body;
    }

}
