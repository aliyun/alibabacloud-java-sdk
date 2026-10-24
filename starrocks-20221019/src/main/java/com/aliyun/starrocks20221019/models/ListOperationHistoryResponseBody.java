// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationHistoryResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOperationHistoryResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>832</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListOperationHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHistoryResponseBody self = new ListOperationHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationHistoryResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListOperationHistoryResponseBody setData(java.util.List<ListOperationHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOperationHistoryResponseBodyData> getData() {
        return this.data;
    }

    public ListOperationHistoryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListOperationHistoryResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListOperationHistoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOperationHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOperationHistoryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOperationHistoryResponseBodyData extends TeaModel {
        /**
         * <p>The value after the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>FE enable = true</p>
         */
        @NameInMap("AfterValue")
        public String afterValue;

        /**
         * <p>The value before the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>FE enable = false</p>
         */
        @NameInMap("BeforeValue")
        public String beforeValue;

        /**
         * <p>The start time of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The end time of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("GmtEnd")
        public Long gmtEnd;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-cd7a3a6f2186d5c9</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The operation details.</p>
         * 
         * <strong>example:</strong>
         * <p>Insufficient inventory. The operation failed and a refund has been issued</p>
         */
        @NameInMap("OperationDetail")
        public String operationDetail;

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-f49743caa809****</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>The operation status. Valid values:</p>
         * <ul>
         * <li>COMPLETED: Completed.</li>
         * <li>TERMINATED: Terminated.</li>
         * <li>HUMAN_PROCESSING: Pending manual processing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("OperationStatus")
        public String operationStatus;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>trial_to_official: Upgrades the trial edition to the standard edition.</li>
         * <li>upgrade_version: Upgrades the version.</li>
         * <li>update_configuration: Updates the configuration.</li>
         * <li>update_public_network_status: Updates the public network status.</li>
         * <li>create_cluster: Creates a cluster.</li>
         * <li>delete_cluster: Deletes a cluster.</li>
         * <li>disable_cluster: Stops a cluster.</li>
         * <li>enable_cluster: Recovers a cluster.</li>
         * <li>restart_cluster: Restarts a cluster.</li>
         * <li>migrate_cluster: Migrates a cluster.</li>
         * <li>renew_cluster: Renews a cluster.</li>
         * <li>modify_charge_type: Changes the billing method.</li>
         * <li>UPGRADE: Upgrades a cluster.</li>
         * <li>DOWNGRADE: Downgrades a cluster.</li>
         * <li>create_node_group: Creates a node group.</li>
         * <li>delete_node_group: Deletes a node group.</li>
         * <li>disable_node_group: Stops a node group.</li>
         * <li>enable_node_group: Recovers a node group.</li>
         * <li>sre_operation: Performs O&amp;M on a cluster.</li>
         * <li>resource_change: Changes resources.</li>
         * <li>disable_postpaid_resource: Disables pay-as-you-go resources.</li>
         * <li>enable_postpaid_resource: Recovers pay-as-you-go resources.</li>
         * <li>restart_node_group: Restarts a compute group.</li>
         * <li>enable_ha_cluster: Enables high availability (HA) to keep the cluster active.</li>
         * <li>restart_node: Restarts a node.</li>
         * <li>backup: Backs up data.</li>
         * <li>delete_backup: Deletes a data backup.</li>
         * <li>cancel_backup_task: Cancels a data backup task.</li>
         * <li>modify_timezone: Modifies the system time zone.</li>
         * <li>restore: Recovers data.</li>
         * <li>switch_az: Switches the primary and secondary zones.</li>
         * <li>rollback_upgrade_version: Rolls back a version upgrade.</li>
         * <li>scale_out_fe: Scales out FE nodes.</li>
         * <li>scale_in_fe: Scales in FE nodes.</li>
         * <li>upgrade_fe_cu: Upgrades the FE CU specifications.</li>
         * <li>downgrade_fe_cu: Decrease the quota of FE CU specifications.</li>
         * <li>increase_fe_disk_size: Increases the FE disk size.</li>
         * <li>decrease_fe_disk_size: Decreases the FE disk size.</li>
         * <li>increase_fe_disk_number: Increases the number of FE disks.</li>
         * <li>decrease_fe_disk_number: Decreases the number of FE disks.</li>
         * <li>upgrade_fe_disk_performance_level: Upgrades the FE disk performance level (PL).</li>
         * <li>downgrade_fe_disk_performance_level: Decrease the quota of the FE disk performance level (PL).</li>
         * <li>create_agent: Creates an agent.</li>
         * <li>upgrade_agent_cu: Upgrades the agent CU specifications.</li>
         * <li>scale_out_be: Scales out BE nodes.</li>
         * <li>scale_in_be: Scales in BE nodes.</li>
         * <li>upgrade_be_cu: Upgrades the BE CU specifications.</li>
         * <li>downgrade_be_cu: Decrease the quota of BE CU specifications.</li>
         * <li>increase_be_disk_size: Increases the BE disk size.</li>
         * <li>decrease_be_disk_size: Decreases the BE disk size.</li>
         * <li>increase_be_disk_number: Increases the number of BE disks.</li>
         * <li>decrease_be_disk_number: Decreases the number of BE disks.</li>
         * <li>upgrade_be_disk_performance_level: Upgrades the BE disk performance level (PL).</li>
         * <li>downgrade_be_disk_performance_level: Decrease the quota of the BE disk performance level (PL).</li>
         * <li>upgrade_be_spec_type: Upgrades the BE specification type.</li>
         * <li>downgrade_be_spec_type: Decrease the quota of the BE specification type.</li>
         * <li>scale_out_cn: Scales out CN nodes.</li>
         * <li>scale_in_cn: Scales in CN nodes.</li>
         * <li>upgrade_cn_cu: Upgrades the CN CU specifications.</li>
         * <li>downgrade_cn_cu: Decrease the quota of CN CU specifications.</li>
         * <li>increase_cn_disk_size: Increases the CN disk size.</li>
         * <li>decrease_cn_disk_size: Decreases the CN disk size.</li>
         * <li>increase_cn_disk_number: Increases the number of CN disks.</li>
         * <li>decrease_cn_disk_number: Decreases the number of CN disks.</li>
         * <li>upgrade_cn_disk_performance: Upgrades the CN disk performance level (PL).</li>
         * <li>downgrade_cn_disk_performance: Decrease the quota of the CN disk performance level (PL).</li>
         * <li>upgrade_cn_spec_type: Upgrades the CN specification type.</li>
         * <li>downgrade_cn_spec_type: Decrease the quota of the CN specification type.</li>
         * <li>elastic_scale_out_cn: Elastically scales out CN nodes.</li>
         * <li>elastic_scale_in_cn: Elastically scales in CN nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upgrade_version</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The operation progress.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        public static ListOperationHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationHistoryResponseBodyData self = new ListOperationHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOperationHistoryResponseBodyData setAfterValue(String afterValue) {
            this.afterValue = afterValue;
            return this;
        }
        public String getAfterValue() {
            return this.afterValue;
        }

        public ListOperationHistoryResponseBodyData setBeforeValue(String beforeValue) {
            this.beforeValue = beforeValue;
            return this;
        }
        public String getBeforeValue() {
            return this.beforeValue;
        }

        public ListOperationHistoryResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOperationHistoryResponseBodyData setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public ListOperationHistoryResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOperationHistoryResponseBodyData setOperationDetail(String operationDetail) {
            this.operationDetail = operationDetail;
            return this;
        }
        public String getOperationDetail() {
            return this.operationDetail;
        }

        public ListOperationHistoryResponseBodyData setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListOperationHistoryResponseBodyData setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public ListOperationHistoryResponseBodyData setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListOperationHistoryResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

}
