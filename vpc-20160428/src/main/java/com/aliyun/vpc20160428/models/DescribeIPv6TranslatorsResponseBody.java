// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Ipv6Translators")
    public DescribeIPv6TranslatorsResponseBodyIpv6Translators ipv6Translators;

    public static DescribeIPv6TranslatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorsResponseBody self = new DescribeIPv6TranslatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIPv6TranslatorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPv6TranslatorsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorsResponseBody setIpv6Translators(DescribeIPv6TranslatorsResponseBodyIpv6Translators ipv6Translators) {
        this.ipv6Translators = ipv6Translators;
        return this;
    }
    public DescribeIPv6TranslatorsResponseBodyIpv6Translators getIpv6Translators() {
        return this.ipv6Translators;
    }

    public static class DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds extends TeaModel {
        @NameInMap("Ipv6TranslatorEntryId")
        public java.util.List<String> ipv6TranslatorEntryId;

        public static DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds self = new DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds setIpv6TranslatorEntryId(java.util.List<String> ipv6TranslatorEntryId) {
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
            return this;
        }
        public java.util.List<String> getIpv6TranslatorEntryId() {
            return this.ipv6TranslatorEntryId;
        }

    }

    public static class DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("AllocateIpv4Addr")
        public String allocateIpv4Addr;

        @NameInMap("Ipv6TranslatorId")
        public String ipv6TranslatorId;

        @NameInMap("Ipv6TranslatorEntryIds")
        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds ipv6TranslatorEntryIds;

        @NameInMap("AvailableBandwidth")
        public String availableBandwidth;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("AllocateIpv6Addr")
        public String allocateIpv6Addr;

        @NameInMap("Name")
        public String name;

        public static DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator self = new DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setAllocateIpv4Addr(String allocateIpv4Addr) {
            this.allocateIpv4Addr = allocateIpv4Addr;
            return this;
        }
        public String getAllocateIpv4Addr() {
            return this.allocateIpv4Addr;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setIpv6TranslatorId(String ipv6TranslatorId) {
            this.ipv6TranslatorId = ipv6TranslatorId;
            return this;
        }
        public String getIpv6TranslatorId() {
            return this.ipv6TranslatorId;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setIpv6TranslatorEntryIds(DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds ipv6TranslatorEntryIds) {
            this.ipv6TranslatorEntryIds = ipv6TranslatorEntryIds;
            return this;
        }
        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds getIpv6TranslatorEntryIds() {
            return this.ipv6TranslatorEntryIds;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setAvailableBandwidth(String availableBandwidth) {
            this.availableBandwidth = availableBandwidth;
            return this;
        }
        public String getAvailableBandwidth() {
            return this.availableBandwidth;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setAllocateIpv6Addr(String allocateIpv6Addr) {
            this.allocateIpv6Addr = allocateIpv6Addr;
            return this;
        }
        public String getAllocateIpv6Addr() {
            return this.allocateIpv6Addr;
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeIPv6TranslatorsResponseBodyIpv6Translators extends TeaModel {
        @NameInMap("Ipv6Translator")
        public java.util.List<DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator> ipv6Translator;

        public static DescribeIPv6TranslatorsResponseBodyIpv6Translators build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPv6TranslatorsResponseBodyIpv6Translators self = new DescribeIPv6TranslatorsResponseBodyIpv6Translators();
            return TeaModel.build(map, self);
        }

        public DescribeIPv6TranslatorsResponseBodyIpv6Translators setIpv6Translator(java.util.List<DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator> ipv6Translator) {
            this.ipv6Translator = ipv6Translator;
            return this;
        }
        public java.util.List<DescribeIPv6TranslatorsResponseBodyIpv6TranslatorsIpv6Translator> getIpv6Translator() {
            return this.ipv6Translator;
        }

    }

}
