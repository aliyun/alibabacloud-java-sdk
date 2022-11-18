// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateSmartAGWithApplicationBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateSmartAGWithApplicationBandwidthPackageResponseBody body;

    public static AssociateSmartAGWithApplicationBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateSmartAGWithApplicationBandwidthPackageResponse self = new AssociateSmartAGWithApplicationBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public AssociateSmartAGWithApplicationBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateSmartAGWithApplicationBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateSmartAGWithApplicationBandwidthPackageResponse setBody(AssociateSmartAGWithApplicationBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateSmartAGWithApplicationBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
