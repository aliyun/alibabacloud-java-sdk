// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCloudVendorTrialConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCloudVendorTrialConfigResponseBody body;

    public static AddCloudVendorTrialConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCloudVendorTrialConfigResponse self = new AddCloudVendorTrialConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddCloudVendorTrialConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCloudVendorTrialConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCloudVendorTrialConfigResponse setBody(AddCloudVendorTrialConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCloudVendorTrialConfigResponseBody getBody() {
        return this.body;
    }

}
