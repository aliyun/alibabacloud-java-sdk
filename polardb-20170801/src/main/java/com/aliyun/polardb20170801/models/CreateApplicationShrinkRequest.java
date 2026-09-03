// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The ID of an existing template operator instance to associate. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-xxxxxx</p>
     */
    @NameInMap("AIDBClusterId")
    public String AIDBClusterId;

    /**
     * <p>The application type. Valid values:</p>
     * <ul>
     * <li>supabase: Set this value to create a managed Supabase application.</li>
     * <li>raycluster: Set this value to create a managed Ray Cluster application.</li>
     * <li>polarclaw: Set this value to create a managed PolarClaw application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The CPU architecture. Valid values:</p>
     * <ul>
     * <li>x86</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>The authentication service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>feishu</p>
     */
    @NameInMap("AuthProvider")
    public String authProvider;

    /**
     * <p>The configuration of the authentication provider.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AuthProviderConfig")
    public String authProviderConfig;

    /**
     * <p>Specifies whether to automatically create and associate with an elastic IP address (EIP).</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-max</p>
     */
    @NameInMap("AutoAllocatePublicEip")
    public Boolean autoAllocatePublicEip;

    /**
     * <p>Specifies whether to enable automatic creation of a cold storage Polarlakebase instance. Valid values:</p>
     * <ul>
     * <li>false (default): Automatic creation is disabled.</li>
     * <li>true: Automatic creation is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCreatePolarFs")
    public Boolean autoCreatePolarFs;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to automatically use coupons. Valid values:</p>
     * <ul>
     * <li>true (default): Use coupons.</li>
     * <li>false: Do not use coupons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The list of user-defined application subcomponents.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <p>The instance ID of the PolarDB instance on which the application depends.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of expected DNAT entries for NAT mapping. Specify this parameter together with VpcNatGatewayId. This parameter can be left empty, which indicates that no DNAT entries are created.</p>
     */
    @NameInMap("DnatEntries")
    public String dnatEntriesShrink;

    /**
     * <p>The dedicated DNAT NAT IP address that is allocated by the customer (separate from the SNAT IP address) for NAT mapping. The IP address must belong to the specified gateway and be in the available state. The vSwitch of the gateway must belong to the primary CIDR block that is reachable from the office network. Specify this parameter together with VpcNatGatewayId. Prerequisite: An SNAT entry is bound to the vSwitch where the application resides.</p>
     * 
     * <strong>example:</strong>
     * <p>10.64.0.10</p>
     */
    @NameInMap("DnatIpAddress")
    public String dnatIpAddress;

    /**
     * <p>Default value: <code>false</code>. If you set this parameter to <code>true</code>, only parameter and resource validation is performed without actually creating resources.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The list of user-defined service endpoints. By default, a VPC endpoint is created.</p>
     */
    @NameInMap("Endpoints")
    public String endpointsShrink;

    /**
     * <p>Required for knowledge applications.</p>
     */
    @NameInMap("KnowledgeApplicationSpec")
    public String knowledgeApplicationSpecShrink;

    /**
     * <p>Required for mem0 applications.</p>
     */
    @NameInMap("MemApplicationSpec")
    public String memApplicationSpecShrink;

    /**
     * <p>The API of the model. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>openai-completions</p>
     */
    @NameInMap("ModelApi")
    public String modelApi;

    /**
     * <p>The API key of the model. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxx</p>
     */
    @NameInMap("ModelApiKey")
    public String modelApiKey;

    /**
     * <p>The URL of the model. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
     */
    @NameInMap("ModelBaseUrl")
    public String modelBaseUrl;

    /**
     * <p>The model source. Valid values:</p>
     * <ul>
     * <li>bailian: Bailian model.</li>
     * <li>custom: Custom model.</li>
     * <li>maas: PolarDB model operator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("ModelFrom")
    public String modelFrom;

    /**
     * <p>The name of the model. This parameter takes effect only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-max</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The list of parameters.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The billing type.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type, such as yearly or monthly.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The instance ID of the Polarlakebase cold storage or high-performance instance. Default value: empty. If specified, the corresponding storage is mounted to the application.</p>
     * <p>Currently, only the following applications support this parameter:</p>
     * <ul>
     * <li>supabase</li>
     * <li>raycluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pcs-********************</p>
     */
    @NameInMap("PolarFSInstanceId")
    public String polarFSInstanceId;

    /**
     * <p>The coupon code. If you do not specify this parameter, the default coupon is used.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region. Default value: the region of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-********************</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The name of the IP whitelist group. Default value: <code>default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("SecurityIPArrayName")
    public String securityIPArrayName;

    /**
     * <p>The IP whitelist. If you do not specify this parameter, the default value <code>127.0.0.1</code> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1,172.17.0.0/24</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The type of the IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("SecurityIPType")
    public String securityIPType;

    /**
     * <p>The skill template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SkillTemplateId")
    public String skillTemplateId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateApplicationShrinkRequestTag> tag;

    /**
     * <p>The target version.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("TargetVersion")
    public String targetVersion;

    /**
     * <p>The subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The vSwitch. Default value: the current vSwitch in the primary zone of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-********************</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The VPC NAT gateway ID for NAT mapping. If specified, NAT mapping is enabled when the instance is created. The NAT gateway must be in the same VPC as the application, use the private network type (intranet), and be in the active state.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-xxx</p>
     */
    @NameInMap("VpcNatGatewayId")
    public String vpcNatGatewayId;

    /**
     * <p>The zone. Default value: the primary zone of the instance.</p>
     * 
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

    public CreateApplicationShrinkRequest setDnatEntriesShrink(String dnatEntriesShrink) {
        this.dnatEntriesShrink = dnatEntriesShrink;
        return this;
    }
    public String getDnatEntriesShrink() {
        return this.dnatEntriesShrink;
    }

    public CreateApplicationShrinkRequest setDnatIpAddress(String dnatIpAddress) {
        this.dnatIpAddress = dnatIpAddress;
        return this;
    }
    public String getDnatIpAddress() {
        return this.dnatIpAddress;
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

    public CreateApplicationShrinkRequest setKnowledgeApplicationSpecShrink(String knowledgeApplicationSpecShrink) {
        this.knowledgeApplicationSpecShrink = knowledgeApplicationSpecShrink;
        return this;
    }
    public String getKnowledgeApplicationSpecShrink() {
        return this.knowledgeApplicationSpecShrink;
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

    public CreateApplicationShrinkRequest setVpcNatGatewayId(String vpcNatGatewayId) {
        this.vpcNatGatewayId = vpcNatGatewayId;
        return this;
    }
    public String getVpcNatGatewayId() {
        return this.vpcNatGatewayId;
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
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
