// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationRequest extends TeaModel {
    /**
     * <p>The mode in which you want the application to be reviewed. Valid values:</p>
     * <br>
     * <p>*   Sync: The application is reviewed in a synchronous manner. Quota Center automatically reviews the application. The result is returned immediately after you submit the application. However, the chance of an approval for an application that is reviewed in Sync mode is lower than the chance of an approval for an application that is reviewed in Async mode. The validity period of the new quota value is 1 hour.</p>
     * <p>*   Async: The application is reviewed in an asynchronous manner. An Alibaba Cloud support engineer reviews the application. The chance of an approval for an application that is reviewed in Async mode is higher than the chance of an approval for an application that is reviewed in Sync mode. The validity period of the new quota value is one month.</p>
     * <br>
     * <p>> This parameter is available only for ECS Quotas by Instance Type.</p>
     */
    @NameInMap("AuditMode")
    public String auditMode;

    /**
     * <p>The requested value of the quota.</p>
     * <br>
     * <p>> Applications are reviewed by the technical support team of each Alibaba Cloud service. To increase the success rate of your application, you must specify a reasonable quota value and detailed reasons when you submit an application to increase the value of the quota.</p>
     */
    @NameInMap("DesireValue")
    public Float desireValue;

    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<CreateQuotaApplicationRequestDimensions> dimensions;

    /**
     * <p>The end time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.</p>
     * <br>
     * <p>> If you do not specify an end time, the default end time is 99 years after the quota application is submitted.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The language of the quota alert notification. Valid values:</p>
     * <br>
     * <p>*   zh (default value): Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("EnvLanguage")
    public String envLanguage;

    /**
     * <p>The start time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.</p>
     * <br>
     * <p>> If you do not specify a start time, the default start time is the time when the quota application is submitted.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Specifies whether to send a notification about the application result. Valid values:</p>
     * <br>
     * <p>*   0 (default value): sends a notification about the application result.</p>
     * <p>*   3: A notification about the application result is sent.</p>
     */
    @NameInMap("NoticeType")
    public Integer noticeType;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <br>
     * <p>> For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the quota.</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The type of the quota.</p>
     * <br>
     * <p>*   CommonQuota (default value): general quota</p>
     * <p>*   FlowControl: API rate limit</p>
     * <p>*   WhiteListLabel: whitelist quota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The reason for the application.</p>
     * <br>
     * <p>> Applications are reviewed by the technical support team of each Alibaba Cloud service. To increase the success rate of your application, you must specify a reasonable quota value and detailed reasons when you submit an application to increase the value of the quota.</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static CreateQuotaApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaApplicationRequest self = new CreateQuotaApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaApplicationRequest setAuditMode(String auditMode) {
        this.auditMode = auditMode;
        return this;
    }
    public String getAuditMode() {
        return this.auditMode;
    }

    public CreateQuotaApplicationRequest setDesireValue(Float desireValue) {
        this.desireValue = desireValue;
        return this;
    }
    public Float getDesireValue() {
        return this.desireValue;
    }

    public CreateQuotaApplicationRequest setDimensions(java.util.List<CreateQuotaApplicationRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<CreateQuotaApplicationRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public CreateQuotaApplicationRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateQuotaApplicationRequest setEnvLanguage(String envLanguage) {
        this.envLanguage = envLanguage;
        return this;
    }
    public String getEnvLanguage() {
        return this.envLanguage;
    }

    public CreateQuotaApplicationRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateQuotaApplicationRequest setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Integer getNoticeType() {
        return this.noticeType;
    }

    public CreateQuotaApplicationRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateQuotaApplicationRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateQuotaApplicationRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public CreateQuotaApplicationRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public static class CreateQuotaApplicationRequestDimensions extends TeaModel {
        /**
         * <p>The key of the dimension.</p>
         * <br>
         * <p>The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * <br>
         * <p>> This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <br>
         * <p>The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * <br>
         * <p>> This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateQuotaApplicationRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaApplicationRequestDimensions self = new CreateQuotaApplicationRequestDimensions();
            return TeaModel.build(map, self);
        }

        public CreateQuotaApplicationRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateQuotaApplicationRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
