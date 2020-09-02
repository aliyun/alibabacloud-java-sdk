// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorEntriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Ipv6TranslatorEntries")
    @Validation(required = true)
    public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries ipv6TranslatorEntries;

    public static DescribeIPv6TranslatorEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorEntriesResponse self = new DescribeIPv6TranslatorEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorEntriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPv6TranslatorEntriesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIPv6TranslatorEntriesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorEntriesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorEntriesResponse setIpv6TranslatorEntries(DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries ipv6TranslatorEntries) {
        this.ipv6TranslatorEntries = ipv6TranslatorEntries;
        return this;
    }
    public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries getIpv6TranslatorEntries() {
        return this.ipv6TranslatorEntries;
    }

    public static class DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry extends TeaModel {
        @NameInMap("Ipv6TranslatorId")
        @Validation(required = true)
        public String ipv6TranslatorId;

        @NameInMap("Ipv6TranslatorEntryId")
        @Validation(required = true)
        public String ipv6TranslatorEntryId;

        @NameInMap("AllocateIpv6Addr")
        @Validation(required = true)
        public String allocateIpv6Addr;

        @NameInMap("AllocateIpv6Port")
        @Validation(required = true)
        public Integer allocateIpv6Port;

        @NameInMap("BackendIpv4Addr")
        @Validation(required = true)
        public String backendIpv4Addr;

        @NameInMap("BackendIpv4Port")
        @Validation(required = true)
        public String backendIpv4Port;

        @NameInMap("TransProtocol")
        @Validation(required = true)
        public String transProtocol;

        @NameInMap("EntryBandwidth")
        @Validation(required = true)
        public String entryBandwidth;

        @NameInMap("EntryDescription")
        @Validation(required = true)
        public String entryDescription;

        @NameInMap("EntryName")
        @Validation(required = true)
        public String entryName;

        @NameInMap("EntryStatus")
        @Validation(required = true)
        public String entryStatus;

        @NameInMap("AclStatus")
        @Validation(required = true)
        public String aclStatus;

        @NameInMap("AclType")
        @Validation(required = true)
        public String aclType;

        @NameInMap("AclId")
        @Validation(required = true)
        public String aclId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry self = new DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setIpv6TranslatorId(String ipv6TranslatorId) {
            this.ipv6TranslatorId = ipv6TranslatorId;
            return this;
        }
        public String getIpv6TranslatorId() {
            return this.ipv6TranslatorId;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
            return this;
        }
        public String getIpv6TranslatorEntryId() {
            return this.ipv6TranslatorEntryId;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setAllocateIpv6Addr(String allocateIpv6Addr) {
            this.allocateIpv6Addr = allocateIpv6Addr;
            return this;
        }
        public String getAllocateIpv6Addr() {
            return this.allocateIpv6Addr;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setAllocateIpv6Port(Integer allocateIpv6Port) {
            this.allocateIpv6Port = allocateIpv6Port;
            return this;
        }
        public Integer getAllocateIpv6Port() {
            return this.allocateIpv6Port;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setBackendIpv4Addr(String backendIpv4Addr) {
            this.backendIpv4Addr = backendIpv4Addr;
            return this;
        }
        public String getBackendIpv4Addr() {
            return this.backendIpv4Addr;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setBackendIpv4Port(String backendIpv4Port) {
            this.backendIpv4Port = backendIpv4Port;
            return this;
        }
        public String getBackendIpv4Port() {
            return this.backendIpv4Port;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setTransProtocol(String transProtocol) {
            this.transProtocol = transProtocol;
            return this;
        }
        public String getTransProtocol() {
            return this.transProtocol;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setEntryBandwidth(String entryBandwidth) {
            this.entryBandwidth = entryBandwidth;
            return this;
        }
        public String getEntryBandwidth() {
            return this.entryBandwidth;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setEntryDescription(String entryDescription) {
            this.entryDescription = entryDescription;
            return this;
        }
        public String getEntryDescription() {
            return this.entryDescription;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setEntryName(String entryName) {
            this.entryName = entryName;
            return this;
        }
        public String getEntryName() {
            return this.entryName;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setEntryStatus(String entryStatus) {
            this.entryStatus = entryStatus;
            return this;
        }
        public String getEntryStatus() {
            return this.entryStatus;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries extends TeaModel {
        @NameInMap("Ipv6TranslatorEntry")
        @Validation(required = true)
        public java.util.List<DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry> ipv6TranslatorEntry;

        public static DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries self = new DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries setIpv6TranslatorEntry(java.util.List<DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry> ipv6TranslatorEntry) {
            this.ipv6TranslatorEntry = ipv6TranslatorEntry;
            return this;
        }
        public java.util.List<DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry> getIpv6TranslatorEntry() {
            return this.ipv6TranslatorEntry;
        }

    }

}
