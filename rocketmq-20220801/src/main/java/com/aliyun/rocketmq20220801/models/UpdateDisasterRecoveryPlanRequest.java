// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateDisasterRecoveryPlanRequest extends TeaModel {
    /**
     * <p>Whether to enable automatic synchronization of consumption progress.</p>
     * <blockquote>
     * <p>This is effective only when consumption progress synchronization is enabled, i.e., the value of <code>syncCheckpointEnabled</code> is true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoSyncCheckpoint")
    public Boolean autoSyncCheckpoint;

    /**
     * <p>The instances that are involved in the global message backup plan.</p>
     */
    @NameInMap("instances")
    public java.util.List<UpdateDisasterRecoveryPlanRequestInstances> instances;

    /**
     * <p>The description of the global message backup plan.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("planDesc")
    public String planDesc;

    /**
     * <p>The name of the global message backup plan.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>The type of the global message backup plan. Valid values:</p>
     * <ul>
     * <li>ACTIVE_PASSIVE: geo-disaster recovery</li>
     * <li>ACTIVE_ACTIVE: active geo-redundancy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE_PASSIVE</p>
     */
    @NameInMap("planType")
    public String planType;

    /**
     * <p>Switch for synchronizing consumption progress</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("syncCheckpointEnabled")
    public Boolean syncCheckpointEnabled;

    public static UpdateDisasterRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDisasterRecoveryPlanRequest self = new UpdateDisasterRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDisasterRecoveryPlanRequest setAutoSyncCheckpoint(Boolean autoSyncCheckpoint) {
        this.autoSyncCheckpoint = autoSyncCheckpoint;
        return this;
    }
    public Boolean getAutoSyncCheckpoint() {
        return this.autoSyncCheckpoint;
    }

    public UpdateDisasterRecoveryPlanRequest setInstances(java.util.List<UpdateDisasterRecoveryPlanRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<UpdateDisasterRecoveryPlanRequestInstances> getInstances() {
        return this.instances;
    }

    public UpdateDisasterRecoveryPlanRequest setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
        return this;
    }
    public String getPlanDesc() {
        return this.planDesc;
    }

    public UpdateDisasterRecoveryPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public UpdateDisasterRecoveryPlanRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public UpdateDisasterRecoveryPlanRequest setSyncCheckpointEnabled(Boolean syncCheckpointEnabled) {
        this.syncCheckpointEnabled = syncCheckpointEnabled;
        return this;
    }
    public Boolean getSyncCheckpointEnabled() {
        return this.syncCheckpointEnabled;
    }

    public static class UpdateDisasterRecoveryPlanRequestInstancesMessageProperty extends TeaModel {
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

        public static UpdateDisasterRecoveryPlanRequestInstancesMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            UpdateDisasterRecoveryPlanRequestInstancesMessageProperty self = new UpdateDisasterRecoveryPlanRequestInstancesMessageProperty();
            return TeaModel.build(map, self);
        }

        public UpdateDisasterRecoveryPlanRequestInstancesMessageProperty setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public UpdateDisasterRecoveryPlanRequestInstancesMessageProperty setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class UpdateDisasterRecoveryPlanRequestInstances extends TeaModel {
        /**
         * <p>The authentication type.</p>
         * <ul>
         * <li>NO_AUTH: no authentication</li>
         * <li>ACL_AUTH: access control list (ACL)-based authentication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO_AUTH</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>The instance endpoint. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("endpointUrl")
        public String endpointUrl;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-83l3r0xxxx</p>
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
         * <p>ACTIVE</p>
         */
        @NameInMap("instanceRole")
        public String instanceRole;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: ApsaraMQ for RocketMQ instance</li>
         * <li>EXTERNAL_ROCKETMQ: open source RocketMQ cluster</li>
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
        public UpdateDisasterRecoveryPlanRequestInstancesMessageProperty messageProperty;

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
         * <p>The password that is used for authentication. This parameter is required only if you set authType to ACL_AUTH.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The ID of the security group to which the instance belongs. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp17hpmgz9******</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The username that is used for authentication. This parameter is required only if you set authType to ACL_AUTH.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The ID of the vSwitch with which the instance is associated. If you want to specify multiple vSwitches, separate the vSwitches with vertical bars (|).</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpv******</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC with which the instance is associated. This parameter is required only if you set instanceType to EXTERNAL_ROCKETMQ.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9qt50xhtj9krb******</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static UpdateDisasterRecoveryPlanRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            UpdateDisasterRecoveryPlanRequestInstances self = new UpdateDisasterRecoveryPlanRequestInstances();
            return TeaModel.build(map, self);
        }

        public UpdateDisasterRecoveryPlanRequestInstances setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setInstanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }
        public String getInstanceRole() {
            return this.instanceRole;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setMessageProperty(UpdateDisasterRecoveryPlanRequestInstancesMessageProperty messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public UpdateDisasterRecoveryPlanRequestInstancesMessageProperty getMessageProperty() {
            return this.messageProperty;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateDisasterRecoveryPlanRequestInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
