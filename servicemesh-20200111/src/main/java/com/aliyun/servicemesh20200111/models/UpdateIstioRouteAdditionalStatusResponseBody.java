// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioRouteAdditionalStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIstioRouteAdditionalStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioRouteAdditionalStatusResponseBody self = new UpdateIstioRouteAdditionalStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIstioRouteAdditionalStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
