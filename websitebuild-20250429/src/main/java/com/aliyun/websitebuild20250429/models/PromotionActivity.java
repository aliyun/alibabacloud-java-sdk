// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class PromotionActivity extends TeaModel {
    /**
     * <p>The campaign code.</p>
     * 
     * <strong>example:</strong>
     * <p>acwfradoj5u</p>
     */
    @NameInMap("ActivityCode")
    public String activityCode;

    /**
     * <p>The campaign name.</p>
     * 
     * <strong>example:</strong>
     * <p>IP CIDR block filtering statistics</p>
     */
    @NameInMap("ActivityName")
    public String activityName;

    /**
     * <p>The campaign type.</p>
     * 
     * <strong>example:</strong>
     * <p>SCALE_IN</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    /**
     * <p>The consumed quota.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ConsumedQuota")
    public Long consumedQuota;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-11T21:13:38.164526965+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>123414</p>
     */
    @NameInMap("CreatedBy")
    public String createdBy;

    /**
     * <p>The eligibility configuration in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("EligibilityConfig")
    public String eligibilityConfig;

    /**
     * <p>The end date.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-22 10:18:51 +0800</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The privilege configuration in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OfferConfig")
    public String offerConfig;

    /**
     * <p>The privilege configuration summary.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OfferConfigSummary")
    public String offerConfigSummary;

    /**
     * <p>The remaining quota.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RemainingQuota")
    public Long remainingQuota;

    /**
     * <p>The start date.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-12T16:00:00.000Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The campaign status.</p>
     * 
     * <strong>example:</strong>
     * <p>FE_ABORTING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total quota.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalQuota")
    public Long totalQuota;

    /**
     * <p>The touchpoint configuration in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("TouchpointConfig")
    public String touchpointConfig;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-11T21:13:38.164526965+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The updater.</p>
     * 
     * <strong>example:</strong>
     * <p>123414</p>
     */
    @NameInMap("UpdatedBy")
    public String updatedBy;

    /**
     * <p>The warning threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
