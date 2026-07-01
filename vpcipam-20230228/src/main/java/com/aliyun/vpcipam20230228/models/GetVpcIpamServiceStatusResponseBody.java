// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetVpcIpamServiceStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVpcIpamServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcIpamServiceStatusResponseBody self = new GetVpcIpamServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcIpamServiceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetVpcIpamServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
