// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
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
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6D7E89B1-1C5B-412B-8585-4908E222EED5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of SNAT entries.</p>
     */
    @NameInMap("SnatTableEntries")
    public DescribeSnatTableEntriesResponseBodySnatTableEntries snatTableEntries;

    /**
     * <p>The number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnatTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatTableEntriesResponseBody self = new DescribeSnatTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnatTableEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnatTableEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnatTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnatTableEntriesResponseBody setSnatTableEntries(DescribeSnatTableEntriesResponseBodySnatTableEntries snatTableEntries) {
        this.snatTableEntries = snatTableEntries;
        return this;
    }
    public DescribeSnatTableEntriesResponseBodySnatTableEntries getSnatTableEntries() {
        return this.snatTableEntries;
    }

    public DescribeSnatTableEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry extends TeaModel {
        @NameInMap("EipAffinity")
        public String eipAffinity;

        /**
         * <p>The ID of the NAT gateway to which the SNAT entry belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1uewa15k4iy5770****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The ID of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-kmd6nv8fy****</p>
         */
        @NameInMap("SnatEntryId")
        public String snatEntryId;

        /**
         * <p>The name of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>SnatEntry-1</p>
         */
        @NameInMap("SnatEntryName")
        public String snatEntryName;

        /**
         * <ul>
         * <li>When you query SNAT entries of Internet NAT gateways, this parameter indicates the EIP in an SNAT entry.</li>
         * <li>When you query SNAT entries of VPC NAT gateways, this parameter indicates the NAT IP address in an SNAT entry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>116.22.XX.XX</p>
         */
        @NameInMap("SnatIp")
        public String snatIp;

        /**
         * <p>The ID of the SNAT table to which the SNAT entry belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>stb-gz3r3odawdgffde****</p>
         */
        @NameInMap("SnatTableId")
        public String snatTableId;

        /**
         * <p>The source CIDR block specified in the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>116.22.XX.XX/24</p>
         */
        @NameInMap("SourceCIDR")
        public String sourceCIDR;

        /**
         * <ul>
         * <li>When you query SNAT entries of Internet NAT gateways, this parameter indicates the ID of the vSwitch that uses SNAT to access the Internet.</li>
         * <li>When you query SNAT entries of VPC NAT gateways, this parameter indicates the ID of the vSwitch that uses SNAT to access external networks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-3xbdsffvfgdfds****</p>
         */
        @NameInMap("SourceVSwitchId")
        public String sourceVSwitchId;

        /**
         * <p>The status of the SNAT entry. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry self = new DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setEipAffinity(String eipAffinity) {
            this.eipAffinity = eipAffinity;
            return this;
        }
        public String getEipAffinity() {
            return this.eipAffinity;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSnatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSnatEntryName(String snatEntryName) {
            this.snatEntryName = snatEntryName;
            return this;
        }
        public String getSnatEntryName() {
            return this.snatEntryName;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSnatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }
        public String getSnatIp() {
            return this.snatIp;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSnatTableId(String snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public String getSnatTableId() {
            return this.snatTableId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSourceCIDR(String sourceCIDR) {
            this.sourceCIDR = sourceCIDR;
            return this;
        }
        public String getSourceCIDR() {
            return this.sourceCIDR;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setSourceVSwitchId(String sourceVSwitchId) {
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }
        public String getSourceVSwitchId() {
            return this.sourceVSwitchId;
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSnatTableEntriesResponseBodySnatTableEntries extends TeaModel {
        @NameInMap("SnatTableEntry")
        public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry> snatTableEntry;

        public static DescribeSnatTableEntriesResponseBodySnatTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseBodySnatTableEntries self = new DescribeSnatTableEntriesResponseBodySnatTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseBodySnatTableEntries setSnatTableEntry(java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry> snatTableEntry) {
            this.snatTableEntry = snatTableEntry;
            return this;
        }
        public java.util.List<DescribeSnatTableEntriesResponseBodySnatTableEntriesSnatTableEntry> getSnatTableEntry() {
            return this.snatTableEntry;
        }

    }

}
