// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The unique identifier of the server on which the restoration task is run. For example, you can use the IP address or the name of the server.</p>
     */
    @NameInMap("MachineRemark")
    public String machineRemark;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the restoration task. Valid values:</p>
     * <br>
     * <p>*   **RUNNING**: The task is running.</p>
     * <p>*   **COMPLETE**: The task is complete.</p>
     * <p>*   **FAILED**: The task fails.</p>
     * <p>*   **CANCELING**: The task is being canceled.</p>
     * <p>*   **CANCELED**: The task is canceled.</p>
     * <p>*   **PARTIAL_COMPLETE**: The task is partially successful.</p>
     * <p>*   **CREATED**: The task is created but is not run.</p>
     * <p>*   **EXPIRED**: The task is not updated.</p>
     * <p>*   **QUEUED**: The task is waiting to be run.</p>
     * <p>*   **CLIENT_DELETED**: The task fails because the anti-ransomware agent is uninstalled.</p>
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
