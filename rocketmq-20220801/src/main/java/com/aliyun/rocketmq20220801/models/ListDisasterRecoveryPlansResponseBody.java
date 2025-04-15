// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListDisasterRecoveryPlansResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if the access is denied due to the reason that the Resource Access Management (RAM) user does not have the required permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return result</p>
     */
    @NameInMap("data")
    public ListDisasterRecoveryPlansResponseBodyData data;

    /**
     * <p>Dynamic error code</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>855EF8E6-9C1D-5DE2-9E84-924E13Exxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListDisasterRecoveryPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDisasterRecoveryPlansResponseBody self = new ListDisasterRecoveryPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDisasterRecoveryPlansResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListDisasterRecoveryPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDisasterRecoveryPlansResponseBody setData(ListDisasterRecoveryPlansResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDisasterRecoveryPlansResponseBodyData getData() {
        return this.data;
    }

    public ListDisasterRecoveryPlansResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListDisasterRecoveryPlansResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListDisasterRecoveryPlansResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDisasterRecoveryPlansResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDisasterRecoveryPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDisasterRecoveryPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty extends TeaModel {
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

        public static ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty self = new ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class ListDisasterRecoveryPlansResponseBodyDataListInstances extends TeaModel {
        /**
         * <p>Authentication method</p>
         * 
         * <strong>example:</strong>
         * <p>NO_AUTH</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>Endpoint URL</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("endpointUrl")
        public String endpointUrl;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-ot93rbxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Instance role</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
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
         * <p>Message property</p>
         */
        @NameInMap("messageProperty")
        public ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty messageProperty;

        /**
         * <p>Network type</p>
         * 
         * <strong>example:</strong>
         * <p>TCP_INTERNET</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>Authentication password</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The region where the instance is located</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Security group ID</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp17hpmgz9******</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>Authentication username</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>VSwitch ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6gwtbn6etadpv******</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp13docqysrgxtbxxxx</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListDisasterRecoveryPlansResponseBodyDataListInstances build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryPlansResponseBodyDataListInstances self = new ListDisasterRecoveryPlansResponseBodyDataListInstances();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setInstanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }
        public String getInstanceRole() {
            return this.instanceRole;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setMessageProperty(ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public ListDisasterRecoveryPlansResponseBodyDataListInstancesMessageProperty getMessageProperty() {
            return this.messageProperty;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListDisasterRecoveryPlansResponseBodyDataListInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListDisasterRecoveryPlansResponseBodyDataList extends TeaModel {
        /**
         * <p>Whether to enable automatic synchronization of consumption progress.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoSyncCheckpoint")
        public Boolean autoSyncCheckpoint;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Extended information</p>
         */
        @NameInMap("extInfo")
        public java.util.Map<String, String> extInfo;

        /**
         * <p>Instances involved in the backup plan</p>
         */
        @NameInMap("instances")
        public java.util.List<ListDisasterRecoveryPlansResponseBodyDataListInstances> instances;

        /**
         * <p>Plan description</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("planDesc")
        public String planDesc;

        /**
         * <p>Plan ID</p>
         * 
         * <strong>example:</strong>
         * <p>1300000016</p>
         */
        @NameInMap("planId")
        public Long planId;

        /**
         * <p>Plan name</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("planName")
        public String planName;

        /**
         * <p>Plan status:</p>
         * <ul>
         * <li>CREATED (Created)</li>
         * <li>RUNNING (Running)</li>
         * <li>DELETED (Deleted)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("planStatus")
        public String planStatus;

        /**
         * <p>Plan type:</p>
         * <ul>
         * <li>ACTIVE_PASSIVE (One-way backup)</li>
         * <li>ACTIVE_ACTIVE (Two-way backup)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE_PASSIVE</p>
         */
        @NameInMap("planType")
        public String planType;

        /**
         * <p>Sync checkpoint switch</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("syncCheckpointEnabled")
        public Boolean syncCheckpointEnabled;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListDisasterRecoveryPlansResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryPlansResponseBodyDataList self = new ListDisasterRecoveryPlansResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setAutoSyncCheckpoint(Boolean autoSyncCheckpoint) {
            this.autoSyncCheckpoint = autoSyncCheckpoint;
            return this;
        }
        public Boolean getAutoSyncCheckpoint() {
            return this.autoSyncCheckpoint;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setInstances(java.util.List<ListDisasterRecoveryPlansResponseBodyDataListInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListDisasterRecoveryPlansResponseBodyDataListInstances> getInstances() {
            return this.instances;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setPlanDesc(String planDesc) {
            this.planDesc = planDesc;
            return this;
        }
        public String getPlanDesc() {
            return this.planDesc;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setPlanStatus(String planStatus) {
            this.planStatus = planStatus;
            return this;
        }
        public String getPlanStatus() {
            return this.planStatus;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setSyncCheckpointEnabled(Boolean syncCheckpointEnabled) {
            this.syncCheckpointEnabled = syncCheckpointEnabled;
            return this;
        }
        public Boolean getSyncCheckpointEnabled() {
            return this.syncCheckpointEnabled;
        }

        public ListDisasterRecoveryPlansResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListDisasterRecoveryPlansResponseBodyData extends TeaModel {
        /**
         * <p>Paged data</p>
         */
        @NameInMap("list")
        public java.util.List<ListDisasterRecoveryPlansResponseBodyDataList> list;

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>Scroll request ID.
         * Automatically generated by the system, subsequent paging requests need to include this result to continue paging.</p>
         * 
         * <strong>example:</strong>
         * <p>B13D0B07-F24B-4790-88D8-D47A38063D00</p>
         */
        @NameInMap("scrollId")
        public String scrollId;

        /**
         * <p>Total number of records</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListDisasterRecoveryPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryPlansResponseBodyData self = new ListDisasterRecoveryPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryPlansResponseBodyData setList(java.util.List<ListDisasterRecoveryPlansResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDisasterRecoveryPlansResponseBodyDataList> getList() {
            return this.list;
        }

        public ListDisasterRecoveryPlansResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDisasterRecoveryPlansResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDisasterRecoveryPlansResponseBodyData setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public ListDisasterRecoveryPlansResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
