// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class QueryActivityResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContextMap")
    public java.util.Map<String, ?> contextMap;

    @NameInMap("Data")
    public QueryActivityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityResponseBody self = new QueryActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryActivityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryActivityResponseBody setContextMap(java.util.Map<String, ?> contextMap) {
        this.contextMap = contextMap;
        return this;
    }
    public java.util.Map<String, ?> getContextMap() {
        return this.contextMap;
    }

    public QueryActivityResponseBody setData(QueryActivityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryActivityResponseBodyData getData() {
        return this.data;
    }

    public QueryActivityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryActivityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryActivityResponseBodyData extends TeaModel {
        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("BlackList")
        public java.util.List<Long> blackList;

        @NameInMap("CommodityCodeList")
        public java.util.List<String> commodityCodeList;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExtMap")
        public java.util.Map<String, String> extMap;

        @NameInMap("PromotionDescription")
        public String promotionDescription;

        @NameInMap("PromotionValue")
        public Double promotionValue;

        @NameInMap("RegionList")
        public java.util.List<String> regionList;

        @NameInMap("SellerIdList")
        public java.util.List<Long> sellerIdList;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TestAccountList")
        public java.util.List<Long> testAccountList;

        @NameInMap("WhiteList")
        public java.util.List<Long> whiteList;

        public static QueryActivityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryActivityResponseBodyData self = new QueryActivityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryActivityResponseBodyData setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QueryActivityResponseBodyData setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryActivityResponseBodyData setBlackList(java.util.List<Long> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<Long> getBlackList() {
            return this.blackList;
        }

        public QueryActivityResponseBodyData setCommodityCodeList(java.util.List<String> commodityCodeList) {
            this.commodityCodeList = commodityCodeList;
            return this;
        }
        public java.util.List<String> getCommodityCodeList() {
            return this.commodityCodeList;
        }

        public QueryActivityResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryActivityResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryActivityResponseBodyData setExtMap(java.util.Map<String, String> extMap) {
            this.extMap = extMap;
            return this;
        }
        public java.util.Map<String, String> getExtMap() {
            return this.extMap;
        }

        public QueryActivityResponseBodyData setPromotionDescription(String promotionDescription) {
            this.promotionDescription = promotionDescription;
            return this;
        }
        public String getPromotionDescription() {
            return this.promotionDescription;
        }

        public QueryActivityResponseBodyData setPromotionValue(Double promotionValue) {
            this.promotionValue = promotionValue;
            return this;
        }
        public Double getPromotionValue() {
            return this.promotionValue;
        }

        public QueryActivityResponseBodyData setRegionList(java.util.List<String> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<String> getRegionList() {
            return this.regionList;
        }

        public QueryActivityResponseBodyData setSellerIdList(java.util.List<Long> sellerIdList) {
            this.sellerIdList = sellerIdList;
            return this;
        }
        public java.util.List<Long> getSellerIdList() {
            return this.sellerIdList;
        }

        public QueryActivityResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryActivityResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryActivityResponseBodyData setTestAccountList(java.util.List<Long> testAccountList) {
            this.testAccountList = testAccountList;
            return this;
        }
        public java.util.List<Long> getTestAccountList() {
            return this.testAccountList;
        }

        public QueryActivityResponseBodyData setWhiteList(java.util.List<Long> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<Long> getWhiteList() {
            return this.whiteList;
        }

    }

}
