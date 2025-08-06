// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetStorageRegionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageRegionListResponseBody body;

    public static GetStorageRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageRegionListResponse self = new GetStorageRegionListResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageRegionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageRegionListResponse setBody(GetStorageRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageRegionListResponseBody getBody() {
        return this.body;
    }

}
