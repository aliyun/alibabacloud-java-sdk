// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAssetInstancesResponseBody body;

    public static ListCloudAssetInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetInstancesResponse self = new ListCloudAssetInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAssetInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAssetInstancesResponse setBody(ListCloudAssetInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAssetInstancesResponseBody getBody() {
        return this.body;
    }

}
