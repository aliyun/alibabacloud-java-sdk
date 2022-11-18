// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DissociateSmartAGFromApplicationBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateSmartAGFromApplicationBandwidthPackageResponseBody body;

    public static DissociateSmartAGFromApplicationBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateSmartAGFromApplicationBandwidthPackageResponse self = new DissociateSmartAGFromApplicationBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public DissociateSmartAGFromApplicationBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageResponse setBody(DissociateSmartAGFromApplicationBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateSmartAGFromApplicationBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
