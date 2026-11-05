// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUniBackupRecordRequest extends TeaModel {
    /**
     * <p>The region where the anti-ransomware backup service is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("BackupRegionId")
    public String backupRegionId;

    /**
     * <p>The Settings of the paging page number for the paged query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The identification information of the server protected by the anti-ransomware policy that you want to query. You can enter the IP address or instance ID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("MachineRemark")
    public String machineRemark;

    /**
     * <p>The maximum number of entries to return on each page for the paged query. This paging parameter defines the page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The backup status. Valid values:</p>
     * <ul>
     * <li><strong>completed</strong>: Successful.</li>
     * <li><strong>error</strong>: Failed.</li>
     * <li><strong>canceled</strong>: Canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("State")
    public String state;

    public static ListUniBackupRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUniBackupRecordRequest self = new ListUniBackupRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListUniBackupRecordRequest setBackupRegionId(String backupRegionId) {
        this.backupRegionId = backupRegionId;
        return this;
    }
    public String getBackupRegionId() {
        return this.backupRegionId;
    }

    public ListUniBackupRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUniBackupRecordRequest setMachineRemark(String machineRemark) {
        this.machineRemark = machineRemark;
        return this;
    }
    public String getMachineRemark() {
        return this.machineRemark;
    }

    public ListUniBackupRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUniBackupRecordRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
