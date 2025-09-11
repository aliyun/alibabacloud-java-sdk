// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListCloudAppPatchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAppPatchesResponseBody body;

    public static ListCloudAppPatchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAppPatchesResponse self = new ListCloudAppPatchesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAppPatchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAppPatchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAppPatchesResponse setBody(ListCloudAppPatchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAppPatchesResponseBody getBody() {
        return this.body;
    }

}
