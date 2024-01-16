// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationsForTemplateRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud accounts that correspond to the resource directory member accounts for which the quotas are applied.</p>
     * <br>
     * <p>>  You can apply for a quota increase for up to 50 member accounts in each request. For more information about the member accounts in a resource directory, see [ListAccounts](~~604207~~).</p>
     */
    @NameInMap("AliyunUids")
    public java.util.List<String> aliyunUids;

    /**
     * <p>The requested value of the quota.</p>
     * <br>
     * <p>>  Applications are reviewed by the technical support team of each Alibaba Cloud service. To increase the success rate of your application, you must specify a reasonable quota value and detailed reasons when you submit the application.</p>
     */
    @NameInMap("DesireValue")
    public Double desireValue;

    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<CreateQuotaApplicationsForTemplateRequestDimensions> dimensions;

    /**
     * <p>The start time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.</p>
     * <br>
     * <p>>  If you do not specify a start time, the value is the time when the quota application is submitted.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The language of the notification about the application result. Valid values:</p>
     * <br>
     * <p>*   zh (default): Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("EnvLanguage")
    public String envLanguage;

    /**
     * <p>The end time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.</p>
     * <br>
     * <p>>  If you do not specify an end time, the value is 99 years after the start time of the validity period.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Specifies whether to send a notification about the application result. Valid values:</p>
     * <br>
     * <p>*   0 (default): no</p>
     * <p>*   3: yes</p>
     */
    @NameInMap("NoticeType")
    public Integer noticeType;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <br>
     * <p>>  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type. Valid values:</p>
     * <br>
     * <p>*   CommonQuota (default): general quota</p>
     * <p>*   FlowControl: API rate limit</p>
     * <p>*   WhiteListLabel: privilege</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The reason for the quota application.</p>
     * <br>
     * <p>>  Applications are reviewed by the technical support team of each Alibaba Cloud service. To increase the success rate of your application, you must specify a reasonable quota value and detailed reasons when you submit the application.</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static CreateQuotaApplicationsForTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationsForTemplateRequest self = new CreateQuotaApplicationsForTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationsForTemplateRequest setAliyunUids(java.util.List<String> aliyunUids) {
        this.aliyunUids = aliyunUids;
        return this;
    }
    public java.util.List<String> getAliyunUids() {
        return this.aliyunUids;
    }

    public CreateQuotaApplicationsForTemplateRequest setDesireValue(Double desireValue) {
        this.desireValue = desireValue;
        return this;
    }
    public Double getDesireValue() {
        return this.desireValue;
    }

    public CreateQuotaApplicationsForTemplateRequest setDimensions(java.util.List<CreateQuotaApplicationsForTemplateRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<CreateQuotaApplicationsForTemplateRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public CreateQuotaApplicationsForTemplateRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateQuotaApplicationsForTemplateRequest setEnvLanguage(String envLanguage) {
        this.envLanguage = envLanguage;
        return this;
    }
    public String getEnvLanguage() {
        return this.envLanguage;
    }

    public CreateQuotaApplicationsForTemplateRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateQuotaApplicationsForTemplateRequest setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Integer getNoticeType() {
        return this.noticeType;
    }

    public CreateQuotaApplicationsForTemplateRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateQuotaApplicationsForTemplateRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateQuotaApplicationsForTemplateRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public CreateQuotaApplicationsForTemplateRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public static class CreateQuotaApplicationsForTemplateRequestDimensions extends TeaModel {
        /**
         * <p>The key of the quota dimension.</p>
         * <br>
         * <p>The value range of N varies based on the number of dimensions that are supported by the Alibaba Cloud service.</p>
         * <br>
         * <p>>  This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the quota dimension.</p>
         * <br>
         * <p>>  The value range of N varies based on the number of dimensions that are supported by the Alibaba Cloud service.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateQuotaApplicationsForTemplateRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaApplicationsForTemplateRequestDimensions self = new CreateQuotaApplicationsForTemplateRequestDimensions();
            return TeaModel.build(map, self);
        }

        public CreateQuotaApplicationsForTemplateRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateQuotaApplicationsForTemplateRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
