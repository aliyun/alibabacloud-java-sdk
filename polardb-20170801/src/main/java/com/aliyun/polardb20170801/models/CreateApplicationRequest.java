// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
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
    public java.util.List<CreateApplicationRequestComponents> components;

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
    public java.util.List<CreateApplicationRequestDnatEntries> dnatEntries;

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
    public java.util.List<CreateApplicationRequestEndpoints> endpoints;

    /**
     * <p>Required for knowledge applications.</p>
     */
    @NameInMap("KnowledgeApplicationSpec")
    public CreateApplicationRequestKnowledgeApplicationSpec knowledgeApplicationSpec;

    /**
     * <p>Required for mem0 applications.</p>
     */
    @NameInMap("MemApplicationSpec")
    public CreateApplicationRequestMemApplicationSpec memApplicationSpec;

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
    public java.util.List<CreateApplicationRequestParameters> parameters;

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
    public java.util.List<CreateApplicationRequestTag> tag;

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

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAIDBClusterId(String AIDBClusterId) {
        this.AIDBClusterId = AIDBClusterId;
        return this;
    }
    public String getAIDBClusterId() {
        return this.AIDBClusterId;
    }

    public CreateApplicationRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreateApplicationRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public CreateApplicationRequest setAuthProvider(String authProvider) {
        this.authProvider = authProvider;
        return this;
    }
    public String getAuthProvider() {
        return this.authProvider;
    }

    public CreateApplicationRequest setAuthProviderConfig(String authProviderConfig) {
        this.authProviderConfig = authProviderConfig;
        return this;
    }
    public String getAuthProviderConfig() {
        return this.authProviderConfig;
    }

    public CreateApplicationRequest setAutoAllocatePublicEip(Boolean autoAllocatePublicEip) {
        this.autoAllocatePublicEip = autoAllocatePublicEip;
        return this;
    }
    public Boolean getAutoAllocatePublicEip() {
        return this.autoAllocatePublicEip;
    }

    public CreateApplicationRequest setAutoCreatePolarFs(Boolean autoCreatePolarFs) {
        this.autoCreatePolarFs = autoCreatePolarFs;
        return this;
    }
    public Boolean getAutoCreatePolarFs() {
        return this.autoCreatePolarFs;
    }

    public CreateApplicationRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateApplicationRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateApplicationRequest setComponents(java.util.List<CreateApplicationRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CreateApplicationRequestComponents> getComponents() {
        return this.components;
    }

    public CreateApplicationRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationRequest setDnatEntries(java.util.List<CreateApplicationRequestDnatEntries> dnatEntries) {
        this.dnatEntries = dnatEntries;
        return this;
    }
    public java.util.List<CreateApplicationRequestDnatEntries> getDnatEntries() {
        return this.dnatEntries;
    }

    public CreateApplicationRequest setDnatIpAddress(String dnatIpAddress) {
        this.dnatIpAddress = dnatIpAddress;
        return this;
    }
    public String getDnatIpAddress() {
        return this.dnatIpAddress;
    }

    public CreateApplicationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateApplicationRequest setEndpoints(java.util.List<CreateApplicationRequestEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateApplicationRequestEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateApplicationRequest setKnowledgeApplicationSpec(CreateApplicationRequestKnowledgeApplicationSpec knowledgeApplicationSpec) {
        this.knowledgeApplicationSpec = knowledgeApplicationSpec;
        return this;
    }
    public CreateApplicationRequestKnowledgeApplicationSpec getKnowledgeApplicationSpec() {
        return this.knowledgeApplicationSpec;
    }

    public CreateApplicationRequest setMemApplicationSpec(CreateApplicationRequestMemApplicationSpec memApplicationSpec) {
        this.memApplicationSpec = memApplicationSpec;
        return this;
    }
    public CreateApplicationRequestMemApplicationSpec getMemApplicationSpec() {
        return this.memApplicationSpec;
    }

    public CreateApplicationRequest setModelApi(String modelApi) {
        this.modelApi = modelApi;
        return this;
    }
    public String getModelApi() {
        return this.modelApi;
    }

    public CreateApplicationRequest setModelApiKey(String modelApiKey) {
        this.modelApiKey = modelApiKey;
        return this;
    }
    public String getModelApiKey() {
        return this.modelApiKey;
    }

    public CreateApplicationRequest setModelBaseUrl(String modelBaseUrl) {
        this.modelBaseUrl = modelBaseUrl;
        return this;
    }
    public String getModelBaseUrl() {
        return this.modelBaseUrl;
    }

    public CreateApplicationRequest setModelFrom(String modelFrom) {
        this.modelFrom = modelFrom;
        return this;
    }
    public String getModelFrom() {
        return this.modelFrom;
    }

    public CreateApplicationRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateApplicationRequest setParameters(java.util.List<CreateApplicationRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateApplicationRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateApplicationRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateApplicationRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateApplicationRequest setPolarFSInstanceId(String polarFSInstanceId) {
        this.polarFSInstanceId = polarFSInstanceId;
        return this;
    }
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    public CreateApplicationRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateApplicationRequest setSecurityIPArrayName(String securityIPArrayName) {
        this.securityIPArrayName = securityIPArrayName;
        return this;
    }
    public String getSecurityIPArrayName() {
        return this.securityIPArrayName;
    }

    public CreateApplicationRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateApplicationRequest setSecurityIPType(String securityIPType) {
        this.securityIPType = securityIPType;
        return this;
    }
    public String getSecurityIPType() {
        return this.securityIPType;
    }

    public CreateApplicationRequest setSkillTemplateId(String skillTemplateId) {
        this.skillTemplateId = skillTemplateId;
        return this;
    }
    public String getSkillTemplateId() {
        return this.skillTemplateId;
    }

    public CreateApplicationRequest setTag(java.util.List<CreateApplicationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateApplicationRequestTag> getTag() {
        return this.tag;
    }

    public CreateApplicationRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public CreateApplicationRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateApplicationRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateApplicationRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateApplicationRequest setVpcNatGatewayId(String vpcNatGatewayId) {
        this.vpcNatGatewayId = vpcNatGatewayId;
        return this;
    }
    public String getVpcNatGatewayId() {
        return this.vpcNatGatewayId;
    }

    public CreateApplicationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateApplicationRequestComponents extends TeaModel {
        /**
         * <p>The specifications of the application subcomponent.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.app.g2.medium</p>
         */
        @NameInMap("ComponentClass")
        public String componentClass;

        /**
         * <p>The maximum number of application subcomponents with the same specifications. Default value: the value of ComponentReplica.</p>
         * <ul>
         * <li>Only raycluster supports this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentMaxReplica")
        public Long componentMaxReplica;

        /**
         * <p>The number of replicas for the application subcomponent. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentReplica")
        public Long componentReplica;

        /**
         * <p>The type of the application subcomponent.</p>
         * <p>For supabase, valid values:</p>
         * <ul>
         * <li>gateway</li>
         * <li>backend</li>
         * </ul>
         * <p>For raycluster, valid values:</p>
         * <ul>
         * <li>head</li>
         * <li>worker</li>
         * <li>gpuworker</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The maximum number of replicas for component scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("ScaleMax")
        public String scaleMax;

        /**
         * <p>The minimum number of replicas for component scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScaleMin")
        public String scaleMin;

        /**
         * <p>The list of security groups for the application subcomponent. Separate multiple security groups with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>sg-********************</p>
         */
        @NameInMap("SecurityGroups")
        public String securityGroups;

        /**
         * <p>The name of the whitelist IP address group for the application subcomponent. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        /**
         * <p>The whitelist IP addresses of the application subcomponent. Separate multiple IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The type of the whitelist IP addresses for the application subcomponent. Default value: ipv4.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIPType")
        public String securityIPType;

        public static CreateApplicationRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestComponents self = new CreateApplicationRequestComponents();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestComponents setComponentClass(String componentClass) {
            this.componentClass = componentClass;
            return this;
        }
        public String getComponentClass() {
            return this.componentClass;
        }

        public CreateApplicationRequestComponents setComponentMaxReplica(Long componentMaxReplica) {
            this.componentMaxReplica = componentMaxReplica;
            return this;
        }
        public Long getComponentMaxReplica() {
            return this.componentMaxReplica;
        }

        public CreateApplicationRequestComponents setComponentReplica(Long componentReplica) {
            this.componentReplica = componentReplica;
            return this;
        }
        public Long getComponentReplica() {
            return this.componentReplica;
        }

        public CreateApplicationRequestComponents setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public CreateApplicationRequestComponents setScaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public String getScaleMax() {
            return this.scaleMax;
        }

        public CreateApplicationRequestComponents setScaleMin(String scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public String getScaleMin() {
            return this.scaleMin;
        }

        public CreateApplicationRequestComponents setSecurityGroups(String securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public String getSecurityGroups() {
            return this.securityGroups;
        }

        public CreateApplicationRequestComponents setSecurityIPArrayName(String securityIPArrayName) {
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        public CreateApplicationRequestComponents setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public CreateApplicationRequestComponents setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

    }

    public static class CreateApplicationRequestDnatEntries extends TeaModel {
        /**
         * <p>The frontend port. This parameter is optional. If not specified, the port is automatically assigned by the control plane to avoid conflicts with ports already in use on the gateway. You can query the assignment result by calling the DescribeApplicationAttribute operation.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("FrontPort")
        public Integer frontPort;

        /**
         * <p>The port name. Valid values: webui, hermesagent, dashboard, and ssh.</p>
         * 
         * <strong>example:</strong>
         * <p>webui</p>
         */
        @NameInMap("PortName")
        public String portName;

        public static CreateApplicationRequestDnatEntries build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestDnatEntries self = new CreateApplicationRequestDnatEntries();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestDnatEntries setFrontPort(Integer frontPort) {
            this.frontPort = frontPort;
            return this;
        }
        public Integer getFrontPort() {
            return this.frontPort;
        }

        public CreateApplicationRequestDnatEntries setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

    }

    public static class CreateApplicationRequestEndpoints extends TeaModel {
        /**
         * <p>The description of the service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>my_endpoint</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the service endpoint. The value is fixed as Primary.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        public static CreateApplicationRequestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestEndpoints self = new CreateApplicationRequestEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestEndpoints setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationRequestEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

    }

    public static class CreateApplicationRequestKnowledgeApplicationSpec extends TeaModel {
        /**
         * <p>The dashboard password.</p>
         */
        @NameInMap("DashboardPassword")
        public String dashboardPassword;

        /**
         * <p>The password.</p>
         */
        @NameInMap("DbPassword")
        public String dbPassword;

        /**
         * <p>Required for knowledge applications. The name of the LLM model, such as qwen3-max.</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        public static CreateApplicationRequestKnowledgeApplicationSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestKnowledgeApplicationSpec self = new CreateApplicationRequestKnowledgeApplicationSpec();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestKnowledgeApplicationSpec setDashboardPassword(String dashboardPassword) {
            this.dashboardPassword = dashboardPassword;
            return this;
        }
        public String getDashboardPassword() {
            return this.dashboardPassword;
        }

        public CreateApplicationRequestKnowledgeApplicationSpec setDbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }
        public String getDbPassword() {
            return this.dbPassword;
        }

        public CreateApplicationRequestKnowledgeApplicationSpec setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

    }

    public static class CreateApplicationRequestMemApplicationSpec extends TeaModel {
        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-database-name</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <p>test-user-password</p>
         */
        @NameInMap("DbPassword")
        public String dbPassword;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test-user</p>
         */
        @NameInMap("DbUser")
        public String dbUser;

        /**
         * <p>Required for mem0 applications. The name of the embedder model, such as text-embedding-v4.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        @NameInMap("EmbedderModel")
        public String embedderModel;

        /**
         * <p>The vector dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("EmbedderModelDimension")
        public Integer embedderModelDimension;

        /**
         * <p>The graph LLM model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("GraphLlmModel")
        public String graphLlmModel;

        /**
         * <p>Required for mem0 applications. The name of the LLM model, such as qwen3-max.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        /**
         * <p>The project name, which corresponds to the database schema that stores project data.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project-name</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>Required for mem0 applications. The name of the reranker model, such as qwen3-rerank.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("RerankerModel")
        public String rerankerModel;

        /**
         * <p>The number of table shards.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Shard")
        public Integer shard;

        public static CreateApplicationRequestMemApplicationSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestMemApplicationSpec self = new CreateApplicationRequestMemApplicationSpec();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestMemApplicationSpec setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public CreateApplicationRequestMemApplicationSpec setDbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }
        public String getDbPassword() {
            return this.dbPassword;
        }

        public CreateApplicationRequestMemApplicationSpec setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public CreateApplicationRequestMemApplicationSpec setEmbedderModel(String embedderModel) {
            this.embedderModel = embedderModel;
            return this;
        }
        public String getEmbedderModel() {
            return this.embedderModel;
        }

        public CreateApplicationRequestMemApplicationSpec setEmbedderModelDimension(Integer embedderModelDimension) {
            this.embedderModelDimension = embedderModelDimension;
            return this;
        }
        public Integer getEmbedderModelDimension() {
            return this.embedderModelDimension;
        }

        public CreateApplicationRequestMemApplicationSpec setGraphLlmModel(String graphLlmModel) {
            this.graphLlmModel = graphLlmModel;
            return this;
        }
        public String getGraphLlmModel() {
            return this.graphLlmModel;
        }

        public CreateApplicationRequestMemApplicationSpec setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public CreateApplicationRequestMemApplicationSpec setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CreateApplicationRequestMemApplicationSpec setRerankerModel(String rerankerModel) {
            this.rerankerModel = rerankerModel;
            return this;
        }
        public String getRerankerModel() {
            return this.rerankerModel;
        }

        public CreateApplicationRequestMemApplicationSpec setShard(Integer shard) {
            this.shard = shard;
            return this;
        }
        public Integer getShard() {
            return this.shard;
        }

    }

    public static class CreateApplicationRequestParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>secret.gateway.auth.token</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>TK***</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateApplicationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestParameters self = new CreateApplicationRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public CreateApplicationRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateApplicationRequestTag extends TeaModel {
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

        public static CreateApplicationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestTag self = new CreateApplicationRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateApplicationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
