// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class LingJieOpenStatusDetail extends TeaModel {
    @NameInMap("ApiList")
    public java.util.List<LingJieOpenStatusDetailApiList> apiList;

    @NameInMap("CommodityConcurrentLimitTips")
    public String commodityConcurrentLimitTips;

    @NameInMap("CommodityHasOpen")
    public Boolean commodityHasOpen;

    @NameInMap("CommodityOpenUrl")
    public String commodityOpenUrl;

    @NameInMap("CommodityUsageTips")
    public String commodityUsageTips;

    @NameInMap("UserStopMode")
    public Boolean userStopMode;

    public static LingJieOpenStatusDetail build(java.util.Map<String, ?> map) throws Exception {
        LingJieOpenStatusDetail self = new LingJieOpenStatusDetail();
        return TeaModel.build(map, self);
    }

    public LingJieOpenStatusDetail setApiList(java.util.List<LingJieOpenStatusDetailApiList> apiList) {
        this.apiList = apiList;
        return this;
    }
    public java.util.List<LingJieOpenStatusDetailApiList> getApiList() {
        return this.apiList;
    }

    public LingJieOpenStatusDetail setCommodityConcurrentLimitTips(String commodityConcurrentLimitTips) {
        this.commodityConcurrentLimitTips = commodityConcurrentLimitTips;
        return this;
    }
    public String getCommodityConcurrentLimitTips() {
        return this.commodityConcurrentLimitTips;
    }

    public LingJieOpenStatusDetail setCommodityHasOpen(Boolean commodityHasOpen) {
        this.commodityHasOpen = commodityHasOpen;
        return this;
    }
    public Boolean getCommodityHasOpen() {
        return this.commodityHasOpen;
    }

    public LingJieOpenStatusDetail setCommodityOpenUrl(String commodityOpenUrl) {
        this.commodityOpenUrl = commodityOpenUrl;
        return this;
    }
    public String getCommodityOpenUrl() {
        return this.commodityOpenUrl;
    }

    public LingJieOpenStatusDetail setCommodityUsageTips(String commodityUsageTips) {
        this.commodityUsageTips = commodityUsageTips;
        return this;
    }
    public String getCommodityUsageTips() {
        return this.commodityUsageTips;
    }

    public LingJieOpenStatusDetail setUserStopMode(Boolean userStopMode) {
        this.userStopMode = userStopMode;
        return this;
    }
    public Boolean getUserStopMode() {
        return this.userStopMode;
    }

    public static class LingJieOpenStatusDetailApiListMoreOperations extends TeaModel {
        @NameInMap("ClickUrl")
        public String clickUrl;

        @NameInMap("Operation")
        public String operation;

        public static LingJieOpenStatusDetailApiListMoreOperations build(java.util.Map<String, ?> map) throws Exception {
            LingJieOpenStatusDetailApiListMoreOperations self = new LingJieOpenStatusDetailApiListMoreOperations();
            return TeaModel.build(map, self);
        }

        public LingJieOpenStatusDetailApiListMoreOperations setClickUrl(String clickUrl) {
            this.clickUrl = clickUrl;
            return this;
        }
        public String getClickUrl() {
            return this.clickUrl;
        }

        public LingJieOpenStatusDetailApiListMoreOperations setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

    public static class LingJieOpenStatusDetailApiList extends TeaModel {
        @NameInMap("CnName")
        public String cnName;

        @NameInMap("ConcurrentLimit")
        public String concurrentLimit;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("MoreOperations")
        public java.util.List<LingJieOpenStatusDetailApiListMoreOperations> moreOperations;

        @NameInMap("StatisticsUnit")
        public String statisticsUnit;

        @NameInMap("Status")
        public String status;

        @NameInMap("Usage")
        public String usage;

        public static LingJieOpenStatusDetailApiList build(java.util.Map<String, ?> map) throws Exception {
            LingJieOpenStatusDetailApiList self = new LingJieOpenStatusDetailApiList();
            return TeaModel.build(map, self);
        }

        public LingJieOpenStatusDetailApiList setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public LingJieOpenStatusDetailApiList setConcurrentLimit(String concurrentLimit) {
            this.concurrentLimit = concurrentLimit;
            return this;
        }
        public String getConcurrentLimit() {
            return this.concurrentLimit;
        }

        public LingJieOpenStatusDetailApiList setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public LingJieOpenStatusDetailApiList setMoreOperations(java.util.List<LingJieOpenStatusDetailApiListMoreOperations> moreOperations) {
            this.moreOperations = moreOperations;
            return this;
        }
        public java.util.List<LingJieOpenStatusDetailApiListMoreOperations> getMoreOperations() {
            return this.moreOperations;
        }

        public LingJieOpenStatusDetailApiList setStatisticsUnit(String statisticsUnit) {
            this.statisticsUnit = statisticsUnit;
            return this;
        }
        public String getStatisticsUnit() {
            return this.statisticsUnit;
        }

        public LingJieOpenStatusDetailApiList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public LingJieOpenStatusDetailApiList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

}
