// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPoliciesRequest extends TeaModel {
    // The number of the page to return. Default value: 1.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The information that you want to use to identify the servers protected by the anti-ransomware policy. You can enter the IP address or ID of a server.
    @NameInMap("MachineRemark")
    public String machineRemark;

    // The name of the anti-ransomware policy that you want to query.
    @NameInMap("Name")
    public String name;

    // The number of entries to return on each page. Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The status of the anti-ransomware policy. Valid values:
    // 
    // *   **enabled**: The anti-ransomware policy is manually enabled.
    // *   **disabled**: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.
    // *   **closed**: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.
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
