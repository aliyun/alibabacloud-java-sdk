// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewayAssociateNetworkInterfacesResponseBody extends TeaModel {
    @NameInMap("AssociateNetworkInterfaces")
    public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfaces associateNetworkInterfaces;

    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNatGatewayAssociateNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewayAssociateNetworkInterfacesResponseBody self = new DescribeNatGatewayAssociateNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody setAssociateNetworkInterfaces(DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfaces associateNetworkInterfaces) {
        this.associateNetworkInterfaces = associateNetworkInterfaces;
        return this;
    }
    public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfaces getAssociateNetworkInterfaces() {
        return this.associateNetworkInterfaces;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><code>172.17.**.**</code></p>
         */
        @NameInMap("IPv4Address")
        public String IPv4Address;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        public static DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set self = new DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set setIPv4Address(String IPv4Address) {
            this.IPv4Address = IPv4Address;
            return this;
        }
        public String getIPv4Address() {
            return this.IPv4Address;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

    }

    public static class DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4Sets extends TeaModel {
        @NameInMap("IPv4Set")
        public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set> IPv4Set;

        public static DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4Sets self = new DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4Sets();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4Sets setIPv4Set(java.util.List<DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set> IPv4Set) {
            this.IPv4Set = IPv4Set;
            return this;
        }
        public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4SetsIPv4Set> getIPv4Set() {
            return this.IPv4Set;
        }

    }

    public static class DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface extends TeaModel {
        @NameInMap("IPv4Sets")
        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4Sets IPv4Sets;

        /**
         * <strong>example:</strong>
         * <p>eni-gw8g131ef2dnbu3k****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <strong>example:</strong>
         * <p>ep-8psre8c8936596cd****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>138859086900****</p>
         */
        @NameInMap("ResourceOwnerId")
        public String resourceOwnerId;

        /**
         * <strong>example:</strong>
         * <p>PrivateLink</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TunnelIndex")
        public String tunnelIndex;

        public static DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface self = new DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface setIPv4Sets(DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4Sets IPv4Sets) {
            this.IPv4Sets = IPv4Sets;
            return this;
        }
        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterfaceIPv4Sets getIPv4Sets() {
            return this.IPv4Sets;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface setResourceOwnerId(String resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface setTunnelIndex(String tunnelIndex) {
            this.tunnelIndex = tunnelIndex;
            return this;
        }
        public String getTunnelIndex() {
            return this.tunnelIndex;
        }

    }

    public static class DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfaces extends TeaModel {
        @NameInMap("AssociateNetworkInterface")
        public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface> associateNetworkInterface;

        public static DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfaces self = new DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfaces setAssociateNetworkInterface(java.util.List<DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface> associateNetworkInterface) {
            this.associateNetworkInterface = associateNetworkInterface;
            return this;
        }
        public java.util.List<DescribeNatGatewayAssociateNetworkInterfacesResponseBodyAssociateNetworkInterfacesAssociateNetworkInterface> getAssociateNetworkInterface() {
            return this.associateNetworkInterface;
        }

    }

}
