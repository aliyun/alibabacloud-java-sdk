// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetPublicIpAddressPoolServiceStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-06F82A1B457</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPublicIpAddressPoolServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublicIpAddressPoolServiceStatusResponseBody self = new GetPublicIpAddressPoolServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublicIpAddressPoolServiceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetPublicIpAddressPoolServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
