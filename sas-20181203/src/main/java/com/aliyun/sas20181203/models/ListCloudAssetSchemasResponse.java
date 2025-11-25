// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAssetSchemasResponseBody body;

    public static ListCloudAssetSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetSchemasResponse self = new ListCloudAssetSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAssetSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAssetSchemasResponse setBody(ListCloudAssetSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAssetSchemasResponseBody getBody() {
        return this.body;
    }

}
