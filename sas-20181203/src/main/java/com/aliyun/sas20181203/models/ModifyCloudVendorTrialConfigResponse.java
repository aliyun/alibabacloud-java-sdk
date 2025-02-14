// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCloudVendorTrialConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudVendorTrialConfigResponseBody body;

    public static ModifyCloudVendorTrialConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudVendorTrialConfigResponse self = new ModifyCloudVendorTrialConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudVendorTrialConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudVendorTrialConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudVendorTrialConfigResponse setBody(ModifyCloudVendorTrialConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudVendorTrialConfigResponseBody getBody() {
        return this.body;
    }

}
