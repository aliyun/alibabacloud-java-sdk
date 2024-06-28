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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A6C4A8B1-7561-4509-949C-20DEB40D71E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
         * <ul>
         * <li>The EIPs that can be accessed over the Internet when you query DNAT entries of Internet NAT gateways.</li>
         * <li>The NAT IP addresses that can be accessed by external networks when you query DNAT entries of VPC NAT gateways.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>139.79.XX.XX</p>
         */
        @NameInMap("ExternalIp")
        public String externalIp;

        /**
         * <ul>
         * <li>The external port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.</li>
         * <li>The port that is used when the NAT IP address can be accessed by external networks when you query DNAT entries of VPC NAT gateways.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The ID of the DNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>fwd-119smw5tk****</p>
         */
        @NameInMap("ForwardEntryId")
        public String forwardEntryId;

        /**
         * <p>The name of the DNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardEntry-1</p>
         */
        @NameInMap("ForwardEntryName")
        public String forwardEntryName;

        /**
         * <p>The ID of the DNAT table to which the DNAT entry belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ftb-11tc6xgmv****</p>
         */
        @NameInMap("ForwardTableId")
        public String forwardTableId;

        /**
         * <p>The private IP address.</p>
         * <ul>
         * <li>The private IP address of the ECS instance that uses DNAT entries to communicate with the Internet when you query DNAT entries of Internet NAT gateways.</li>
         * <li>The private IP address that uses DNAT entries when you query DNAT entries of VPC NAT gateways.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InternalIp")
        public String internalIp;

        /**
         * <ul>
         * <li>The internal port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.</li>
         * <li>The destination ECS instance port to be mapped when you query DNAT entries of VPC NAT gateways.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>Any</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The ID of the NAT gateway to which the DNAT entry belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1uewa15k4iy5770****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The status of the DNAT entry. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
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
