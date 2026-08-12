// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationHistoryResponseBody extends TeaModel {
    /**
     * <p>Details about access denied errors.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOperationHistoryResponseBodyData> data;

    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of records.</p>
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
         * <p>Value after the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>FE enable = true</p>
         */
        @NameInMap("AfterValue")
        public String afterValue;

        /**
         * <p>Value before the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>FE enable = false</p>
         */
        @NameInMap("BeforeValue")
        public String beforeValue;

        /**
         * <p>Start time of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>End time of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("GmtEnd")
        public Long gmtEnd;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-cd7a3a6f2186d5c9</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Operation details.</p>
         * 
         * <strong>example:</strong>
         * <p>库存不足，操作失败，已退款</p>
         */
        @NameInMap("OperationDetail")
        public String operationDetail;

        /**
         * <p>Operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-f49743caa809****</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>Operation status:</p>
         * <ul>
         * <li><p>COMPLETED: completed</p>
         * </li>
         * <li><p>TERMINATED: terminated</p>
         * </li>
         * <li><p>HUMAN_PROCESSING: pending manual processing</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("OperationStatus")
        public String operationStatus;

        /**
         * <p>Operation type. Valid values:</p>
         * <ul>
         * <li><p>trial_to_official: upgrade from Trial Edition to Standard Edition</p>
         * </li>
         * <li><p>upgrade_version: upgrade version</p>
         * </li>
         * <li><p>update_configuration: update configuration</p>
         * </li>
         * <li><p>update_public_network_status: update public network status</p>
         * </li>
         * <li><p>create_cluster: create cluster</p>
         * </li>
         * <li><p>delete_cluster: delete cluster</p>
         * </li>
         * <li><p>disable_cluster: stop cluster</p>
         * </li>
         * <li><p>enable_cluster: resume cluster</p>
         * </li>
         * <li><p>restart_cluster: restart cluster</p>
         * </li>
         * <li><p>migrate_cluster: migrate cluster</p>
         * </li>
         * <li><p>renew_cluster: renew cluster</p>
         * </li>
         * <li><p>modify_charge_type: change billing method</p>
         * </li>
         * <li><p>UPGRADE: upgrade cluster</p>
         * </li>
         * <li><p>DOWNGRADE: downgrade cluster</p>
         * </li>
         * <li><p>create_node_group: create node group</p>
         * </li>
         * <li><p>delete_node_group: delete node group</p>
         * </li>
         * <li><p>disable_node_group: stop node group</p>
         * </li>
         * <li><p>enable_node_group: resume node group</p>
         * </li>
         * <li><p>sre_operation: O\&amp;M cluster</p>
         * </li>
         * <li><p>resource_change: resource change</p>
         * </li>
         * <li><p>disable_postpaid_resource: disable pay-as-you-go resources</p>
         * </li>
         * <li><p>enable_postpaid_resource: enable pay-as-you-go resources</p>
         * </li>
         * <li><p>restart_node_group: restart compute group</p>
         * </li>
         * <li><p>enable_ha_cluster: enable high availability (HA) for cluster</p>
         * </li>
         * <li><p>restart_node: restart node</p>
         * </li>
         * <li><p>backup: data backup</p>
         * </li>
         * <li><p>delete_backup: delete data backup</p>
         * </li>
         * <li><p>cancel_backup_task: cancel data backup</p>
         * </li>
         * <li><p>modify_timezone: modify system time zone</p>
         * </li>
         * <li><p>restore: data restoration</p>
         * </li>
         * <li><p>switch_az: switch primary and secondary zones</p>
         * </li>
         * <li><p>rollback_upgrade_version: roll back version upgrade</p>
         * </li>
         * <li><p>scale_out_fe: scale out FE</p>
         * </li>
         * <li><p>scale_in_fe: scale in FE</p>
         * </li>
         * <li><p>upgrade_fe_cu: upgrade FE CU specification</p>
         * </li>
         * <li><p>downgrade_fe_cu: downgrade FE CU specification</p>
         * </li>
         * <li><p>increase_fe_disk_size: increase FE disk size</p>
         * </li>
         * <li><p>decrease_fe_disk_size: decrease FE disk size</p>
         * </li>
         * <li><p>increase_fe_disk_number: increase FE disk count</p>
         * </li>
         * <li><p>decrease_fe_disk_number: decrease FE disk count</p>
         * </li>
         * <li><p>upgrade_fe_disk_performance_level: upgrade FE disk performance level</p>
         * </li>
         * <li><p>downgrade_fe_disk_performance_level: downgrade FE disk performance level</p>
         * </li>
         * <li><p>create_agent: create Agent</p>
         * </li>
         * <li><p>upgrade_agent_cu: upgrade Agent CU specification</p>
         * </li>
         * <li><p>scale_out_be: scale out BE</p>
         * </li>
         * <li><p>scale_in_be: scale in BE</p>
         * </li>
         * <li><p>upgrade_be_cu: upgrade BE CU specification</p>
         * </li>
         * <li><p>downgrade_be_cu: downgrade BE CU specification</p>
         * </li>
         * <li><p>increase_be_disk_size: increase BE disk size</p>
         * </li>
         * <li><p>decrease_be_disk_size: decrease BE disk size</p>
         * </li>
         * <li><p>increase_be_disk_number: increase BE disk count</p>
         * </li>
         * <li><p>decrease_be_disk_number: decrease BE disk count</p>
         * </li>
         * <li><p>upgrade_be_disk_performance_level: upgrade BE disk performance level</p>
         * </li>
         * <li><p>downgrade_be_disk_performance_level: downgrade BE disk performance level</p>
         * </li>
         * <li><p>upgrade_be_spec_type: upgrade BE specification type</p>
         * </li>
         * <li><p>downgrade_be_spec_type: downgrade BE specification type</p>
         * </li>
         * <li><p>scale_out_cn: scale out CN</p>
         * </li>
         * <li><p>scale_in_cn: scale in CN</p>
         * </li>
         * <li><p>upgrade_cn_cu: upgrade CN CU specification</p>
         * </li>
         * <li><p>downgrade_cn_cu: downgrade CN CU specification</p>
         * </li>
         * <li><p>increase_cn_disk_size: increase CN disk size</p>
         * </li>
         * <li><p>decrease_cn_disk_size: decrease CN disk size</p>
         * </li>
         * <li><p>increase_cn_disk_number: increase CN disk count</p>
         * </li>
         * <li><p>decrease_cn_disk_number: decrease CN disk count</p>
         * </li>
         * <li><p>upgrade_cn_disk_performance: upgrade CN disk performance level</p>
         * </li>
         * <li><p>downgrade_cn_disk_performance: downgrade CN disk performance level</p>
         * </li>
         * <li><p>upgrade_cn_spec_type: upgrade CN specification type</p>
         * </li>
         * <li><p>downgrade_cn_spec_type: downgrade CN specification type</p>
         * </li>
         * <li><p>elastic_scale_out_cn: elastically scale out CN</p>
         * </li>
         * <li><p>elastic_scale_in_cn: elastically scale in CN</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upgrade_version</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>Operation progress.</p>
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
