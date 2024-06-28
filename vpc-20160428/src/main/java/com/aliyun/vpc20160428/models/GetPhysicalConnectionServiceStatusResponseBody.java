// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetPhysicalConnectionServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether billing for outbound data transfer is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
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
