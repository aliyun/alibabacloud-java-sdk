// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudVendorRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudVendorRegionsResponseBody body;

    public static ListCloudVendorRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudVendorRegionsResponse self = new ListCloudVendorRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudVendorRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudVendorRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudVendorRegionsResponse setBody(ListCloudVendorRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudVendorRegionsResponseBody getBody() {
        return this.body;
    }

}
