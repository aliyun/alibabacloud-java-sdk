// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobsRequest extends TeaModel {
    /**
     * <p>The timestamp when the in-progress restoration task is expected to be complete. Unit: seconds.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The return value of the restoration task.</p>
     */
    @NameInMap("MachineRemark")
    public String machineRemark;

    /**
     * <p>The timestamp when the restoration task was last updated. Unit: milliseconds.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the file that is restored. Valid values:</p>
     * <br>
     * <p>*   **ECS_FILE**: files on Elastic Compute Service (ECS) instances</p>
     * <p>*   **FILE**: files on servers in data centers</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeRestoreJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreJobsRequest self = new DescribeRestoreJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreJobsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRestoreJobsRequest setMachineRemark(String machineRemark) {
        this.machineRemark = machineRemark;
        return this;
    }
    public String getMachineRemark() {
        return this.machineRemark;
    }

    public DescribeRestoreJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
