// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateTemplateQuotaItemRequest extends TeaModel {
    /**
     * <p>The requested value of the quota.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can specify DesireValue based on the values of <code>TotalUsage</code> and <code>ApplicableRange</code> in the response to the <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a> operation.</p>
     * </li>
     * <li><p>Applications are reviewed by the technical support team for each cloud service. To increase the success rate of your application, specify a reasonable quota value and a detailed reason.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>804</p>
     */
    @NameInMap("DesireValue")
    public Float desireValue;

    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<CreateTemplateQuotaItemRequestDimensions> dimensions;

    /**
     * <p>The start time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.</p>
     * <blockquote>
     * <p>If you leave this parameter empty, the quota takes effect immediately.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-19T09:25:56Z</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The language of the quota alert notification. Valid values:</p>
     * <ul>
     * <li>zh (default value): Chinese</li>
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
     * <p>If you leave this parameter empty, no end time is specified.</p>
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
     * <li>0 (default value): no</li>
     * <li>3: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NoticeType")
    public Long noticeType;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p> To query the abbreviation of an Alibaba Cloud service name, call the <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a> operation and check the value of <code>ProductCode</code> in the response.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <p> To obtain the quota ID of an Alibaba Cloud service, call the <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a> operation and check the value of <code>QuotaActionCode</code> in the response.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_security-groups</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    /**
     * <p>The quota type. Valid values:</p>
     * <ul>
     * <li>CommonQuota: general quota</li>
     * <li>WhiteListLabel: privilege</li>
     * <li>FlowControl: API rate limit</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    public static CreateTemplateQuotaItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateQuotaItemRequest self = new CreateTemplateQuotaItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateQuotaItemRequest setDesireValue(Float desireValue) {
        this.desireValue = desireValue;
        return this;
    }
    public Float getDesireValue() {
        return this.desireValue;
    }

    public CreateTemplateQuotaItemRequest setDimensions(java.util.List<CreateTemplateQuotaItemRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<CreateTemplateQuotaItemRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public CreateTemplateQuotaItemRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateTemplateQuotaItemRequest setEnvLanguage(String envLanguage) {
        this.envLanguage = envLanguage;
        return this;
    }
    public String getEnvLanguage() {
        return this.envLanguage;
    }

    public CreateTemplateQuotaItemRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateTemplateQuotaItemRequest setNoticeType(Long noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Long getNoticeType() {
        return this.noticeType;
    }

    public CreateTemplateQuotaItemRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateTemplateQuotaItemRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public CreateTemplateQuotaItemRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public static class CreateTemplateQuotaItemRequestDimensions extends TeaModel {
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

        public static CreateTemplateQuotaItemRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateQuotaItemRequestDimensions self = new CreateTemplateQuotaItemRequestDimensions();
            return TeaModel.build(map, self);
        }

        public CreateTemplateQuotaItemRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTemplateQuotaItemRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
