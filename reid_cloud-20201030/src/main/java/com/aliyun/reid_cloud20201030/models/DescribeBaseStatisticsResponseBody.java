// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeBaseStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CursorTime")
    public String cursorTime;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("BaseStatistics")
    public DescribeBaseStatisticsResponseBodyBaseStatistics baseStatistics;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeBaseStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseStatisticsResponseBody self = new DescribeBaseStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBaseStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBaseStatisticsResponseBody setCursorTime(String cursorTime) {
        this.cursorTime = cursorTime;
        return this;
    }
    public String getCursorTime() {
        return this.cursorTime;
    }

    public DescribeBaseStatisticsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeBaseStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeBaseStatisticsResponseBody setBaseStatistics(DescribeBaseStatisticsResponseBodyBaseStatistics baseStatistics) {
        this.baseStatistics = baseStatistics;
        return this;
    }
    public DescribeBaseStatisticsResponseBodyBaseStatistics getBaseStatistics() {
        return this.baseStatistics;
    }

    public DescribeBaseStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Count")
        public Integer count;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItems extends TeaModel {
        @NameInMap("AgeItem")
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem> ageItem;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItems self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItems();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItems setAgeItem(java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem> ageItem) {
            this.ageItem = ageItem;
            return this;
        }
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItemsAgeItem> getAgeItem() {
            return this.ageItem;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem extends TeaModel {
        @NameInMap("StartTs")
        public Long startTs;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("EndTs")
        public Long endTs;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem setStartTs(Long startTs) {
            this.startTs = startTs;
            return this;
        }
        public Long getStartTs() {
            return this.startTs;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem setEndTs(Long endTs) {
            this.endTs = endTs;
            return this;
        }
        public Long getEndTs() {
            return this.endTs;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItems extends TeaModel {
        @NameInMap("StayDistributionItem")
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem> stayDistributionItem;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItems self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItems();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItems setStayDistributionItem(java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem> stayDistributionItem) {
            this.stayDistributionItem = stayDistributionItem;
            return this;
        }
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItemsStayDistributionItem> getStayDistributionItem() {
            return this.stayDistributionItem;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Count")
        public Integer count;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItems extends TeaModel {
        @NameInMap("AgeItem")
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem> ageItem;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItems self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItems();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItems setAgeItem(java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem> ageItem) {
            this.ageItem = ageItem;
            return this;
        }
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItemsAgeItem> getAgeItem() {
            return this.ageItem;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Count")
        public Integer count;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItems extends TeaModel {
        @NameInMap("AgeItem")
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem> ageItem;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItems self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItems();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItems setAgeItem(java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem> ageItem) {
            this.ageItem = ageItem;
            return this;
        }
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItemsAgeItem> getAgeItem() {
            return this.ageItem;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics extends TeaModel {
        @NameInMap("StayPeriod")
        public Long stayPeriod;

        @NameInMap("MaleAgeItems")
        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItems maleAgeItems;

        @NameInMap("StayDistributionItems")
        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItems stayDistributionItems;

        @NameInMap("OnlyBodyUvCount")
        public Integer onlyBodyUvCount;

        @NameInMap("Time")
        public String time;

        @NameInMap("UvCount")
        public Integer uvCount;

        @NameInMap("MaleUvCount")
        public Integer maleUvCount;

        @NameInMap("SummaryType")
        public String summaryType;

        @NameInMap("FemaleUvCount")
        public Integer femaleUvCount;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("OldCount")
        public Integer oldCount;

        @NameInMap("LocationId")
        public Long locationId;

        @NameInMap("AgeItems")
        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItems ageItems;

        @NameInMap("NewCount")
        public Integer newCount;

        @NameInMap("FemaleAgeItems")
        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItems femaleAgeItems;

        public static DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics self = new DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setStayPeriod(Long stayPeriod) {
            this.stayPeriod = stayPeriod;
            return this;
        }
        public Long getStayPeriod() {
            return this.stayPeriod;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setMaleAgeItems(DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItems maleAgeItems) {
            this.maleAgeItems = maleAgeItems;
            return this;
        }
        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsMaleAgeItems getMaleAgeItems() {
            return this.maleAgeItems;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setStayDistributionItems(DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItems stayDistributionItems) {
            this.stayDistributionItems = stayDistributionItems;
            return this;
        }
        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsStayDistributionItems getStayDistributionItems() {
            return this.stayDistributionItems;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setOnlyBodyUvCount(Integer onlyBodyUvCount) {
            this.onlyBodyUvCount = onlyBodyUvCount;
            return this;
        }
        public Integer getOnlyBodyUvCount() {
            return this.onlyBodyUvCount;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setUvCount(Integer uvCount) {
            this.uvCount = uvCount;
            return this;
        }
        public Integer getUvCount() {
            return this.uvCount;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setMaleUvCount(Integer maleUvCount) {
            this.maleUvCount = maleUvCount;
            return this;
        }
        public Integer getMaleUvCount() {
            return this.maleUvCount;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setSummaryType(String summaryType) {
            this.summaryType = summaryType;
            return this;
        }
        public String getSummaryType() {
            return this.summaryType;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setFemaleUvCount(Integer femaleUvCount) {
            this.femaleUvCount = femaleUvCount;
            return this;
        }
        public Integer getFemaleUvCount() {
            return this.femaleUvCount;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setOldCount(Integer oldCount) {
            this.oldCount = oldCount;
            return this;
        }
        public Integer getOldCount() {
            return this.oldCount;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setAgeItems(DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItems ageItems) {
            this.ageItems = ageItems;
            return this;
        }
        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsAgeItems getAgeItems() {
            return this.ageItems;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setNewCount(Integer newCount) {
            this.newCount = newCount;
            return this;
        }
        public Integer getNewCount() {
            return this.newCount;
        }

        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics setFemaleAgeItems(DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItems femaleAgeItems) {
            this.femaleAgeItems = femaleAgeItems;
            return this;
        }
        public DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatisticsFemaleAgeItems getFemaleAgeItems() {
            return this.femaleAgeItems;
        }

    }

    public static class DescribeBaseStatisticsResponseBodyBaseStatistics extends TeaModel {
        @NameInMap("BaseStatistics")
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics> baseStatistics;

        public static DescribeBaseStatisticsResponseBodyBaseStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseStatisticsResponseBodyBaseStatistics self = new DescribeBaseStatisticsResponseBodyBaseStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeBaseStatisticsResponseBodyBaseStatistics setBaseStatistics(java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics> baseStatistics) {
            this.baseStatistics = baseStatistics;
            return this;
        }
        public java.util.List<DescribeBaseStatisticsResponseBodyBaseStatisticsBaseStatistics> getBaseStatistics() {
            return this.baseStatistics;
        }

    }

}
