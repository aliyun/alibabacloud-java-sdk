// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioInjectionConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIstioInjectionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioInjectionConfigResponseBody self = new UpdateIstioInjectionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIstioInjectionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
