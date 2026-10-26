// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateDisasterRecoveryPlanRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic consumer automatic synchronization.</p>
     * <blockquote>
     * <p>This parameter takes effect only when consumer automatic synchronization is enabled. That is, the <code>syncCheckpointEnabled</code> field is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSyncCheckpoint")
    public Boolean autoSyncCheckpoint;

    /**
     * <p>The instances involved in the backup plan. This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<CreateDisasterRecoveryPlanRequestInstances> instances;

    /**
     * <p>The description of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("planDesc")
    public String planDesc;

    /**
     * <p>The name of the plan. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>The type of the backup plan. This parameter is required. For more information, see <a href="https://help.aliyun.com/document_detail/2843187.html">Global Replicator</a>. Valid values:</p>
     * <ul>
     * <li>ACTIVE_PASSIVE: one-way backup</li>
     * <li>ACTIVE_ACTIVE: two-way backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE_ACTIVE</p>
     */
    @NameInMap("planType")
    public String planType;

    /**
     * <p>Specifies whether to enable consumer offset synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("syncCheckpointEnabled")
    public Boolean syncCheckpointEnabled;

    public static CreateDisasterRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDisasterRecoveryPlanRequest self = new CreateDisasterRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateDisasterRecoveryPlanRequest setAutoSyncCheckpoint(Boolean autoSyncCheckpoint) {
        this.autoSyncCheckpoint = autoSyncCheckpoint;
        return this;
    }
    public Boolean getAutoSyncCheckpoint() {
        return this.autoSyncCheckpoint;
    }

    public CreateDisasterRecoveryPlanRequest setInstances(java.util.List<CreateDisasterRecoveryPlanRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<CreateDisasterRecoveryPlanRequestInstances> getInstances() {
        return this.instances;
    }

    public CreateDisasterRecoveryPlanRequest setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
        return this;
    }
    public String getPlanDesc() {
        return this.planDesc;
    }

    public CreateDisasterRecoveryPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public CreateDisasterRecoveryPlanRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public CreateDisasterRecoveryPlanRequest setSyncCheckpointEnabled(Boolean syncCheckpointEnabled) {
        this.syncCheckpointEnabled = syncCheckpointEnabled;
        return this;
    }
    public Boolean getSyncCheckpointEnabled() {
        return this.syncCheckpointEnabled;
    }

    public static class CreateDisasterRecoveryPlanRequestInstancesMessageProperty extends TeaModel {
        /**
         * <p>The key of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("propertyKey")
        public String propertyKey;

        /**
         * <p>The value of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb</p>
         */
        @NameInMap("propertyValue")
        public String propertyValue;

        public static CreateDisasterRecoveryPlanRequestInstancesMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            CreateDisasterRecoveryPlanRequestInstancesMessageProperty self = new CreateDisasterRecoveryPlanRequestInstancesMessageProperty();
            return TeaModel.build(map, self);
        }

        public CreateDisasterRecoveryPlanRequestInstancesMessageProperty setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public CreateDisasterRecoveryPlanRequestInstancesMessageProperty setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class CreateDisasterRecoveryPlanRequestInstances extends TeaModel {
        /**
         * <p>The authentication method. This parameter is not required if instanceType is set to ALIYUN_ROCKETMQ and the instance version is 4.0. Valid values:</p>
         * <ul>
         * <li>NO_AUTH: no authentication</li>
         * <li>ACL_AUTH: ACL authentication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACL_AUTH</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>The ID of the consumer group, which is used to pull messages from the source instance.
         * <notice>This parameter is required for self-managed instances. For Alibaba Cloud instances, this parameter is automatically generated.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>GID_DS_XXX_YYY</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The endpoint URL. This parameter is not required if instanceType is set to ALIYUN_ROCKETMQ. This parameter is required if instanceType is set to EXTERNAL_ROCKETMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("endpointUrl")
        public String endpointUrl;

        /**
         * <p>The instance ID. This parameter is not required if instanceType is set to EXTERNAL_ROCKETMQ. This parameter is required if instanceType is set to ALIYUN_ROCKETMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-******</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The role of the instance. Valid values:</p>
         * <ul>
         * <li>ACTIVE: primary</li>
         * <li>PASSIVE: secondary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASSIVE</p>
         */
        @NameInMap("instanceRole")
        public String instanceRole;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
         * <li>EXTERNAL_ROCKETMQ: external instance, open-source instance, or open-source cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The message filtering property. When a message is synchronized to the destination cluster, this property is automatically added to the message for SQL-based filtering during message consumption.</p>
         */
        @NameInMap("messageProperty")
        public CreateDisasterRecoveryPlanRequestInstancesMessageProperty messageProperty;

        /**
         * <p>The network type. This parameter is not required if instanceType is set to ALIYUN_ROCKETMQ. This parameter is required if instanceType is set to EXTERNAL_ROCKETMQ. Valid values:</p>
         * <ul>
         * <li>TCP_INTERNET: TCP over the Internet</li>
         * <li>TCP_VPC: TCP over a VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP_INTERNET</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The password for authentication. This parameter is required if authType is set to ACL_AUTH. This parameter is not required if instanceType is set to ALIYUN_ROCKETMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The region where the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The ID of the security group. This parameter is required only if instanceType is set to EXTERNAL_ROCKETMQ and networkType is set to TCP_VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp17hpmgz9******</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The username for authentication. This parameter is required if authType is set to ACL_AUTH.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The ID of the vSwitch with which the instance is associated. This parameter is required only if instanceType is set to EXTERNAL_ROCKETMQ and networkType is set to TCP_VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpv******</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC with which the instance is associated. This parameter is required only if instanceType is set to EXTERNAL_ROCKETMQ and networkType is set to TCP_VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9qt50xhtj9krb******</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateDisasterRecoveryPlanRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            CreateDisasterRecoveryPlanRequestInstances self = new CreateDisasterRecoveryPlanRequestInstances();
            return TeaModel.build(map, self);
        }

        public CreateDisasterRecoveryPlanRequestInstances setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateDisasterRecoveryPlanRequestInstances setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public CreateDisasterRecoveryPlanRequestInstances setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public CreateDisasterRecoveryPlanRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateDisasterRecoveryPlanRequestInstances setInstanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }
        public String getInstanceRole() {
            return this.instanceRole;
        }

        public CreateDisasterRecoveryPlanRequestInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateDisasterRecoveryPlanRequestInstances setMessageProperty(CreateDisasterRecoveryPlanRequestInstancesMessageProperty messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public CreateDisasterRecoveryPlanRequestInstancesMessageProperty getMessageProperty() {
            return this.messageProperty;
        }

        public CreateDisasterRecoveryPlanRequestInstances setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public CreateDisasterRecoveryPlanRequestInstances setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateDisasterRecoveryPlanRequestInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateDisasterRecoveryPlanRequestInstances setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateDisasterRecoveryPlanRequestInstances setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateDisasterRecoveryPlanRequestInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateDisasterRecoveryPlanRequestInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
