// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class NotifyResourceAddressFamilyRequest extends TeaModel {
    // The type of the IP address. Valid values:
    // 
    // *   **ipv4**: IPv4. This is the default value.
    // *   **DualStack**: dual stack.
    // 
    // >  Application Load Balancer (ALB) instances and Classic Load Balancer (CLB) instances support only **IPv4** addresses. Network Load Balancer (NLB) instances support **IPv4** and **dual stack** addresses.
    @NameInMap("AddressFamily")
    public String addressFamily;

    // The IPv6 address.
    @NameInMap("Ipv6Address")
    public String ipv6Address;

    // The ID of the service resource that is added to the endpoint service.
    @NameInMap("ResourceId")
    public String resourceId;

    // The type of the service resource. Valid values:
    // 
    // *   **NLB**: specifies that the service resource is an NLB instance.
    // 
    // *   **CLB**: specifies that the service resource is a CLB instance.
    // 
    // *   **ALB**: specifies that the service resource is an ALB instance.
    // 
    // 
    // 
    //     >  The feature that allows you to specify an ALB instance or an NLB instance as the PrivateLink service resource is not supported by default. If you need this feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/crea).
    @NameInMap("ResourceType")
    public String resourceType;

    public static NotifyResourceAddressFamilyRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyResourceAddressFamilyRequest self = new NotifyResourceAddressFamilyRequest();
        return TeaModel.build(map, self);
    }

    public NotifyResourceAddressFamilyRequest setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }
    public String getAddressFamily() {
        return this.addressFamily;
    }

    public NotifyResourceAddressFamilyRequest setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public NotifyResourceAddressFamilyRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public NotifyResourceAddressFamilyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
