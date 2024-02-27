// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateIpv6AddressResponseBody extends TeaModel {
    /**
     * <p>The IPv6 address.</p>
     */
    @NameInMap("Ipv6Address")
    public String ipv6Address;

    /**
     * <p>The ID of the IPv6 address.</p>
     */
    @NameInMap("Ipv6AddressId")
    public String ipv6AddressId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static AllocateIpv6AddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpv6AddressResponseBody self = new AllocateIpv6AddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateIpv6AddressResponseBody setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public AllocateIpv6AddressResponseBody setIpv6AddressId(String ipv6AddressId) {
        this.ipv6AddressId = ipv6AddressId;
        return this;
    }
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    public AllocateIpv6AddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateIpv6AddressResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
