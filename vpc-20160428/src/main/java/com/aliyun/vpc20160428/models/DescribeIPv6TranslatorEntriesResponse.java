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

    }

    public static class DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries extends TeaModel {
        @NameInMap("Ipv6TranslatorEntry")
        @Validation(required = true)
        public java.util.List<DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntriesIpv6TranslatorEntry> ipv6TranslatorEntry;

        public static DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries self = new DescribeIPv6TranslatorEntriesResponseIpv6TranslatorEntries();
            return TeaModel.build(map, self);
        }

    }

}
