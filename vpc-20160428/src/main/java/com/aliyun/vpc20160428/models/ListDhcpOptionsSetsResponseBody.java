// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListDhcpOptionsSetsResponseBody extends TeaModel {
    /**
     * <p>The list of the DHCP options sets.</p>
     */
    @NameInMap("DhcpOptionsSets")
    public java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSets> dhcpOptionsSets;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is used to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd********</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListDhcpOptionsSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDhcpOptionsSetsResponseBody self = new ListDhcpOptionsSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDhcpOptionsSetsResponseBody setDhcpOptionsSets(java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSets> dhcpOptionsSets) {
        this.dhcpOptionsSets = dhcpOptionsSets;
        return this;
    }
    public java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSets> getDhcpOptionsSets() {
        return this.dhcpOptionsSets;
    }

    public ListDhcpOptionsSetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDhcpOptionsSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDhcpOptionsSetsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions extends TeaModel {
        /**
         * <p>The suffix of the hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The IP address of the DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("DomainNameServers")
        public String domainNameServers;

        /**
         * <p>The lease time of the IPv6 addresses for the DHCP options set.</p>
         * <ul>
         * <li>If you use hours as the unit, valid values are <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>87600h</strong>.</li>
         * <li>If you use days as the unit, valid values are <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>3650d</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3650d</p>
         */
        @NameInMap("Ipv6LeaseTime")
        public String ipv6LeaseTime;

        /**
         * <p>The lease time of the IPv4 addresses for the DHCP options set.</p>
         * <ul>
         * <li>If you use hours as the unit, valid values are <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>87600h</strong>.</li>
         * <li>If you use days as the unit, valid values are <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>3650d</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3650d</p>
         */
        @NameInMap("LeaseTime")
        public String leaseTime;

        public static ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions build(java.util.Map<String, ?> map) throws Exception {
            ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions self = new ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions();
            return TeaModel.build(map, self);
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions setDomainNameServers(String domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public String getDomainNameServers() {
            return this.domainNameServers;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions setIpv6LeaseTime(String ipv6LeaseTime) {
            this.ipv6LeaseTime = ipv6LeaseTime;
            return this;
        }
        public String getIpv6LeaseTime() {
            return this.ipv6LeaseTime;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions setLeaseTime(String leaseTime) {
            this.leaseTime = leaseTime;
            return this;
        }
        public String getLeaseTime() {
            return this.leaseTime;
        }

    }

    public static class ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags extends TeaModel {
        /**
         * <p>The key of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags build(java.util.Map<String, ?> map) throws Exception {
            ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags self = new ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags();
            return TeaModel.build(map, self);
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDhcpOptionsSetsResponseBodyDhcpOptionsSets extends TeaModel {
        /**
         * <p>The number of VPCs with which the DHCP options set is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AssociateVpcCount")
        public Integer associateVpcCount;

        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The configuration information about the DHCP options set.</p>
         */
        @NameInMap("DhcpOptions")
        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions dhcpOptions;

        /**
         * <p>The description of the DHCP options set.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DhcpOptionsSetDescription")
        public String dhcpOptionsSetDescription;

        /**
         * <p>The ID of the DHCP options set.</p>
         * 
         * <strong>example:</strong>
         * <p>dopt-o6w0df4epg9zo8isy****</p>
         */
        @NameInMap("DhcpOptionsSetId")
        public String dhcpOptionsSetId;

        /**
         * <p>The name of the DHCP options set.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DhcpOptionsSetName")
        public String dhcpOptionsSetName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the DHCP options set belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The ID of the resource group to which the DHCP options set belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the DHCP options set. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong></li>
         * <li><strong>InUse</strong></li>
         * <li><strong>Pending</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags> tags;

        public static ListDhcpOptionsSetsResponseBodyDhcpOptionsSets build(java.util.Map<String, ?> map) throws Exception {
            ListDhcpOptionsSetsResponseBodyDhcpOptionsSets self = new ListDhcpOptionsSetsResponseBodyDhcpOptionsSets();
            return TeaModel.build(map, self);
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setAssociateVpcCount(Integer associateVpcCount) {
            this.associateVpcCount = associateVpcCount;
            return this;
        }
        public Integer getAssociateVpcCount() {
            return this.associateVpcCount;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setDhcpOptions(ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions dhcpOptions) {
            this.dhcpOptions = dhcpOptions;
            return this;
        }
        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsDhcpOptions getDhcpOptions() {
            return this.dhcpOptions;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
            this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
            return this;
        }
        public String getDhcpOptionsSetDescription() {
            return this.dhcpOptionsSetDescription;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setDhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }
        public String getDhcpOptionsSetId() {
            return this.dhcpOptionsSetId;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setDhcpOptionsSetName(String dhcpOptionsSetName) {
            this.dhcpOptionsSetName = dhcpOptionsSetName;
            return this;
        }
        public String getDhcpOptionsSetName() {
            return this.dhcpOptionsSetName;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDhcpOptionsSetsResponseBodyDhcpOptionsSets setTags(java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListDhcpOptionsSetsResponseBodyDhcpOptionsSetsTags> getTags() {
            return this.tags;
        }

    }

}
