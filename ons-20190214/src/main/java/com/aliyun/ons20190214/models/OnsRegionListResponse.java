// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsRegionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public OnsRegionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsRegionListResponse setBody(OnsRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsRegionListResponseBody getBody() {
        return this.body;
    }

}
