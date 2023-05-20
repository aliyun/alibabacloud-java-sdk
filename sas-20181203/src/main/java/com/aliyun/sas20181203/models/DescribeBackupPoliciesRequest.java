// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPoliciesRequest extends TeaModel {
    /**
     * <p>The name of the anti-ransomware policy that you want to query.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("MachineRemark")
    public String machineRemark;

    /**
     * <p>The type of the server. Valid values:</p>
     * <br>
     * <p>*   **OUT_CLOUD**: server not deployed on Alibaba Cloud</p>
     * <p>*   **ALIYUN**: Elastic Compute Service (ECS) instance</p>
     * <p>*   **TRIPARTITE**: simple application server</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The UUIDs that are returned based on the value of the MachineRemark request parameter.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of servers on which data backup is exceptional.</p>
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
