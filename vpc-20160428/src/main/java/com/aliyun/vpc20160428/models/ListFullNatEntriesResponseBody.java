// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListFullNatEntriesResponseBody extends TeaModel {
    /**
     * <p>The information about the FULLNAT entries that are queried.</p>
     */
    @NameInMap("FullNatEntries")
    public java.util.List<ListFullNatEntriesResponseBodyFullNatEntries> fullNatEntries;

    /**
     * <p>The ID of the FULLNAT table to which the queried FULLNAT entries belong.</p>
     * 
     * <strong>example:</strong>
     * <p>fullnat-gw8fz23jezpbblf1j****</p>
     */
    @NameInMap("FullNatTableId")
    public String fullNatTableId;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The ID of the VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-gw8054kn57y3hq3bv****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>Indicates whether the token for the next query exists. Valid values:</p>
     * <ul>
     * <li>If the value of <strong>NextToken</strong> is empty, no next queries are sent.</li>
     * <li>If the value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F03E41F6-1A74-311F-8D98-124EEE9F37B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of FULLNAT entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFullNatEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFullNatEntriesResponseBody self = new ListFullNatEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFullNatEntriesResponseBody setFullNatEntries(java.util.List<ListFullNatEntriesResponseBodyFullNatEntries> fullNatEntries) {
        this.fullNatEntries = fullNatEntries;
        return this;
    }
    public java.util.List<ListFullNatEntriesResponseBodyFullNatEntries> getFullNatEntries() {
        return this.fullNatEntries;
    }

    public ListFullNatEntriesResponseBody setFullNatTableId(String fullNatTableId) {
        this.fullNatTableId = fullNatTableId;
        return this;
    }
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    public ListFullNatEntriesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListFullNatEntriesResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListFullNatEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFullNatEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFullNatEntriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFullNatEntriesResponseBodyFullNatEntries extends TeaModel {
        /**
         * <p>The backend IP address that is used for FULLNAT address translation in FULLNAT entries.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("AccessIp")
        public String accessIp;

        /**
         * <p>The backend port that is used for port mapping in FULLNAT entries. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("AccessPort")
        public String accessPort;

        /**
         * <p>The time when the FULLNAT entry was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-27T02:44:40Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the FULLNAT entry.</p>
         * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("FullNatEntryDescription")
        public String fullNatEntryDescription;

        /**
         * <p>The ID of the FULLNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>fullnat-gw8fz23jezpbblf1j****</p>
         */
        @NameInMap("FullNatEntryId")
        public String fullNatEntryId;

        /**
         * <p>The name of the FULLNAT entry.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FullNatEntryName")
        public String fullNatEntryName;

        /**
         * <p>The status of the FULLNAT entry. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("FullNatEntryStatus")
        public String fullNatEntryStatus;

        /**
         * <p>The ID of the FULLNAT table to which the FULLNAT entry belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>fulltb-gw88z7hhlv43rmb26****</p>
         */
        @NameInMap("FullNatTableId")
        public String fullNatTableId;

        /**
         * <p>The protocol of the packets that are forwarded. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The NAT IP address that is used for address translation in FULLNAT entries.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("NatIp")
        public String natIp;

        /**
         * <p>The frontend port that is used for port mapping in FULLNAT entries. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("NatIpPort")
        public String natIpPort;

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-gw80wedm8pq0tpr2****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The type of the ENI. The value is set to <strong>Endpoint</strong>, which indicates a reverse endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Endpoint</p>
         */
        @NameInMap("NetworkInterfaceType")
        public String networkInterfaceType;

        public static ListFullNatEntriesResponseBodyFullNatEntries build(java.util.Map<String, ?> map) throws Exception {
            ListFullNatEntriesResponseBodyFullNatEntries self = new ListFullNatEntriesResponseBodyFullNatEntries();
            return TeaModel.build(map, self);
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setAccessIp(String accessIp) {
            this.accessIp = accessIp;
            return this;
        }
        public String getAccessIp() {
            return this.accessIp;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setAccessPort(String accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public String getAccessPort() {
            return this.accessPort;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatEntryDescription(String fullNatEntryDescription) {
            this.fullNatEntryDescription = fullNatEntryDescription;
            return this;
        }
        public String getFullNatEntryDescription() {
            return this.fullNatEntryDescription;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatEntryId(String fullNatEntryId) {
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }
        public String getFullNatEntryId() {
            return this.fullNatEntryId;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatEntryName(String fullNatEntryName) {
            this.fullNatEntryName = fullNatEntryName;
            return this;
        }
        public String getFullNatEntryName() {
            return this.fullNatEntryName;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatEntryStatus(String fullNatEntryStatus) {
            this.fullNatEntryStatus = fullNatEntryStatus;
            return this;
        }
        public String getFullNatEntryStatus() {
            return this.fullNatEntryStatus;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setFullNatTableId(String fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }
        public String getFullNatTableId() {
            return this.fullNatTableId;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setNatIp(String natIp) {
            this.natIp = natIp;
            return this;
        }
        public String getNatIp() {
            return this.natIp;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setNatIpPort(String natIpPort) {
            this.natIpPort = natIpPort;
            return this;
        }
        public String getNatIpPort() {
            return this.natIpPort;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListFullNatEntriesResponseBodyFullNatEntries setNetworkInterfaceType(String networkInterfaceType) {
            this.networkInterfaceType = networkInterfaceType;
            return this;
        }
        public String getNetworkInterfaceType() {
            return this.networkInterfaceType;
        }

    }

}
