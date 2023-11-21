// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CheckCanAllocateVpcPrivateIpAddressResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the private IP address is available. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("CanAllocate")
    public Boolean canAllocate;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckCanAllocateVpcPrivateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCanAllocateVpcPrivateIpAddressResponseBody self = new CheckCanAllocateVpcPrivateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCanAllocateVpcPrivateIpAddressResponseBody setCanAllocate(Boolean canAllocate) {
        this.canAllocate = canAllocate;
        return this;
    }
    public Boolean getCanAllocate() {
        return this.canAllocate;
    }

    public CheckCanAllocateVpcPrivateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
