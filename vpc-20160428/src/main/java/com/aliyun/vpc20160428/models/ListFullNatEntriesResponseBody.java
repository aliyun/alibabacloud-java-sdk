// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListFullNatEntriesResponseBody extends TeaModel {
    /**
     * <p>The frontend port that is used for port mapping in FULLNAT entries. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("FullNatEntries")
    public java.util.List<ListFullNatEntriesResponseBodyFullNatEntries> fullNatEntries;

    /**
     * <p>Indicates whether the token for the next query exists. Valid values:</p>
     * <br>
     * <p>*   If the value of **NextToken** is empty, no next queries are sent.</p>
     * <p>*   If the value of **NextToken** is returned, the value indicates the token that is used for the next query.</p>
     */
    @NameInMap("FullNatTableId")
    public String fullNatTableId;

    /**
     * <p>The NAT IP address that is used for address translation in FULLNAT entries.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The number of FULLNAT entries returned.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The information about the FULLNAT entries that are queried.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the FULLNAT table to which the queried FULLNAT entries belong.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of entries returned.</p>
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
         * <p>The protocol of the packets that are forwarded. Valid values:</p>
         * <br>
         * <p>*   **TCP**</p>
         * <p>*   **UDP**</p>
         */
        @NameInMap("AccessIp")
        public String accessIp;

        /**
         * <p>The ID of the ENI.</p>
         */
        @NameInMap("AccessPort")
        public String accessPort;

        /**
         * <p>The status of the FULLNAT entry. Valid values:</p>
         * <br>
         * <p>*   **Pending**: The FULLNAT entry is being configured.</p>
         * <p>*   **Available**: The FULLNAT entry is available.</p>
         * <p>*   **Deleting**: The FULLNAT entry is being deleted.</p>
         * <p>*   **Deleted**: The FULLNAT entry is deleted.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the FULLNAT entry.</p>
         */
        @NameInMap("FullNatEntryDescription")
        public String fullNatEntryDescription;

        /**
         * <p>The ID of the FULLNAT table to which the FULLNAT entry belongs.</p>
         */
        @NameInMap("FullNatEntryId")
        public String fullNatEntryId;

        /**
         * <p>The time when the FULLNAT entry was created.</p>
         */
        @NameInMap("FullNatEntryName")
        public String fullNatEntryName;

        @NameInMap("FullNatEntryStatus")
        public String fullNatEntryStatus;

        @NameInMap("FullNatTableId")
        public String fullNatTableId;

        /**
         * <p>The type of the ENI. The value is set to **Endpoint**, which indicates a reverse endpoint.</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The backend IP address that is used for FULLNAT address translation in FULLNAT entries.</p>
         */
        @NameInMap("NatIp")
        public String natIp;

        /**
         * <p>The backend port that is used for port mapping in FULLNAT entries. Valid values: **1** to **65535**.</p>
         */
        @NameInMap("NatIpPort")
        public String natIpPort;

        /**
         * <p>The name of the FULLNAT entry.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The description of the FULLNAT entry.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
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
