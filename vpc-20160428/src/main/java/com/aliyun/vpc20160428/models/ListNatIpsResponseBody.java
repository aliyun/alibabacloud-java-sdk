// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpsResponseBody extends TeaModel {
    /**
     * <p>The CIDR block to which the IP address belongs.</p>
     */
    @NameInMap("NatIps")
    public java.util.List<ListNatIpsResponseBodyNatIps> natIps;

    /**
     * <p>The list of IP addresses of the NAT gateway.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Indicates whether the IP address is the default IP address of the NAT gateway. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IP address.</p>
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
         * <p>The ID of the IP address.</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The description of the IP address.</p>
         */
        @NameInMap("NatIp")
        public String natIp;

        /**
         * <p>The ID of the Virtual Private Cloud (VPC) NAT gateway to which the IP address is assigned.</p>
         */
        @NameInMap("NatIpCidr")
        public String natIpCidr;

        /**
         * <p>The status of the IP address. Valid values:</p>
         * <br>
         * <p>*   **Available**: available</p>
         * <p>*   **Deleted**: deleted</p>
         * <p>*   **Deleting**: deleting</p>
         * <p>*   **Creating**: creating</p>
         * <p>*   **Associated**: specified in an SNAT or DNAT entry</p>
         * <p>*   **Associating**: being specified in an SNAT or DNAT entry</p>
         */
        @NameInMap("NatIpDescription")
        public String natIpDescription;

        /**
         * <p>The name of the IP address.</p>
         */
        @NameInMap("NatIpId")
        public String natIpId;

        @NameInMap("NatIpName")
        public String natIpName;

        @NameInMap("NatIpStatus")
        public String natIpStatus;

        public static ListNatIpsResponseBodyNatIps build(java.util.Map<String, ?> map) throws Exception {
            ListNatIpsResponseBodyNatIps self = new ListNatIpsResponseBodyNatIps();
            return TeaModel.build(map, self);
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
