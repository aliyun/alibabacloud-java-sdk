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

    }

    public static class DescribeSnatTableEntriesResponseSnatTableEntries extends TeaModel {
        @NameInMap("SnatTableEntry")
        @Validation(required = true)
        public java.util.List<DescribeSnatTableEntriesResponseSnatTableEntriesSnatTableEntry> snatTableEntry;

        public static DescribeSnatTableEntriesResponseSnatTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatTableEntriesResponseSnatTableEntries self = new DescribeSnatTableEntriesResponseSnatTableEntries();
            return TeaModel.build(map, self);
        }

    }

}
