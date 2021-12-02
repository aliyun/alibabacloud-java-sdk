// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetPhysicalConnectionServiceStatusResponseBody extends TeaModel {
    // 是否开通出云流量服务
    @NameInMap("Enabled")
    public Boolean enabled;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetPhysicalConnectionServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalConnectionServiceStatusResponseBody self = new GetPhysicalConnectionServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalConnectionServiceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetPhysicalConnectionServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
