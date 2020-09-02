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

    public DescribeIPv6TranslatorsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPv6TranslatorsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIPv6TranslatorsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIPv6TranslatorsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIPv6TranslatorsResponse setIpv6Translators(DescribeIPv6TranslatorsResponseIpv6Translators ipv6Translators) {
        this.ipv6Translators = ipv6Translators;
        return this;
    }
    public DescribeIPv6TranslatorsResponseIpv6Translators getIpv6Translators() {
        return this.ipv6Translators;
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

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds setIpv6TranslatorEntryId(java.util.List<String> ipv6TranslatorEntryId) {
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
            return this;
        }
        public java.util.List<String> getIpv6TranslatorEntryId() {
            return this.ipv6TranslatorEntryId;
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

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setIpv6TranslatorId(String ipv6TranslatorId) {
            this.ipv6TranslatorId = ipv6TranslatorId;
            return this;
        }
        public String getIpv6TranslatorId() {
            return this.ipv6TranslatorId;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setAllocateIpv6Addr(String allocateIpv6Addr) {
            this.allocateIpv6Addr = allocateIpv6Addr;
            return this;
        }
        public String getAllocateIpv6Addr() {
            return this.allocateIpv6Addr;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setAllocateIpv4Addr(String allocateIpv4Addr) {
            this.allocateIpv4Addr = allocateIpv4Addr;
            return this;
        }
        public String getAllocateIpv4Addr() {
            return this.allocateIpv4Addr;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setAvailableBandwidth(String availableBandwidth) {
            this.availableBandwidth = availableBandwidth;
            return this;
        }
        public String getAvailableBandwidth() {
            return this.availableBandwidth;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator setIpv6TranslatorEntryIds(DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds ipv6TranslatorEntryIds) {
            this.ipv6TranslatorEntryIds = ipv6TranslatorEntryIds;
            return this;
        }
        public DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6TranslatorIpv6TranslatorEntryIds getIpv6TranslatorEntryIds() {
            return this.ipv6TranslatorEntryIds;
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

        public DescribeIPv6TranslatorsResponseIpv6Translators setIpv6Translator(java.util.List<DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator> ipv6Translator) {
            this.ipv6Translator = ipv6Translator;
            return this;
        }
        public java.util.List<DescribeIPv6TranslatorsResponseIpv6TranslatorsIpv6Translator> getIpv6Translator() {
            return this.ipv6Translator;
        }

    }

}
