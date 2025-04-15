// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateDisasterRecoveryPlanRequest extends TeaModel {
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
     * <p>Instances involved in the backup plan. Required</p>
     */
    @NameInMap("instances")
    public java.util.List<CreateDisasterRecoveryPlanRequestInstances> instances;

    /**
     * <p>Plan description</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("planDesc")
    public String planDesc;

    /**
     * <p>Plan name, required</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>Backup plan type, required. Please refer to the <a href="https://help.aliyun.com/document_detail/2843187.html">documentation</a>.
     * Parameter values are as follows:</p>
     * <ul>
     * <li>ACTIVE_PASSIVE: One-way backup</li>
     * <li>ACTIVE_ACTIVE: Two-way backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE_ACTIVE</p>
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
         * <p>Property key</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("propertyKey")
        public String propertyKey;

        /**
         * <p>Property value</p>
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
         * <p>Authentication method. Not required for instanceType of ALIYUN_ROCKETMQ and version 4.0</p>
         * <ul>
         * <li>NO_AUTH: No authentication required</li>
         * <li>ACL_AUTH: ACL authentication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACL_AUTH</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>Endpoint URL, not required for instanceType of ALIYUN_ROCKETMQ, but required for EXTERNAL_ROCKETMQ</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("endpointUrl")
        public String endpointUrl;

        /**
         * <p>Instance ID, not required for instanceType of EXTERNAL_ROCKETMQ, but required for ALIYUN_ROCKETMQ</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-******</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Instance role, either primary or secondary</p>
         * <ul>
         * <li>ACTIVE: Primary</li>
         * <li>PASSIVE: Secondary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASSIVE</p>
         */
        @NameInMap("instanceRole")
        public String instanceRole;

        /**
         * <p>Instance type</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
         * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>Message filtering properties. When messages are synchronized to the target cluster, this property will be automatically added for SQL filtering during message consumption.</p>
         */
        @NameInMap("messageProperty")
        public CreateDisasterRecoveryPlanRequestInstancesMessageProperty messageProperty;

        /**
         * <p>Network type, not required for instanceType of ALIYUN_ROCKETMQ, but required for EXTERNAL_ROCKETMQ
         * Parameter values are as follows:</p>
         * <ul>
         * <li>TCP_INTERNET: TCP public network</li>
         * <li>TCP_VPC: TCP VPC (Virtual Private Cloud)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP_INTERNET</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>Authentication password, required when authType is ACL_AUTH. Not required for instanceType of ALIYUN_ROCKETMQ</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>Region where the instance is located</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Security group ID, required only when the <code>instanceType</code> is EXTERNAL_ROCKETMQ and <code>networkType</code> is TCP_VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp17hpmgz9******</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>Authentication username, required when authType is ACL_AUTH</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The ID of the switch associated with the instance, required only when the <code>instanceType</code> is EXTERNAL_ROCKETMQ and <code>networkType</code> is TCP_VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpv******</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the private network associated with the created instance. The instanceType instance type is only EXTERNAL_ROCKETMQ. It is required when the networkType is TCP_VPC.</p>
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
