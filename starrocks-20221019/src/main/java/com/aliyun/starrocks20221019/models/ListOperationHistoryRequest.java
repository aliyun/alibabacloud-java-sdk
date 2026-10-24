// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationHistoryRequest extends TeaModel {
    /**
     * <p>The end time of the operation. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1742179008000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>update_configuration</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The page number of the current page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging in a paged query. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the operation. The value is a UNIX timestamp in milliseconds.</p>
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
