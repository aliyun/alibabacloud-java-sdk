// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class NotifyResourceAddressFamilyRequest extends TeaModel {
    @NameInMap("AddressFamily")
    public String addressFamily;

    @NameInMap("Ipv6Address")
    public String ipv6Address;

    @NameInMap("ResourceId")
    public String resourceId;

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
