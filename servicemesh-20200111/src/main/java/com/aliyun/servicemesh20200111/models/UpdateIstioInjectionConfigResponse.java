// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioInjectionConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateIstioInjectionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioInjectionConfigResponse self = new UpdateIstioInjectionConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIstioInjectionConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
