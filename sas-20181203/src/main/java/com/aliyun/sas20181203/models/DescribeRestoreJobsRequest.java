// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobsRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The unique identifier of the server on which the restoration task is run. For example, you can use the IP address or the name of the server.
    @NameInMap("MachineRemark")
    public String machineRemark;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The status of the restoration task. Valid values:
    // 
    // *   **RUNNING**: The task is running.
    // *   **COMPLETE**: The task is complete.
    // *   **FAILED**: The task fails.
    // *   **CANCELING**: The task is being canceled.
    // *   **CANCELED**: The task is canceled.
    // *   **PARTIAL_COMPLETE**: The task is partially successful.
    // *   **CREATED**: The task is created but is not run.
    // *   **EXPIRED**: The task is not updated.
    // *   **QUEUED**: The task is waiting to be run.
    // *   **CLIENT_DELETED**: The task fails because the anti-ransomware agent is uninstalled.
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
