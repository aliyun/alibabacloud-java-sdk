// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CheckCanAllocateVpcPrivateIpAddressResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the private IP address is available. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanAllocate")
    public Boolean canAllocate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>93360B0-2969-40BF-8542-EBB34FD358AB</p>
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
