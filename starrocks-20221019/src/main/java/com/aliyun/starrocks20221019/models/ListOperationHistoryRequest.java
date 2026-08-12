// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationHistoryRequest extends TeaModel {
    /**
     * <p>End time of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1742179008000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>update_configuration</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>Page number of the current page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of entries per page for paged queries. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Start time of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1742179008000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListOperationHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHistoryRequest self = new ListOperationHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListOperationHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationHistoryRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ListOperationHistoryRequest setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public String getOperationStatus() {
        return this.operationStatus;
    }

    public ListOperationHistoryRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ListOperationHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOperationHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
