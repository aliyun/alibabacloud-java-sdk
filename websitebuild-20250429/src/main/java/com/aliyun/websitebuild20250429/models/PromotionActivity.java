// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class PromotionActivity extends TeaModel {
    @NameInMap("ActivityCode")
    public String activityCode;

    @NameInMap("ActivityName")
    public String activityName;

    @NameInMap("ActivityType")
    public String activityType;

    @NameInMap("ConsumedQuota")
    public Long consumedQuota;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("EligibilityConfig")
    public String eligibilityConfig;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OfferConfig")
    public String offerConfig;

    @NameInMap("OfferConfigSummary")
    public String offerConfigSummary;

    @NameInMap("RemainingQuota")
    public Long remainingQuota;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Status")
    public String status;

    @NameInMap("TotalQuota")
    public Long totalQuota;

    @NameInMap("TouchpointConfig")
    public String touchpointConfig;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdatedBy")
    public String updatedBy;

    @NameInMap("WarningThreshold")
    public Integer warningThreshold;

    public static PromotionActivity build(java.util.Map<String, ?> map) throws Exception {
        PromotionActivity self = new PromotionActivity();
        return TeaModel.build(map, self);
    }

    public PromotionActivity setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public PromotionActivity setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public PromotionActivity setActivityType(String activityType) {
        this.activityType = activityType;
        return this;
    }
    public String getActivityType() {
        return this.activityType;
    }

    public PromotionActivity setConsumedQuota(Long consumedQuota) {
        this.consumedQuota = consumedQuota;
        return this;
    }
    public Long getConsumedQuota() {
        return this.consumedQuota;
    }

    public PromotionActivity setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public PromotionActivity setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public PromotionActivity setEligibilityConfig(String eligibilityConfig) {
        this.eligibilityConfig = eligibilityConfig;
        return this;
    }
    public String getEligibilityConfig() {
        return this.eligibilityConfig;
    }

    public PromotionActivity setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public PromotionActivity setOfferConfig(String offerConfig) {
        this.offerConfig = offerConfig;
        return this;
    }
    public String getOfferConfig() {
        return this.offerConfig;
    }

    public PromotionActivity setOfferConfigSummary(String offerConfigSummary) {
        this.offerConfigSummary = offerConfigSummary;
        return this;
    }
    public String getOfferConfigSummary() {
        return this.offerConfigSummary;
    }

    public PromotionActivity setRemainingQuota(Long remainingQuota) {
        this.remainingQuota = remainingQuota;
        return this;
    }
    public Long getRemainingQuota() {
        return this.remainingQuota;
    }

    public PromotionActivity setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public PromotionActivity setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PromotionActivity setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    public PromotionActivity setTouchpointConfig(String touchpointConfig) {
        this.touchpointConfig = touchpointConfig;
        return this;
    }
    public String getTouchpointConfig() {
        return this.touchpointConfig;
    }

    public PromotionActivity setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public PromotionActivity setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public PromotionActivity setWarningThreshold(Integer warningThreshold) {
        this.warningThreshold = warningThreshold;
        return this;
    }
    public Integer getWarningThreshold() {
        return this.warningThreshold;
    }

}
