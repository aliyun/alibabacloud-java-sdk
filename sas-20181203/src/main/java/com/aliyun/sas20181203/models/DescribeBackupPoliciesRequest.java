// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPoliciesRequest extends TeaModel {
    /**
     * <p>The page number from which to start displaying the returned results. Default value: 1, which indicates that the display starts from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The identification information of the server protected by the anti-ransomware policy to query. You can enter the IP address or instance ID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("MachineRemark")
    public String machineRemark;

    /**
     * <p>The name of the anti-ransomware protection policy to query.</p>
     * 
     * <strong>example:</strong>
     * <p>SecurityStrategy-20200303</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of backup policies on each page during paginated queries. Default value: 10, which indicates that each page contains 10 protection policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the anti-ransomware protection policy.</p>
     * <ul>
     * <li><p><strong>enabled</strong>: The policy is manually enabled.</p>
     * </li>
     * <li><p><strong>disabled</strong>: The policy is manually disabled. After the policy is disabled, running backup tasks will stop.</p>
     * </li>
     * <li><p><strong>closed</strong>: The anti-ransomware capacity is exceeded, and the system disables the policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeBackupPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPoliciesRequest self = new DescribeBackupPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPoliciesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeBackupPoliciesRequest setMachineRemark(String machineRemark) {
        this.machineRemark = machineRemark;
        return this;
    }
    public String getMachineRemark() {
        return this.machineRemark;
    }

    public DescribeBackupPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeBackupPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupPoliciesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
