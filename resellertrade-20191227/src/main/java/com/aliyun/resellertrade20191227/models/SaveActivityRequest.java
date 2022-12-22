// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class SaveActivityRequest extends TeaModel {
    @NameInMap("ActivityName")
    public String activityName;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BlackUidList")
    public java.util.List<Long> blackUidList;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FusionPromotionParamList")
    public java.util.List<SaveActivityRequestFusionPromotionParamList> fusionPromotionParamList;

    @NameInMap("PublishTag")
    public String publishTag;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TestAccountUidList")
    public java.util.List<Long> testAccountUidList;

    @NameInMap("Token")
    public String token;

    @NameInMap("WhiteUidList")
    public java.util.List<Long> whiteUidList;

    public static SaveActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveActivityRequest self = new SaveActivityRequest();
        return TeaModel.build(map, self);
    }

    public SaveActivityRequest setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public SaveActivityRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveActivityRequest setBlackUidList(java.util.List<Long> blackUidList) {
        this.blackUidList = blackUidList;
        return this;
    }
    public java.util.List<Long> getBlackUidList() {
        return this.blackUidList;
    }

    public SaveActivityRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SaveActivityRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SaveActivityRequest setFusionPromotionParamList(java.util.List<SaveActivityRequestFusionPromotionParamList> fusionPromotionParamList) {
        this.fusionPromotionParamList = fusionPromotionParamList;
        return this;
    }
    public java.util.List<SaveActivityRequestFusionPromotionParamList> getFusionPromotionParamList() {
        return this.fusionPromotionParamList;
    }

    public SaveActivityRequest setPublishTag(String publishTag) {
        this.publishTag = publishTag;
        return this;
    }
    public String getPublishTag() {
        return this.publishTag;
    }

    public SaveActivityRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SaveActivityRequest setTestAccountUidList(java.util.List<Long> testAccountUidList) {
        this.testAccountUidList = testAccountUidList;
        return this;
    }
    public java.util.List<Long> getTestAccountUidList() {
        return this.testAccountUidList;
    }

    public SaveActivityRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SaveActivityRequest setWhiteUidList(java.util.List<Long> whiteUidList) {
        this.whiteUidList = whiteUidList;
        return this;
    }
    public java.util.List<Long> getWhiteUidList() {
        return this.whiteUidList;
    }

    public static class SaveActivityRequestFusionPromotionParamList extends TeaModel {
        @NameInMap("CommodityCodeList")
        public java.util.List<String> commodityCodeList;

        @NameInMap("PromotionValue")
        public Double promotionValue;

        @NameInMap("RestrictedRegionList")
        public java.util.List<String> restrictedRegionList;

        public static SaveActivityRequestFusionPromotionParamList build(java.util.Map<String, ?> map) throws Exception {
            SaveActivityRequestFusionPromotionParamList self = new SaveActivityRequestFusionPromotionParamList();
            return TeaModel.build(map, self);
        }

        public SaveActivityRequestFusionPromotionParamList setCommodityCodeList(java.util.List<String> commodityCodeList) {
            this.commodityCodeList = commodityCodeList;
            return this;
        }
        public java.util.List<String> getCommodityCodeList() {
            return this.commodityCodeList;
        }

        public SaveActivityRequestFusionPromotionParamList setPromotionValue(Double promotionValue) {
            this.promotionValue = promotionValue;
            return this;
        }
        public Double getPromotionValue() {
            return this.promotionValue;
        }

        public SaveActivityRequestFusionPromotionParamList setRestrictedRegionList(java.util.List<String> restrictedRegionList) {
            this.restrictedRegionList = restrictedRegionList;
            return this;
        }
        public java.util.List<String> getRestrictedRegionList() {
            return this.restrictedRegionList;
        }

    }

}
