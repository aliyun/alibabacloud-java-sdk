// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCloudVendorAccountAKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudVendorAccountAKResponseBody body;

    public static DeleteCloudVendorAccountAKResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudVendorAccountAKResponse self = new DeleteCloudVendorAccountAKResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudVendorAccountAKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudVendorAccountAKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudVendorAccountAKResponse setBody(DeleteCloudVendorAccountAKResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudVendorAccountAKResponseBody getBody() {
        return this.body;
    }

}
