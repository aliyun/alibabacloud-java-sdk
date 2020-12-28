// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsRegionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsRegionListResponseBody body;

    public static OnsRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsRegionListResponse self = new OnsRegionListResponse();
        return TeaModel.build(map, self);
    }

    public OnsRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsRegionListResponse setBody(OnsRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsRegionListResponseBody getBody() {
        return this.body;
    }

}
