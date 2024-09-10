// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCloudVendorAccountAKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudVendorAccountAKResponseBody body;

    public static ModifyCloudVendorAccountAKResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudVendorAccountAKResponse self = new ModifyCloudVendorAccountAKResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudVendorAccountAKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudVendorAccountAKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudVendorAccountAKResponse setBody(ModifyCloudVendorAccountAKResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudVendorAccountAKResponseBody getBody() {
        return this.body;
    }

}
