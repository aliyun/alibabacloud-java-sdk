// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class GetGlobalDeploymentDefaultsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static GetGlobalDeploymentDefaultsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalDeploymentDefaultsRequest self = new GetGlobalDeploymentDefaultsRequest();
        return TeaModel.build(map, self);
    }

    public GetGlobalDeploymentDefaultsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
