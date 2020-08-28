// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorsResponse extends TeaModel {
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

    @NameInMap("Ipv6Translators")
    @Validation(required = true)
    public DescribeIPv6TranslatorsResponseIpv6Translators ipv6Translators;

    public static DescribeIPv6TranslatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorsResponse self = new DescribeIPv6TranslatorsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds extends TeaModel {
        // Ipv6TranslatorEntryId
        @NameInMap("Ipv6TranslatorEntryId")
        @Validation(required = true)
        public java.util.List<String> ipv6TranslatorEntryId;

        public static DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds self = new DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator extends TeaModel {
        @NameInMap("Ipv6TranslatorId")
        @Validation(required = true)
        public String ipv6TranslatorId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("AllocateIpv6Addr")
        @Validation(required = true)
        public String allocateIpv6Addr;

        @NameInMap("AllocateIpv4Addr")
        @Validation(required = true)
        public String allocateIpv4Addr;

        @NameInMap("AvailableBandwidth")
        @Validation(required = true)
        public String availableBandwidth;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Ipv6TranslatorEntryIds")
        @Validation(required = true)
        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds ipv6TranslatorEntryIds;

        public static DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator self = new DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeIPv6TranslatorsResponseIpv6Translators extends TeaModel {
        @NameInMap("Ipv6Translator")
        @Validation(required = true)
        public java.util.List<DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator> ipv6Translator;

        public static DescribeIPv6TranslatorsResponseIpv6Translators build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorsResponseIpv6Translators self = new DescribeIPv6TranslatorsResponseIpv6Translators();
            return TeaModel.build(map, self);
        }

    }

}
