// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListBackupRecordRequest extends TeaModel {
    /**
     * <p>The timestamp when the backup task ended. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1699600611000</p>
     */
    @NameInMap("BackupEndTime")
    public Long backupEndTime;

    /**
     * <p>The timestamp when the backup task started. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1699514211000</p>
     */
    @NameInMap("BackupStartTime")
    public Long backupStartTime;

    /**
     * <p>The page number. Default value: <strong>1</strong>. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The information that you want to use to identify the servers protected by the anti-ransomware policy. You can enter the IP address or ID of a server.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("MachineRemark")
    public String machineRemark;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The backup task status. Valid values:</p>
     * <ul>
     * <li><strong>BACKUP_COMPLETE</strong>: The backup task is successful.</li>
     * <li><strong>BACKUP_FAILED</strong>: The backup task failed.</li>
     * <li><strong>PARTIAL_COMPLETE</strong>: The backup task is partially successful.</li>
     * </ul>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static ListBackupRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBackupRecordRequest self = new ListBackupRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListBackupRecordRequest setBackupEndTime(Long backupEndTime) {
        this.backupEndTime = backupEndTime;
        return this;
    }
    public Long getBackupEndTime() {
        return this.backupEndTime;
    }

    public ListBackupRecordRequest setBackupStartTime(Long backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }
    public Long getBackupStartTime() {
        return this.backupStartTime;
    }

    public ListBackupRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListBackupRecordRequest setMachineRemark(String machineRemark) {
        this.machineRemark = machineRemark;
        return this;
    }
    public String getMachineRemark() {
        return this.machineRemark;
    }

    public ListBackupRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBackupRecordRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
