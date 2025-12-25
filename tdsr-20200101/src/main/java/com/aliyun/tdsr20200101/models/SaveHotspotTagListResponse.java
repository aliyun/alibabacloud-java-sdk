// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveHotspotTagListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveHotspotTagListResponseBody body;

    public static SaveHotspotTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveHotspotTagListResponse self = new SaveHotspotTagListResponse();
        return TeaModel.build(map, self);
    }

    public SaveHotspotTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveHotspotTagListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveHotspotTagListResponse setBody(SaveHotspotTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveHotspotTagListResponseBody getBody() {
        return this.body;
    }

}
