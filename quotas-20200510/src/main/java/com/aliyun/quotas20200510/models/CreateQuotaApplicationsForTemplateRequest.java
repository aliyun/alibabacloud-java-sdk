// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaApplicationsForTemplateRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud accounts that correspond to the resource directory members for which the quotas are applied.</p>
     * <blockquote>
     * <p> You can submit a quota increase application for a maximum of 50 members at a time. For more information about the members of a resource directory, see <a href="https://help.aliyun.com/document_detail/604207.html">ListAccounts</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliyunUids")
    public java.util.List<String> aliyunUids;

    /**
     * <p>The requested value of the quota.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can specify DesireValue based on the values of <code>TotalUsage</code> and <code>ApplicableRange</code> in the response to the <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a> operation.</p>
     * </li>
     * <li><p>Applications are reviewed by the technical support team of each Alibaba Cloud service. To increase the success rate of your application, specify a reasonable quota value and a detailed reason.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
     * <blockquote>
     * <p> If you do not specify a start time, the value is the time when the quota application is submitted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-19T09:25:56Z</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The language of the notification about the application result. Valid values:</p>
     * <ul>
     * <li>zh (default): Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("EnvLanguage")
    public String envLanguage;

    /**
     * <p>The end time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.</p>
     * <blockquote>
     * <p> If you do not specify an end time, the value is 99 years after the start time of the validity period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-20T09:25:56Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Specifies whether to send a notification about the application result. Valid values:</p>
     * <ul>
     * <li>0 (default): no</li>
     * <li>3: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NoticeType")
    public Integer noticeType;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p> To query the abbreviation of an Alibaba Cloud service name, call the <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a> operation and check the value of <code>ProductCode</code> in the response.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-spec</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <p> To query the quota ID of an Alibaba Cloud service, call the <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a> and check the value of <code>QuotaActionCode</code> in the response.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.2xlarge</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type. Valid values:</p>
     * <ul>
     * <li>CommonQuota: general quota</li>
     * <li>FlowControl: API rate limit</li>
     * <li>WhiteListLabel: privilege</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The reason for the quota application.</p>
     * <blockquote>
     * <p> Applications are reviewed by the technical support team of each Alibaba Cloud service. To increase the success rate of your application, you must specify a reasonable quota value and detailed reasons when you submit the application.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Scale Out</p>
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
         * <p>The key of the dimension.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * </li>
         * <li><p>This parameter is required if you set the <code>ProductCode</code> parameter to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * </li>
         * <li><p>This parameter is required if you set the <code>ProductCode</code> parameter to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
