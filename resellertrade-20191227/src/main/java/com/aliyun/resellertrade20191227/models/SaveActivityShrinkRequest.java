// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class SaveActivityShrinkRequest extends TeaModel {
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

    @NameInMap("ExtendMap")
    public String extendMapShrink;

    @NameInMap("FusionPromotionParamList")
    public java.util.List<SaveActivityShrinkRequestFusionPromotionParamList> fusionPromotionParamList;

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

    public static SaveActivityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveActivityShrinkRequest self = new SaveActivityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveActivityShrinkRequest setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public SaveActivityShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveActivityShrinkRequest setBlackUidList(java.util.List<Long> blackUidList) {
        this.blackUidList = blackUidList;
        return this;
    }
    public java.util.List<Long> getBlackUidList() {
        return this.blackUidList;
    }

    public SaveActivityShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SaveActivityShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SaveActivityShrinkRequest setExtendMapShrink(String extendMapShrink) {
        this.extendMapShrink = extendMapShrink;
        return this;
    }
    public String getExtendMapShrink() {
        return this.extendMapShrink;
    }

    public SaveActivityShrinkRequest setFusionPromotionParamList(java.util.List<SaveActivityShrinkRequestFusionPromotionParamList> fusionPromotionParamList) {
        this.fusionPromotionParamList = fusionPromotionParamList;
        return this;
    }
    public java.util.List<SaveActivityShrinkRequestFusionPromotionParamList> getFusionPromotionParamList() {
        return this.fusionPromotionParamList;
    }

    public SaveActivityShrinkRequest setPublishTag(String publishTag) {
        this.publishTag = publishTag;
        return this;
    }
    public String getPublishTag() {
        return this.publishTag;
    }

    public SaveActivityShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SaveActivityShrinkRequest setTestAccountUidList(java.util.List<Long> testAccountUidList) {
        this.testAccountUidList = testAccountUidList;
        return this;
    }
    public java.util.List<Long> getTestAccountUidList() {
        return this.testAccountUidList;
    }

    public SaveActivityShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SaveActivityShrinkRequest setWhiteUidList(java.util.List<Long> whiteUidList) {
        this.whiteUidList = whiteUidList;
        return this;
    }
    public java.util.List<Long> getWhiteUidList() {
        return this.whiteUidList;
    }

    public static class SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList extends TeaModel {
        @NameInMap("componentCode")
        public String componentCode;

        @NameInMap("itemCode")
        public String itemCode;

        @NameInMap("moduleId")
        public Long moduleId;

        @NameInMap("moduleKey")
        public String moduleKey;

        @NameInMap("moduleName")
        public String moduleName;

        @NameInMap("moduleValueList")
        public java.util.List<String> moduleValueList;

        @NameInMap("pricePlanId")
        public Long pricePlanId;

        public static SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList build(java.util.Map<String, ?> map) throws Exception {
            SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList self = new SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList();
            return TeaModel.build(map, self);
        }

        public SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList setModuleKey(String moduleKey) {
            this.moduleKey = moduleKey;
            return this;
        }
        public String getModuleKey() {
            return this.moduleKey;
        }

        public SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList setModuleValueList(java.util.List<String> moduleValueList) {
            this.moduleValueList = moduleValueList;
            return this;
        }
        public java.util.List<String> getModuleValueList() {
            return this.moduleValueList;
        }

        public SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList setPricePlanId(Long pricePlanId) {
            this.pricePlanId = pricePlanId;
            return this;
        }
        public Long getPricePlanId() {
            return this.pricePlanId;
        }

    }

    public static class SaveActivityShrinkRequestFusionPromotionParamList extends TeaModel {
        @NameInMap("CommodityCodeList")
        public java.util.List<String> commodityCodeList;

        @NameInMap("PromotionValue")
        public Double promotionValue;

        @NameInMap("RestrictedRegionList")
        public java.util.List<String> restrictedRegionList;

        @NameInMap("moduleInfoParamList")
        public java.util.List<SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList> moduleInfoParamList;

        public static SaveActivityShrinkRequestFusionPromotionParamList build(java.util.Map<String, ?> map) throws Exception {
            SaveActivityShrinkRequestFusionPromotionParamList self = new SaveActivityShrinkRequestFusionPromotionParamList();
            return TeaModel.build(map, self);
        }

        public SaveActivityShrinkRequestFusionPromotionParamList setCommodityCodeList(java.util.List<String> commodityCodeList) {
            this.commodityCodeList = commodityCodeList;
            return this;
        }
        public java.util.List<String> getCommodityCodeList() {
            return this.commodityCodeList;
        }

        public SaveActivityShrinkRequestFusionPromotionParamList setPromotionValue(Double promotionValue) {
            this.promotionValue = promotionValue;
            return this;
        }
        public Double getPromotionValue() {
            return this.promotionValue;
        }

        public SaveActivityShrinkRequestFusionPromotionParamList setRestrictedRegionList(java.util.List<String> restrictedRegionList) {
            this.restrictedRegionList = restrictedRegionList;
            return this;
        }
        public java.util.List<String> getRestrictedRegionList() {
            return this.restrictedRegionList;
        }

        public SaveActivityShrinkRequestFusionPromotionParamList setModuleInfoParamList(java.util.List<SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList> moduleInfoParamList) {
            this.moduleInfoParamList = moduleInfoParamList;
            return this;
        }
        public java.util.List<SaveActivityShrinkRequestFusionPromotionParamListModuleInfoParamList> getModuleInfoParamList() {
            return this.moduleInfoParamList;
        }

    }

}
