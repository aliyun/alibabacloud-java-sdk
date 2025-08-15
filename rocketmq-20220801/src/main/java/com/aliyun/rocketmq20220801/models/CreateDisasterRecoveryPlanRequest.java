// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateDisasterRecoveryPlanRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic consumer progress synchronization.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you set <code>syncCheckpointEnabled</code> to true.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSyncCheckpoint")
    public Boolean autoSyncCheckpoint;

    /**
     * <p>The instances involved in the Global Replicator task. You must specify this parameter.</p>
     */
    @NameInMap("instances")
    public java.util.List<CreateDisasterRecoveryPlanRequestInstances> instances;

    /**
     * <p>The description of the Global Replicator task.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("planDesc")
    public String planDesc;

    /**
     * <p>The name of the Global Replicator task. You must specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>The type of the Global Replicator task. You must specify this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/2843187.html">Global Replicator</a>. Valid values:</p>
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
     * <p>Specifies whether to enable consumer progress synchronization.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
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
         * <p>The attribute key.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("propertyKey")
        public String propertyKey;

        /**
         * <p>The attribute value.</p>
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
         * <p>The authentication method. If you set instanceType to ALIYUN_ROCKETMQ and the instance is an ApsaraMQ for RocketMQ 4.0 instance, you do not need to specify this parameter.</p>
         * <ul>
         * <li>NO_AUTH: no authentication</li>
         * <li>ACL_AUTH: access control list (ACL)-based authentication</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>NO_AUTH: no authentication</li>
         * <li>ACL_AUTH: access control list (ACL)-based authentication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACL_AUTH</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>The ID of the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_DS_XXX_YYY</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The instance endpoint. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("endpointUrl")
        public String endpointUrl;

        /**
         * <p>The instance ID. This parameter is required only if you set instanceType to ALIYUN_ROCKETMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-******</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The instance role. Valid values:</p>
         * <ul>
         * <li>ACTIVE: primary instance</li>
         * <li>Passive: secondary instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASSIVE</p>
         */
        @NameInMap("instanceRole")
        public String instanceRole;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: ApsaraMQ for RocketMQ instance</li>
         * <li>EXTERNAL_ROCKETMQ: external RocketMQ instance</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: ApsaraMQ for RocketMQ instance</li>
         * <li>EXTERNAL_ROCKETMQ: external RocketMQ instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The message attribute. When you synchronize a message to the destination cluster, the system automatically adds the attribute to the message for SQL-based filtering.</p>
         */
        @NameInMap("messageProperty")
        public CreateDisasterRecoveryPlanRequestInstancesMessageProperty messageProperty;

        /**
         * <p>The network type. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ. Valid values:</p>
         * <ul>
         * <li>TCP_INTERNET: Internet over TCP</li>
         * <li>TCP_VPC: virtual private cloud (VPC) over TCP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP_INTERNET</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The password used for authentication. This parameter is required only if you set authType to ACL_AUTH. If you set instanceType to ALIYUN_ROCKETMQ, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The region where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The ID of the security group to which the instance belongs. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ and networkType to TCP_VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp17hpmgz9******</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The username used for authentication. This parameter is required only if you set authType to ACL_AUTH.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The ID of the vSwitch with which the instance is associated. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ and networkType to TCP_VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpv******</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC with which the instance is associated. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ and networkType to TCP_VPC.</p>
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
