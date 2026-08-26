// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether the cluster is managed by an ACK cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("AckAdmin")
    public String ackAdmin;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Auto-renewal is enabled.</li>
     * <li><strong>false</strong>: Auto-renewal is not enabled.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>Specifies whether to automatically use coupons. Valid values:</p>
     * <ul>
     * <li>true (default): Use coupons.</li>
     * <li>false: Do not use coupons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to create a public endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("CreatePublicEndpoint")
    public String createPublicEndpoint;

    /**
     * <p>The cluster description. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The instance ID of the PolarDB instance on which the application depends.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-******************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>polar.pg.g4.6xlarge.gu4</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The extension.</p>
     * 
     * <strong>example:</strong>
     * <p>maas</p>
     */
    @NameInMap("Extension")
    public String extension;

    /**
     * <p>The inference engine.</p>
     * 
     * <strong>example:</strong>
     * <p>sglang</p>
     */
    @NameInMap("InferenceEngine")
    public String inferenceEngine;

    /**
     * <p>The ACK cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("KubeClusterId")
    public String kubeClusterId;

    /**
     * <p>The Kubernetes configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("KubeConfig")
    public String kubeConfig;

    /**
     * <p>The Kubernetes cluster management mode.</p>
     * 
     * <strong>example:</strong>
     * <p>self_k8s</p>
     */
    @NameInMap("KubeManagement")
    public String kubeManagement;

    /**
     * <p>aideploy</p>
     * 
     * <strong>example:</strong>
     * <p>aideploy</p>
     */
    @NameInMap("KubeType")
    public String kubeType;

    /**
     * <p>The Kubernetes configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("KubernetesConfig")
    public String kubernetesConfig;

    /**
     * <p>The management mode.</p>
     * 
     * <strong>example:</strong>
     * <p>ack</p>
     */
    @NameInMap("ManagementMode")
    public String managementMode;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-30B-A3B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model operator space.</p>
     * 
     * <strong>example:</strong>
     * <p>pms-xxx</p>
     */
    @NameInMap("ModelSpace")
    public String modelSpace;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The billing method. Valid values: </p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>This parameter is required to pass parameter when <strong>PayType</strong> is set to <strong>Prepaid</strong>. Specifies the unit of the upfront payment duration for the subscription cluster. </p>
     * <ul>
     * <li><strong>Year</strong>: The subscription duration is measured in years.</li>
     * <li><strong>Month</strong>: The subscription duration is measured in months.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The coupon code. If this parameter is not specified, the default coupon is used.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp**************</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The storage space.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("StorageSpace")
    public Integer storageSpace;

    /**
     * <p>The storage type.</p>
     * 
     * <strong>example:</strong>
     * <p>essdpl0</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The pay-as-you-go time intervals.</p>
     */
    @NameInMap("TimeSlices")
    public java.util.List<CreateAIDBClusterRequestTimeSlices> timeSlices;

    /**
     * <p>This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values of <strong>UsedTime</strong> are integers in the range of <code>[1-9]</code>.</li>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values of <strong>UsedTime</strong> are integers in the range of <code>[1-3]</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-**********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateAIDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterRequest self = new CreateAIDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterRequest setAckAdmin(String ackAdmin) {
        this.ackAdmin = ackAdmin;
        return this;
    }
    public String getAckAdmin() {
        return this.ackAdmin;
    }

    public CreateAIDBClusterRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateAIDBClusterRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateAIDBClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAIDBClusterRequest setCreatePublicEndpoint(String createPublicEndpoint) {
        this.createPublicEndpoint = createPublicEndpoint;
        return this;
    }
    public String getCreatePublicEndpoint() {
        return this.createPublicEndpoint;
    }

    public CreateAIDBClusterRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public CreateAIDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAIDBClusterRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public CreateAIDBClusterRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public CreateAIDBClusterRequest setInferenceEngine(String inferenceEngine) {
        this.inferenceEngine = inferenceEngine;
        return this;
    }
    public String getInferenceEngine() {
        return this.inferenceEngine;
    }

    public CreateAIDBClusterRequest setKubeClusterId(String kubeClusterId) {
        this.kubeClusterId = kubeClusterId;
        return this;
    }
    public String getKubeClusterId() {
        return this.kubeClusterId;
    }

    public CreateAIDBClusterRequest setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }
    public String getKubeConfig() {
        return this.kubeConfig;
    }

    public CreateAIDBClusterRequest setKubeManagement(String kubeManagement) {
        this.kubeManagement = kubeManagement;
        return this;
    }
    public String getKubeManagement() {
        return this.kubeManagement;
    }

    public CreateAIDBClusterRequest setKubeType(String kubeType) {
        this.kubeType = kubeType;
        return this;
    }
    public String getKubeType() {
        return this.kubeType;
    }

    public CreateAIDBClusterRequest setKubernetesConfig(String kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public String getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public CreateAIDBClusterRequest setManagementMode(String managementMode) {
        this.managementMode = managementMode;
        return this;
    }
    public String getManagementMode() {
        return this.managementMode;
    }

    public CreateAIDBClusterRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateAIDBClusterRequest setModelSpace(String modelSpace) {
        this.modelSpace = modelSpace;
        return this;
    }
    public String getModelSpace() {
        return this.modelSpace;
    }

    public CreateAIDBClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAIDBClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAIDBClusterRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateAIDBClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateAIDBClusterRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateAIDBClusterRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreateAIDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAIDBClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAIDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAIDBClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateAIDBClusterRequest setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Integer getStorageSpace() {
        return this.storageSpace;
    }

    public CreateAIDBClusterRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateAIDBClusterRequest setTimeSlices(java.util.List<CreateAIDBClusterRequestTimeSlices> timeSlices) {
        this.timeSlices = timeSlices;
        return this;
    }
    public java.util.List<CreateAIDBClusterRequestTimeSlices> getTimeSlices() {
        return this.timeSlices;
    }

    public CreateAIDBClusterRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateAIDBClusterRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateAIDBClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateAIDBClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateAIDBClusterRequestTimeSlices extends TeaModel {
        /**
         * <p>The start time of the task. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>1758729600</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>The end time of the query. The end time must be later than the start time. The time is in the <code>YYYY-MM-DDThh:mmZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>1758733200</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        public static CreateAIDBClusterRequestTimeSlices build(java.util.Map<String, ?> map) throws Exception {
            CreateAIDBClusterRequestTimeSlices self = new CreateAIDBClusterRequestTimeSlices();
            return TeaModel.build(map, self);
        }

        public CreateAIDBClusterRequestTimeSlices setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public CreateAIDBClusterRequestTimeSlices setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

    }

}
