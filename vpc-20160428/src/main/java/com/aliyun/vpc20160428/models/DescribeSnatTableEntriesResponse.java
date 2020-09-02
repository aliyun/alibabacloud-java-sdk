// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponse extends TeaModel {
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

    @NameInMap("SnatTableEntries")
    @Validation(required = true)
    public DescribeSnatTableEntriesResponseSnatTableEntries snatTableEntries;

    public static DescribeSnatTableEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatTableEntriesResponse self = new DescribeSnatTableEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnatTableEntriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnatTableEntriesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSnatTableEntriesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnatTableEntriesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnatTableEntriesResponse setSnatTableEntries(DescribeSnatTableEntriesResponseSnatTableEntries snatTableEntries) {
        this.snatTableEntries = snatTableEntries;
        return this;
    }
    public DescribeSnatTableEntriesResponseSnatTableEntries getSnatTableEntries() {
        return this.snatTableEntries;
    }

    public static class DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry extends TeaModel {
        @NameInMap("SnatTableId")
        @Validation(required = true)
        public String snatTableId;

        @NameInMap("SnatEntryId")
        @Validation(required = true)
        public String snatEntryId;

        @NameInMap("SourceVSwitchId")
        @Validation(required = true)
        public String sourceVSwitchId;

        @NameInMap("SourceCIDR")
        @Validation(required = true)
        public String sourceCIDR;

        @NameInMap("SnatIp")
        @Validation(required = true)
        public String snatIp;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("SnatEntryName")
        @Validation(required = true)
        public String snatEntryName;

        public static DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry self = new DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry setSnatTableId(String snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public String getSnatTableId() {
            return this.snatTableId;
        }

        public DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry setSnatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        public DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry setSourceVSwitchId(String sourceVSwitchId) {
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }
        public String getSourceVSwitchId() {
            return this.sourceVSwitchId;
        }

        public DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry setSourceCIDR(String sourceCIDR) {
            this.sourceCIDR = sourceCIDR;
            return this;
        }
        public String getSourceCIDR() {
            return this.sourceCIDR;
        }

        public DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry setSnatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }
        public String getSnatIp() {
            return this.snatIp;
        }

        public DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry setSnatEntryName(String snatEntryName) {
            this.snatEntryName = snatEntryName;
            return this;
        }
        public String getSnatEntryName() {
            return this.snatEntryName;
        }

    }

    public static class DescribeSnatTableEntriesResponseSnatTableEntries extends TeaModel {
        @NameInMap("SnatTableEntry")
        @Validation(required = true)
        public java.util.List<DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry> snatTableEntry;

        public static DescribeSnatTableEntriesResponseSnatTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseSnatTableEntries self = new DescribeSnatTableEntriesResponseSnatTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeSnatTableEntriesResponseSnatTableEntries setSnatTableEntry(java.util.List<DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry> snatTableEntry) {
            this.snatTableEntry = snatTableEntry;
            return this;
        }
        public java.util.List<DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry> getSnatTableEntry() {
            return this.snatTableEntry;
        }

    }

}
