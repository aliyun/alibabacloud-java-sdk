// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCommonBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCommonBandwidthPackageResponseBody body;

    public static DeleteCommonBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonBandwidthPackageResponse self = new DeleteCommonBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommonBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCommonBandwidthPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCommonBandwidthPackageResponse setBody(DeleteCommonBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCommonBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
