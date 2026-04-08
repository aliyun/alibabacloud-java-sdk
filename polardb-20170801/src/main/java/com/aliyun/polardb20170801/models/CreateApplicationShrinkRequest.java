// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pm-xxxxxx</p>
     */
    @NameInMap("AIDBClusterId")
    public String AIDBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <strong>example:</strong>
     * <p>feishu</p>
     */
    @NameInMap("AuthProvider")
    public String authProvider;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AuthProviderConfig")
    public String authProviderConfig;

    @NameInMap("AutoAllocatePublicEip")
    public Boolean autoAllocatePublicEip;

    @NameInMap("AutoCreatePolarFs")
    public Boolean autoCreatePolarFs;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Endpoints")
    public String endpointsShrink;

    @NameInMap("MemApplicationSpec")
    public String memApplicationSpecShrink;

    /**
     * <strong>example:</strong>
     * <p>openai-completions</p>
     */
    @NameInMap("ModelApi")
    public String modelApi;

    /**
     * <strong>example:</strong>
     * <p>sk-xxxxxx</p>
     */
    @NameInMap("ModelApiKey")
    public String modelApiKey;

    /**
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
     */
    @NameInMap("ModelBaseUrl")
    public String modelBaseUrl;

    /**
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("ModelFrom")
    public String modelFrom;

    /**
     * <strong>example:</strong>
     * <p>qwen3-max</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>pcs-********************</p>
     */
    @NameInMap("PolarFSInstanceId")
    public String polarFSInstanceId;

    /**
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityIPArrayName")
    public String securityIPArrayName;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("SecurityIPType")
    public String securityIPType;

    @NameInMap("SkillTemplateId")
    public String skillTemplateId;

    @NameInMap("Tag")
    public java.util.List<CreateApplicationShrinkRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("TargetVersion")
    public String targetVersion;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing-k</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationShrinkRequest self = new CreateApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationShrinkRequest setAIDBClusterId(String AIDBClusterId) {
        this.AIDBClusterId = AIDBClusterId;
        return this;
    }
    public String getAIDBClusterId() {
        return this.AIDBClusterId;
    }

    public CreateApplicationShrinkRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreateApplicationShrinkRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public CreateApplicationShrinkRequest setAuthProvider(String authProvider) {
        this.authProvider = authProvider;
        return this;
    }
    public String getAuthProvider() {
        return this.authProvider;
    }

    public CreateApplicationShrinkRequest setAuthProviderConfig(String authProviderConfig) {
        this.authProviderConfig = authProviderConfig;
        return this;
    }
    public String getAuthProviderConfig() {
        return this.authProviderConfig;
    }

    public CreateApplicationShrinkRequest setAutoAllocatePublicEip(Boolean autoAllocatePublicEip) {
        this.autoAllocatePublicEip = autoAllocatePublicEip;
        return this;
    }
    public Boolean getAutoAllocatePublicEip() {
        return this.autoAllocatePublicEip;
    }

    public CreateApplicationShrinkRequest setAutoCreatePolarFs(Boolean autoCreatePolarFs) {
        this.autoCreatePolarFs = autoCreatePolarFs;
        return this;
    }
    public Boolean getAutoCreatePolarFs() {
        return this.autoCreatePolarFs;
    }

    public CreateApplicationShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateApplicationShrinkRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateApplicationShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public CreateApplicationShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApplicationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateApplicationShrinkRequest setEndpointsShrink(String endpointsShrink) {
        this.endpointsShrink = endpointsShrink;
        return this;
    }
    public String getEndpointsShrink() {
        return this.endpointsShrink;
    }

    public CreateApplicationShrinkRequest setMemApplicationSpecShrink(String memApplicationSpecShrink) {
        this.memApplicationSpecShrink = memApplicationSpecShrink;
        return this;
    }
    public String getMemApplicationSpecShrink() {
        return this.memApplicationSpecShrink;
    }

    public CreateApplicationShrinkRequest setModelApi(String modelApi) {
        this.modelApi = modelApi;
        return this;
    }
    public String getModelApi() {
        return this.modelApi;
    }

    public CreateApplicationShrinkRequest setModelApiKey(String modelApiKey) {
        this.modelApiKey = modelApiKey;
        return this;
    }
    public String getModelApiKey() {
        return this.modelApiKey;
    }

    public CreateApplicationShrinkRequest setModelBaseUrl(String modelBaseUrl) {
        this.modelBaseUrl = modelBaseUrl;
        return this;
    }
    public String getModelBaseUrl() {
        return this.modelBaseUrl;
    }

    public CreateApplicationShrinkRequest setModelFrom(String modelFrom) {
        this.modelFrom = modelFrom;
        return this;
    }
    public String getModelFrom() {
        return this.modelFrom;
    }

    public CreateApplicationShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateApplicationShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateApplicationShrinkRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateApplicationShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateApplicationShrinkRequest setPolarFSInstanceId(String polarFSInstanceId) {
        this.polarFSInstanceId = polarFSInstanceId;
        return this;
    }
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    public CreateApplicationShrinkRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateApplicationShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateApplicationShrinkRequest setSecurityIPArrayName(String securityIPArrayName) {
        this.securityIPArrayName = securityIPArrayName;
        return this;
    }
    public String getSecurityIPArrayName() {
        return this.securityIPArrayName;
    }

    public CreateApplicationShrinkRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateApplicationShrinkRequest setSecurityIPType(String securityIPType) {
        this.securityIPType = securityIPType;
        return this;
    }
    public String getSecurityIPType() {
        return this.securityIPType;
    }

    public CreateApplicationShrinkRequest setSkillTemplateId(String skillTemplateId) {
        this.skillTemplateId = skillTemplateId;
        return this;
    }
    public String getSkillTemplateId() {
        return this.skillTemplateId;
    }

    public CreateApplicationShrinkRequest setTag(java.util.List<CreateApplicationShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateApplicationShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateApplicationShrinkRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public CreateApplicationShrinkRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateApplicationShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateApplicationShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateApplicationShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateApplicationShrinkRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateApplicationShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationShrinkRequestTag self = new CreateApplicationShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateApplicationShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateApplicationShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
