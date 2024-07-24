// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetPublicIpAddressPoolServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the IP address pool feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> You can call OpenPublicIpAddressPoolService to enable the IP address pool feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The request ID.</p>
     * 
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
