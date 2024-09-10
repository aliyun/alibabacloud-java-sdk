// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCloudVendorAccountAKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCloudVendorAccountAKResponseBody body;

    public static AddCloudVendorAccountAKResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCloudVendorAccountAKResponse self = new AddCloudVendorAccountAKResponse();
        return TeaModel.build(map, self);
    }

    public AddCloudVendorAccountAKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCloudVendorAccountAKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCloudVendorAccountAKResponse setBody(AddCloudVendorAccountAKResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCloudVendorAccountAKResponseBody getBody() {
        return this.body;
    }

}
