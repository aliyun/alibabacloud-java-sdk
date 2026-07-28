// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpsResponseBody extends TeaModel {
    /**
     * <p>The list of NAT IP addresses.</p>
     */
    @NameInMap("NatIps")
    public java.util.List<ListNatIpsResponseBodyNatIps> natIps;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E78CEEA-BF8F-44D1-9DCD-D9141135B71E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of NAT IP addresses returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListNatIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpsResponseBody self = new ListNatIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNatIpsResponseBody setNatIps(java.util.List<ListNatIpsResponseBodyNatIps> natIps) {
        this.natIps = natIps;
        return this;
    }
    public java.util.List<ListNatIpsResponseBodyNatIps> getNatIps() {
        return this.natIps;
    }

    public ListNatIpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNatIpsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListNatIpsResponseBodyNatIps extends TeaModel {
        /**
         * <p>The CIDR block of the IP prefix to which the NAT IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/28</p>
         */
        @NameInMap("Ipv4Prefix")
        public String ipv4Prefix;

        /**
         * <p>Indicates whether the NAT IP address is the default one. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The NAT IP address is the default one.</p>
         * </li>
         * <li><p><strong>false</strong>: The NAT IP address is not the default one.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The instance ID of the VPC NAT gateway to which the NAT IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw8v16wgvtq26vh59****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.126</p>
         */
        @NameInMap("NatIp")
        public String natIp;

        /**
         * <p>The CIDR block to which the NAT IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("NatIpCidr")
        public String natIpCidr;

        /**
         * <p>The description of the NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("NatIpDescription")
        public String natIpDescription;

        /**
         * <p>The instance ID of the NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatip-gw8a863sut1zijxh0****</p>
         */
        @NameInMap("NatIpId")
        public String natIpId;

        /**
         * <p>The name of the NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("NatIpName")
        public String natIpName;

        /**
         * <p>The status of the NAT IP address. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong>: available.</li>
         * <li><strong>Deleted</strong>: deleted.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * <li><strong>Creating</strong>: being created.</li>
         * <li><strong>Associated</strong>: associated with an SNAT or DNAT entry.</li>
         * <li><strong>Associating</strong>: being associated with an SNAT or DNAT entry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("NatIpStatus")
        public String natIpStatus;

        public static ListNatIpsResponseBodyNatIps build(java.util.Map<String, ?> map) throws Exception {
            ListNatIpsResponseBodyNatIps self = new ListNatIpsResponseBodyNatIps();
            return TeaModel.build(map, self);
        }

        public ListNatIpsResponseBodyNatIps setIpv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

        public ListNatIpsResponseBodyNatIps setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListNatIpsResponseBodyNatIps setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public ListNatIpsResponseBodyNatIps setNatIp(String natIp) {
            this.natIp = natIp;
            return this;
        }
        public String getNatIp() {
            return this.natIp;
        }

        public ListNatIpsResponseBodyNatIps setNatIpCidr(String natIpCidr) {
            this.natIpCidr = natIpCidr;
            return this;
        }
        public String getNatIpCidr() {
            return this.natIpCidr;
        }

        public ListNatIpsResponseBodyNatIps setNatIpDescription(String natIpDescription) {
            this.natIpDescription = natIpDescription;
            return this;
        }
        public String getNatIpDescription() {
            return this.natIpDescription;
        }

        public ListNatIpsResponseBodyNatIps setNatIpId(String natIpId) {
            this.natIpId = natIpId;
            return this;
        }
        public String getNatIpId() {
            return this.natIpId;
        }

        public ListNatIpsResponseBodyNatIps setNatIpName(String natIpName) {
            this.natIpName = natIpName;
            return this;
        }
        public String getNatIpName() {
            return this.natIpName;
        }

        public ListNatIpsResponseBodyNatIps setNatIpStatus(String natIpStatus) {
            this.natIpStatus = natIpStatus;
            return this;
        }
        public String getNatIpStatus() {
            return this.natIpStatus;
        }

    }

}
