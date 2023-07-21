// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetDhcpOptionsSetResponseBody extends TeaModel {
    /**
     * <p>The information about the virtual private cloud (VPC) that is associated with the DHCP options set.</p>
     */
    @NameInMap("AssociateVpcs")
    public java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> associateVpcs;

    /**
     * <p>The configuration information about the DHCP options set.</p>
     */
    @NameInMap("DhcpOptions")
    public GetDhcpOptionsSetResponseBodyDhcpOptions dhcpOptions;

    /**
     * <p>The description of the DHCP options set.</p>
     */
    @NameInMap("DhcpOptionsSetDescription")
    public String dhcpOptionsSetDescription;

    /**
     * <p>The ID of the DHCP options set.</p>
     */
    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    /**
     * <p>The name of the DHCP options set.</p>
     */
    @NameInMap("DhcpOptionsSetName")
    public String dhcpOptionsSetName;

    /**
     * <p>The ID of the Alibaba Cloud account to which the DHCP options set belongs.</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the DHCP options set. Valid values:</p>
     * <br>
     * <p>*   **Available**: available</p>
     * <p>*   **InUse**: in use</p>
     * <p>*   **Deleted**: deleted</p>
     * <p>*   **Pending**: being configured</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<GetDhcpOptionsSetResponseBodyTags> tags;

    public static GetDhcpOptionsSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDhcpOptionsSetResponseBody self = new GetDhcpOptionsSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDhcpOptionsSetResponseBody setAssociateVpcs(java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> associateVpcs) {
        this.associateVpcs = associateVpcs;
        return this;
    }
    public java.util.List<GetDhcpOptionsSetResponseBodyAssociateVpcs> getAssociateVpcs() {
        return this.associateVpcs;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptions(GetDhcpOptionsSetResponseBodyDhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
        return this;
    }
    public GetDhcpOptionsSetResponseBodyDhcpOptions getDhcpOptions() {
        return this.dhcpOptions;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
        this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
        return this;
    }
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public GetDhcpOptionsSetResponseBody setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
        return this;
    }
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public GetDhcpOptionsSetResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetDhcpOptionsSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDhcpOptionsSetResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetDhcpOptionsSetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDhcpOptionsSetResponseBody setTags(java.util.List<GetDhcpOptionsSetResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetDhcpOptionsSetResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetDhcpOptionsSetResponseBodyAssociateVpcs extends TeaModel {
        /**
         * <p>The status of the VPC that is associated with the DHCP options set. Valid values:</p>
         * <br>
         * <p>*   **InUse**: in use</p>
         * <p>*   **Pending**: being configured</p>
         */
        @NameInMap("AssociateStatus")
        public String associateStatus;

        /**
         * <p>The ID of the VPC that is associated with the DHCP options set.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetDhcpOptionsSetResponseBodyAssociateVpcs build(java.util.Map<String, ?> map) throws Exception {
            GetDhcpOptionsSetResponseBodyAssociateVpcs self = new GetDhcpOptionsSetResponseBodyAssociateVpcs();
            return TeaModel.build(map, self);
        }

        public GetDhcpOptionsSetResponseBodyAssociateVpcs setAssociateStatus(String associateStatus) {
            this.associateStatus = associateStatus;
            return this;
        }
        public String getAssociateStatus() {
            return this.associateStatus;
        }

        public GetDhcpOptionsSetResponseBodyAssociateVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetDhcpOptionsSetResponseBodyDhcpOptions extends TeaModel {
        /**
         * <p>The suffix of the hostname.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The IP address of the DNS server.</p>
         */
        @NameInMap("DomainNameServers")
        public String domainNameServers;

        /**
         * <p>The lease time of the IPv6 addresses for the DHCP options set.</p>
         * <br>
         * <p>*   If you use hours as the unit, Valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.</p>
         * <p>*   If you use days as the unit, Valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.</p>
         */
        @NameInMap("Ipv6LeaseTime")
        public String ipv6LeaseTime;

        /**
         * <p>The lease time of the IPv4 addresses for the DHCP options set.</p>
         * <br>
         * <p>*   If you use hours as the unit, valid values are **24h to 1176h** and **87600h to 175200h**. Default value: **87600h**.</p>
         * <p>*   If you use days as the unit, valid values are **1d to 49d** and **3650d to 7300d**. Default value: **3650d**.</p>
         */
        @NameInMap("LeaseTime")
        public String leaseTime;

        public static GetDhcpOptionsSetResponseBodyDhcpOptions build(java.util.Map<String, ?> map) throws Exception {
            GetDhcpOptionsSetResponseBodyDhcpOptions self = new GetDhcpOptionsSetResponseBodyDhcpOptions();
            return TeaModel.build(map, self);
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setDomainNameServers(String domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setIpv6LeaseTime(String ipv6LeaseTime) {
            this.ipv6LeaseTime = ipv6LeaseTime;
            return this;
        }
        public String getIpv6LeaseTime() {
            return this.ipv6LeaseTime;
        }

        public GetDhcpOptionsSetResponseBodyDhcpOptions setLeaseTime(String leaseTime) {
            this.leaseTime = leaseTime;
            return this;
        }
        public String getLeaseTime() {
            return this.leaseTime;
        }

    }

    public static class GetDhcpOptionsSetResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetDhcpOptionsSetResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetDhcpOptionsSetResponseBodyTags self = new GetDhcpOptionsSetResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetDhcpOptionsSetResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetDhcpOptionsSetResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
