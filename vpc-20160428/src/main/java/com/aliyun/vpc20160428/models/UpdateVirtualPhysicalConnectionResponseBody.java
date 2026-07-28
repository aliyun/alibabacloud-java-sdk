// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualPhysicalConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7035627E-1C1D-5BC7-A830-F897A35912D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the VLAN ID of the shared Express Connect circuit is modified.</p>
     * <ul>
     * <li><strong>true</strong>: The VLAN ID is modified.</li>
     * <li><strong>false</strong>: The VLAN ID failed to be modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static UpdateVirtualPhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualPhysicalConnectionResponseBody self = new UpdateVirtualPhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualPhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVirtualPhysicalConnectionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
