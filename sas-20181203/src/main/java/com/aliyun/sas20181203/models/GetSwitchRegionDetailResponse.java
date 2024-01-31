// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSwitchRegionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSwitchRegionDetailResponseBody body;

    public static GetSwitchRegionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchRegionDetailResponse self = new GetSwitchRegionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSwitchRegionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwitchRegionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwitchRegionDetailResponse setBody(GetSwitchRegionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwitchRegionDetailResponseBody getBody() {
        return this.body;
    }

}
