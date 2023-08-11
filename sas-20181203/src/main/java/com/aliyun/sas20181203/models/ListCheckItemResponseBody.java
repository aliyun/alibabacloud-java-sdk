// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemResponseBody extends TeaModel {
    @NameInMap("CheckItems")
    public java.util.List<ListCheckItemResponseBodyCheckItems> checkItems;

    @NameInMap("PageInfo")
    public ListCheckItemResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemResponseBody self = new ListCheckItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckItemResponseBody setCheckItems(java.util.List<ListCheckItemResponseBodyCheckItems> checkItems) {
        this.checkItems = checkItems;
        return this;
    }
    public java.util.List<ListCheckItemResponseBodyCheckItems> getCheckItems() {
        return this.checkItems;
    }

    public ListCheckItemResponseBody setPageInfo(ListCheckItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCheckItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCheckItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckItemResponseBodyCheckItemsCustomConfigs extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("TypeDefine")
        public String typeDefine;

        @NameInMap("Value")
        public String value;

        public static ListCheckItemResponseBodyCheckItemsCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemResponseBodyCheckItemsCustomConfigs self = new ListCheckItemResponseBodyCheckItemsCustomConfigs();
            return TeaModel.build(map, self);
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setTypeDefine(String typeDefine) {
            this.typeDefine = typeDefine;
            return this;
        }
        public String getTypeDefine() {
            return this.typeDefine;
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListCheckItemResponseBodyCheckItemsDescription extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListCheckItemResponseBodyCheckItemsDescription build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemResponseBodyCheckItemsDescription self = new ListCheckItemResponseBodyCheckItemsDescription();
            return TeaModel.build(map, self);
        }

        public ListCheckItemResponseBodyCheckItemsDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCheckItemResponseBodyCheckItemsDescription setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListCheckItemResponseBodyCheckItems extends TeaModel {
        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("CheckShowName")
        public String checkShowName;

        @NameInMap("CustomConfigs")
        public java.util.List<ListCheckItemResponseBodyCheckItemsCustomConfigs> customConfigs;

        @NameInMap("Description")
        public ListCheckItemResponseBodyCheckItemsDescription description;

        @NameInMap("InstanceSubType")
        public String instanceSubType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("SectionIds")
        public java.util.List<Long> sectionIds;

        @NameInMap("Vendor")
        public String vendor;

        public static ListCheckItemResponseBodyCheckItems build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemResponseBodyCheckItems self = new ListCheckItemResponseBodyCheckItems();
            return TeaModel.build(map, self);
        }

        public ListCheckItemResponseBodyCheckItems setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListCheckItemResponseBodyCheckItems setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

        public ListCheckItemResponseBodyCheckItems setCustomConfigs(java.util.List<ListCheckItemResponseBodyCheckItemsCustomConfigs> customConfigs) {
            this.customConfigs = customConfigs;
            return this;
        }
        public java.util.List<ListCheckItemResponseBodyCheckItemsCustomConfigs> getCustomConfigs() {
            return this.customConfigs;
        }

        public ListCheckItemResponseBodyCheckItems setDescription(ListCheckItemResponseBodyCheckItemsDescription description) {
            this.description = description;
            return this;
        }
        public ListCheckItemResponseBodyCheckItemsDescription getDescription() {
            return this.description;
        }

        public ListCheckItemResponseBodyCheckItems setInstanceSubType(String instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        public ListCheckItemResponseBodyCheckItems setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListCheckItemResponseBodyCheckItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListCheckItemResponseBodyCheckItems setSectionIds(java.util.List<Long> sectionIds) {
            this.sectionIds = sectionIds;
            return this;
        }
        public java.util.List<Long> getSectionIds() {
            return this.sectionIds;
        }

        public ListCheckItemResponseBodyCheckItems setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class ListCheckItemResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemResponseBodyPageInfo self = new ListCheckItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCheckItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCheckItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
