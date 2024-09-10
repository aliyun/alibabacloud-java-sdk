// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The unique identifier of the server on which the restoration task is run. For example, you can use the IP address or the name of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("MachineRemark")
    public String machineRemark;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the restoration task. Valid values:</p>
     * <ul>
     * <li><strong>RUNNING</strong>: The task is running.</li>
     * <li><strong>COMPLETE</strong>: The task is complete.</li>
     * <li><strong>FAILED</strong>: The task fails.</li>
     * <li><strong>CANCELING</strong>: The task is being canceled.</li>
     * <li><strong>CANCELED</strong>: The task is canceled.</li>
     * <li><strong>PARTIAL_COMPLETE</strong>: The task is partially successful.</li>
     * <li><strong>CREATED</strong>: The task is created but is not run.</li>
     * <li><strong>EXPIRED</strong>: The task is not updated.</li>
     * <li><strong>QUEUED</strong>: The task is waiting to be run.</li>
     * <li><strong>CLIENT_DELETED</strong>: The task fails because the anti-ransomware agent is uninstalled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
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
