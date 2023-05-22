// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorEntriesResponseBody extends TeaModel {
    /**
     * <p>The IPv6 mapping entries that are queried.</p>
     */
    @NameInMap("Ipv6TranslatorEntries")
    public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntries ipv6TranslatorEntries;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
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

    public static DescribeIPv6TranslatorEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorEntriesResponseBody self = new DescribeIPv6TranslatorEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorEntriesResponseBody setIpv6TranslatorEntries(DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntries ipv6TranslatorEntries) {
        this.ipv6TranslatorEntries = ipv6TranslatorEntries;
        return this;
    }
    public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntries getIpv6TranslatorEntries() {
        return this.ipv6TranslatorEntries;
    }

    public DescribeIPv6TranslatorEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPv6TranslatorEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry extends TeaModel {
        /**
         * <p>The ID of the associated ACL.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>Indicates whether ACLs are enabled.</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The ACL type.</p>
         * <br>
         * <p>*   **white**: a whitelist. IPv6 addresses in the ACL are allowed to access backend services.</p>
         * <p>*   **black**: a blacklist. IPv6 addresses in the ACL are not allowed to access backend services.</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The IPv6 address allocated to the IPv6 Translation Service instance.</p>
         */
        @NameInMap("AllocateIpv6Addr")
        public String allocateIpv6Addr;

        /**
         * <p>The port used by the IPv6 address allocated to the IPv6 Translation Service instance.</p>
         */
        @NameInMap("AllocateIpv6Port")
        public Integer allocateIpv6Port;

        /**
         * <p>The public IP address of the backend IPv4 server.</p>
         */
        @NameInMap("BackendIpv4Addr")
        public String backendIpv4Addr;

        /**
         * <p>The public IPv4 port used by the IPv4 server that needs to provide IPv6 access.</p>
         */
        @NameInMap("BackendIpv4Port")
        public String backendIpv4Port;

        /**
         * <p>The bandwidth specified in the IPv6 mapping entry.</p>
         */
        @NameInMap("EntryBandwidth")
        public String entryBandwidth;

        /**
         * <p>The description of the IPv6 mapping entry.</p>
         */
        @NameInMap("EntryDescription")
        public String entryDescription;

        /**
         * <p>The name of the IPv6 mapping entry.</p>
         */
        @NameInMap("EntryName")
        public String entryName;

        /**
         * <p>The status of the IPv6 mapping entry.</p>
         */
        @NameInMap("EntryStatus")
        public String entryStatus;

        /**
         * <p>The ID of the IPv6 mapping entry.</p>
         */
        @NameInMap("Ipv6TranslatorEntryId")
        public String ipv6TranslatorEntryId;

        /**
         * <p>The ID of the IPv6 Translation Service instance to which the IPv6 mapping entry belongs.</p>
         */
        @NameInMap("Ipv6TranslatorId")
        public String ipv6TranslatorId;

        /**
         * <p>The region of the IPv6 Translation Service instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The protocol.</p>
         */
        @NameInMap("TransProtocol")
        public String transProtocol;

        public static DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry self = new DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setAllocateIpv6Addr(String allocateIpv6Addr) {
            this.allocateIpv6Addr = allocateIpv6Addr;
            return this;
        }
        public String getAllocateIpv6Addr() {
            return this.allocateIpv6Addr;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setAllocateIpv6Port(Integer allocateIpv6Port) {
            this.allocateIpv6Port = allocateIpv6Port;
            return this;
        }
        public Integer getAllocateIpv6Port() {
            return this.allocateIpv6Port;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setBackendIpv4Addr(String backendIpv4Addr) {
            this.backendIpv4Addr = backendIpv4Addr;
            return this;
        }
        public String getBackendIpv4Addr() {
            return this.backendIpv4Addr;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setBackendIpv4Port(String backendIpv4Port) {
            this.backendIpv4Port = backendIpv4Port;
            return this;
        }
        public String getBackendIpv4Port() {
            return this.backendIpv4Port;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setEntryBandwidth(String entryBandwidth) {
            this.entryBandwidth = entryBandwidth;
            return this;
        }
        public String getEntryBandwidth() {
            return this.entryBandwidth;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setEntryDescription(String entryDescription) {
            this.entryDescription = entryDescription;
            return this;
        }
        public String getEntryDescription() {
            return this.entryDescription;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setEntryName(String entryName) {
            this.entryName = entryName;
            return this;
        }
        public String getEntryName() {
            return this.entryName;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setEntryStatus(String entryStatus) {
            this.entryStatus = entryStatus;
            return this;
        }
        public String getEntryStatus() {
            return this.entryStatus;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
            return this;
        }
        public String getIpv6TranslatorEntryId() {
            return this.ipv6TranslatorEntryId;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setIpv6TranslatorId(String ipv6TranslatorId) {
            this.ipv6TranslatorId = ipv6TranslatorId;
            return this;
        }
        public String getIpv6TranslatorId() {
            return this.ipv6TranslatorId;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry setTransProtocol(String transProtocol) {
            this.transProtocol = transProtocol;
            return this;
        }
        public String getTransProtocol() {
            return this.transProtocol;
        }

    }

    public static class DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntries extends TeaModel {
        @NameInMap("Ipv6TranslatorEntry")
        public java.util.List<DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry> ipv6TranslatorEntry;

        public static DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntries self = new DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntries();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntries setIpv6TranslatorEntry(java.util.List<DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry> ipv6TranslatorEntry) {
            this.ipv6TranslatorEntry = ipv6TranslatorEntry;
            return this;
        }
        public java.util.List<DescribeIPv6TranslatorEntriesResponseBodyIpv6TranslatorEntriesIpv6TranslatorEntry> getIpv6TranslatorEntry() {
            return this.ipv6TranslatorEntry;
        }

    }

}
