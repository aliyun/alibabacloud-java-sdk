// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesResponseBody extends TeaModel {
    /**
     * <p>The details of DNAT entries.</p>
     */
    @NameInMap("ForwardTableEntries")
    public DescribeForwardTableEntriesResponseBodyForwardTableEntries forwardTableEntries;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeForwardTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesResponseBody self = new DescribeForwardTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesResponseBody setForwardTableEntries(DescribeForwardTableEntriesResponseBodyForwardTableEntries forwardTableEntries) {
        this.forwardTableEntries = forwardTableEntries;
        return this;
    }
    public DescribeForwardTableEntriesResponseBodyForwardTableEntries getForwardTableEntries() {
        return this.forwardTableEntries;
    }

    public DescribeForwardTableEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeForwardTableEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeForwardTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeForwardTableEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry extends TeaModel {
        /**
         * <p>*   The EIPs that can be accessed over the Internet when you query DNAT entries of Internet NAT gateways.</p>
         * <p>*   The NAT IP addresses that can be accessed by external networks when you query DNAT entries of VPC NAT gateways.</p>
         */
        @NameInMap("ExternalIp")
        public String externalIp;

        /**
         * <p>*   The external port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.</p>
         * <p>*   The port that is used when the NAT IP address can be accessed by external networks when you query DNAT entries of VPC NAT gateways.</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The ID of the DNAT entry.</p>
         */
        @NameInMap("ForwardEntryId")
        public String forwardEntryId;

        /**
         * <p>The name of the DNAT entry.</p>
         */
        @NameInMap("ForwardEntryName")
        public String forwardEntryName;

        /**
         * <p>The ID of the DNAT table to which the DNAT entry belongs.</p>
         */
        @NameInMap("ForwardTableId")
        public String forwardTableId;

        /**
         * <p>The private IP address.</p>
         * <br>
         * <p>*   The private IP address of the ECS instance that uses DNAT entries to communicate with the Internet when you query DNAT entries of Internet NAT gateways.</p>
         * <p>*   The private IP address that uses DNAT entries when you query DNAT entries of VPC NAT gateways.</p>
         */
        @NameInMap("InternalIp")
        public String internalIp;

        /**
         * <p>*   The internal port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.</p>
         * <p>*   The destination ECS instance port to be mapped when you query DNAT entries of VPC NAT gateways.</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        /**
         * <p>The protocol. Valid values:</p>
         * <br>
         * <p>*   **TCP**</p>
         * <p>*   **UDP**</p>
         * <p>*   **Any**</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The ID of the NAT gateway to which the DNAT entry belongs.</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The status of the DNAT entry. Valid values:</p>
         * <br>
         * <p>*   **Pending**</p>
         * <p>*   **Available**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry self = new DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setForwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }
        public String getForwardEntryId() {
            return this.forwardEntryId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setForwardEntryName(String forwardEntryName) {
            this.forwardEntryName = forwardEntryName;
            return this;
        }
        public String getForwardEntryName() {
            return this.forwardEntryName;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setForwardTableId(String forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public String getForwardTableId() {
            return this.forwardTableId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeForwardTableEntriesResponseBodyForwardTableEntries extends TeaModel {
        @NameInMap("ForwardTableEntry")
        public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> forwardTableEntry;

        public static DescribeForwardTableEntriesResponseBodyForwardTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseBodyForwardTableEntries self = new DescribeForwardTableEntriesResponseBodyForwardTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setForwardTableEntry(java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> forwardTableEntry) {
            this.forwardTableEntry = forwardTableEntry;
            return this;
        }
        public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> getForwardTableEntry() {
            return this.forwardTableEntry;
        }

    }

}
