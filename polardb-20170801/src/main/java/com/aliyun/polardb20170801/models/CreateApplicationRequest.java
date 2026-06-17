// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The ID of an existing model operator instance to associate. This parameter is effective only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-xxxxxx</p>
     */
    @NameInMap("AIDBClusterId")
    public String AIDBClusterId;

    /**
     * <p>The type of the application. Valid values:</p>
     * <ul>
     * <li><p>supabase: Creates a managed Supabase application.</p>
     * </li>
     * <li><p>raycluster: Creates a managed Ray Cluster application.</p>
     * </li>
     * <li><p>polarclaw: Creates a managed PolarClaw application.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The CPU architecture. Valid value:</p>
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
     * <p>Specifies whether to automatically create and bind an Elastic IP Address (EIP).</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-max</p>
     */
    @NameInMap("AutoAllocatePublicEip")
    public Boolean autoAllocatePublicEip;

    /**
     * <p>Specifies whether to automatically create a PolarFS cold storage instance. Valid values:</p>
     * <ul>
     * <li><p>false (default): Does not automatically create the instance.</p>
     * </li>
     * <li><p>true: Automatically creates the instance.</p>
     * </li>
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
     * <p>Specifies whether to automatically use a coupon. Valid values:</p>
     * <ul>
     * <li><p>true (default): Uses a coupon.</p>
     * </li>
     * <li><p>false: Does not use a coupon.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>A list of custom child components for the application.</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateApplicationRequestComponents> components;

    /**
     * <p>The ID of the PolarDB instance that the application depends on.</p>
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
     * <p>The default value is <code>false</code>. If you set this parameter to <code>true</code>, the system only checks the parameters and resources without creating the actual resources.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>A list of custom server-side endpoints. By default, a VPC Endpoint is created.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<CreateApplicationRequestEndpoints> endpoints;

    /**
     * <p>This parameter is required for knowledge applications.</p>
     */
    @NameInMap("KnowledgeApplicationSpec")
    public CreateApplicationRequestKnowledgeApplicationSpec knowledgeApplicationSpec;

    /**
     * <p>This parameter is required for mem0 applications.</p>
     */
    @NameInMap("MemApplicationSpec")
    public CreateApplicationRequestMemApplicationSpec memApplicationSpec;

    /**
     * <p>The model API. This parameter is effective only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>openai-completions</p>
     */
    @NameInMap("ModelApi")
    public String modelApi;

    /**
     * <p>The API key for the model. This parameter is effective only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxx</p>
     */
    @NameInMap("ModelApiKey")
    public String modelApiKey;

    /**
     * <p>The URL of the model. This parameter is effective only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
     */
    @NameInMap("ModelBaseUrl")
    public String modelBaseUrl;

    /**
     * <p>The source of the model. Valid values:</p>
     * <ul>
     * <li><p>bailian: Alibaba Cloud Model Studio model.</p>
     * </li>
     * <li><p>custom: A custom model.</p>
     * </li>
     * <li><p>maas: PolarDB model operator.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("ModelFrom")
    public String modelFrom;

    /**
     * <p>The name of the model. This parameter is effective only when ApplicationType is set to polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-max</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>A list of parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateApplicationRequestParameters> parameters;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription period type.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the PolarFileSystem (PolarFS) cold storage or high-performance instance. This parameter is empty by default. If you specify this parameter, the corresponding storage is mounted to the application.</p>
     * <p>This feature is currently supported only by the following applications:</p>
     * <ul>
     * <li><p>supabase</p>
     * </li>
     * <li><p>raycluster</p>
     * </li>
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
     * <p>The region. The default value is the region of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-********************</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The name of the IP address whitelist group. The default value is <code>default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("SecurityIPArrayName")
    public String securityIPArrayName;

    /**
     * <p>The IP address whitelist. If you do not specify this parameter, the default value <code>127.0.0.1</code> is used.</p>
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
     * <p>The ID of the skill template.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SkillTemplateId")
    public String skillTemplateId;

    /**
     * <p>The tag.</p>
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
     * <p>The vSwitch. The default value is the current vSwitch in the primary zone of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the Virtual Private Cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-********************</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone. The default value is the primary zone of the instance.</p>
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

    public CreateApplicationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateApplicationRequestComponents extends TeaModel {
        /**
         * <p>The specifications of the child component.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.app.g2.medium</p>
         */
        @NameInMap("ComponentClass")
        public String componentClass;

        /**
         * <p>The maximum number of child components with the same specifications. The default value is the value of ComponentReplica.</p>
         * <ul>
         * <li>This parameter is supported only for raycluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentMaxReplica")
        public Long componentMaxReplica;

        /**
         * <p>The number of replicas for the child component. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentReplica")
        public Long componentReplica;

        /**
         * <p>The type of the child component.</p>
         * <p>For supabase, valid values are:</p>
         * <ul>
         * <li><p>gateway</p>
         * </li>
         * <li><p>backend</p>
         * </li>
         * </ul>
         * <p>For raycluster, valid values are:</p>
         * <ul>
         * <li><p>head</p>
         * </li>
         * <li><p>worker</p>
         * </li>
         * <li><p>gpuworker</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The maximum number of component replicas for scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("ScaleMax")
        public String scaleMax;

        /**
         * <p>The minimum number of component replicas for scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScaleMin")
        public String scaleMin;

        /**
         * <p>The security groups for the child component. Separate multiple security group IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>sg-********************</p>
         */
        @NameInMap("SecurityGroups")
        public String securityGroups;

        /**
         * <p>The name of the IP address whitelist group for the child component. The default value is default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        /**
         * <p>The IP address whitelist for the child component. Separate multiple IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The type of the IP address in the whitelist for the child component. The default value is ipv4.</p>
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

    public static class CreateApplicationRequestEndpoints extends TeaModel {
        /**
         * <p>The description of the server-side endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>my_endpoint</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the server-side endpoint. This value is fixed to Primary.</p>
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
         * <p>The password for the dashboard.</p>
         */
        @NameInMap("DashboardPassword")
        public String dashboardPassword;

        /**
         * <p>The password.</p>
         */
        @NameInMap("DbPassword")
        public String dbPassword;

        /**
         * <p>This parameter is required for knowledge applications. It specifies the name of the LLM, such as qwen3-max.</p>
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
         * <p>The name of the database.</p>
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
         * <p>This parameter is required for mem0 applications. It specifies the name of the embedder model, such as text-embedding-v4.</p>
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
         * <p>The graph LLM.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("GraphLlmModel")
        public String graphLlmModel;

        /**
         * <p>This parameter is required for mem0 applications. It specifies the name of the large language model (LLM), such as qwen3-max.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        /**
         * <p>The project name. This corresponds to the schema in the database where project data is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project-name</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>This parameter is required for mem0 applications. It specifies the name of the reranker model, such as qwen3-rerank.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("RerankerModel")
        public String rerankerModel;

        /**
         * <p>The number of sharded tables.</p>
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
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>secret.gateway.auth.token</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value of the parameter.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
