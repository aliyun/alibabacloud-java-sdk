// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetDisasterRecoveryPlanResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if the access is denied because the Resource Access Management (RAM) user does not have the required permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetDisasterRecoveryPlanResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7358418D-83BD-507A-8079-611C63E0xxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDisasterRecoveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDisasterRecoveryPlanResponseBody self = new GetDisasterRecoveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDisasterRecoveryPlanResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetDisasterRecoveryPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDisasterRecoveryPlanResponseBody setData(GetDisasterRecoveryPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDisasterRecoveryPlanResponseBodyData getData() {
        return this.data;
    }

    public GetDisasterRecoveryPlanResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetDisasterRecoveryPlanResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetDisasterRecoveryPlanResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDisasterRecoveryPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDisasterRecoveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDisasterRecoveryPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty extends TeaModel {
        /**
         * <p>The attribute key.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("propertyKey")
        public String propertyKey;

        /**
         * <p>The attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("propertyValue")
        public String propertyValue;

        public static GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty self = new GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty();
            return TeaModel.build(map, self);
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class GetDisasterRecoveryPlanResponseBodyDataInstances extends TeaModel {
        /**
         * <p>The authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL_AUTH</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>The consumer Group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_DS_XXX_YYY</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The endpoint.</p>
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
         * <p>rmq-cn-gpz3qtcdxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The instance role.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("instanceRole")
        public String instanceRole;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The message attribute.</p>
         */
        @NameInMap("messageProperty")
        public GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty messageProperty;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP_INTERNET</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The password used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The ID of the region where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp17hpmgz9******</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The username used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpv******</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9qt50xhtj9krb******</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GetDisasterRecoveryPlanResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            GetDisasterRecoveryPlanResponseBodyDataInstances self = new GetDisasterRecoveryPlanResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setInstanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }
        public String getInstanceRole() {
            return this.instanceRole;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setMessageProperty(GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public GetDisasterRecoveryPlanResponseBodyDataInstancesMessageProperty getMessageProperty() {
            return this.messageProperty;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetDisasterRecoveryPlanResponseBodyDataInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetDisasterRecoveryPlanResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether automatic consumer progress synchronization is enabled.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <code>syncCheckpointEnabled</code> is set to true.</p>
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
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("extInfo")
        public java.util.Map<String, String> extInfo;

        /**
         * <p>The instances involved in the Global Replicator task.</p>
         */
        @NameInMap("instances")
        public java.util.List<GetDisasterRecoveryPlanResponseBodyDataInstances> instances;

        /**
         * <p>The description of the Global Replicator task.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("planDesc")
        public String planDesc;

        /**
         * <p>The ID of the Global Replicator task.</p>
         * 
         * <strong>example:</strong>
         * <p>1300000016</p>
         */
        @NameInMap("planId")
        public Long planId;

        /**
         * <p>The name of the Global Replicator task.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("planName")
        public String planName;

        /**
         * <p>The status of the Global Replicator task. Valid values:</p>
         * <ul>
         * <li>CREATED</li>
         * <li>RUNNING</li>
         * <li>DELETED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("planStatus")
        public String planStatus;

        /**
         * <p>The type of the Global Replicator task. Valid values:</p>
         * <ul>
         * <li>ACTIVE_PASSIVE: one-way backup</li>
         * <li>ACTIVE_ACTIVE: two-way backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE_PASSIVE</p>
         */
        @NameInMap("planType")
        public String planType;

        /**
         * <p>Indicates whether consumer progress synchronization is enabled.</p>
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

        /**
         * <p>The time when the query task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetDisasterRecoveryPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDisasterRecoveryPlanResponseBodyData self = new GetDisasterRecoveryPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDisasterRecoveryPlanResponseBodyData setAutoSyncCheckpoint(Boolean autoSyncCheckpoint) {
            this.autoSyncCheckpoint = autoSyncCheckpoint;
            return this;
        }
        public Boolean getAutoSyncCheckpoint() {
            return this.autoSyncCheckpoint;
        }

        public GetDisasterRecoveryPlanResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDisasterRecoveryPlanResponseBodyData setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public GetDisasterRecoveryPlanResponseBodyData setInstances(java.util.List<GetDisasterRecoveryPlanResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<GetDisasterRecoveryPlanResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public GetDisasterRecoveryPlanResponseBodyData setPlanDesc(String planDesc) {
            this.planDesc = planDesc;
            return this;
        }
        public String getPlanDesc() {
            return this.planDesc;
        }

        public GetDisasterRecoveryPlanResponseBodyData setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public GetDisasterRecoveryPlanResponseBodyData setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public GetDisasterRecoveryPlanResponseBodyData setPlanStatus(String planStatus) {
            this.planStatus = planStatus;
            return this;
        }
        public String getPlanStatus() {
            return this.planStatus;
        }

        public GetDisasterRecoveryPlanResponseBodyData setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public GetDisasterRecoveryPlanResponseBodyData setSyncCheckpointEnabled(Boolean syncCheckpointEnabled) {
            this.syncCheckpointEnabled = syncCheckpointEnabled;
            return this;
        }
        public Boolean getSyncCheckpointEnabled() {
            return this.syncCheckpointEnabled;
        }

        public GetDisasterRecoveryPlanResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
