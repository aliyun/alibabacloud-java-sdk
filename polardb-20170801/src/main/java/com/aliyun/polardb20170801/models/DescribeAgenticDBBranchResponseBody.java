// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-g0lsayq8c5qe</p>
     */
    @NameInMap("BranchComputeClusterId")
    public String branchComputeClusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BranchComputeNodeCount")
    public Integer branchComputeNodeCount;

    /**
     * <strong>example:</strong>
     * <p>br-7g8h9i0j1k2l</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <strong>example:</strong>
     * <p>feature-analytics</p>
     */
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <strong>example:</strong>
     * <p>2026-06-10T11:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>Feature branch for analytics</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDefaultBranch")
    public Boolean isDefaultBranch;

    /**
     * <strong>example:</strong>
     * <p>2026-06-10T12:30:00Z</p>
     */
    @NameInMap("LastActivatedAt")
    public String lastActivatedAt;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxCU")
    public String maxCU;

    /**
     * <strong>example:</strong>
     * <p>0.25</p>
     */
    @NameInMap("MinCU")
    public String minCU;

    /**
     * <strong>example:</strong>
     * <p>br-1a2b3c4d5e6f</p>
     */
    @NameInMap("ParentBranchId")
    public String parentBranchId;

    /**
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("ParentBranchName")
    public String parentBranchName;

    /**
     * <strong>example:</strong>
     * <p>proj-a1b2c3d4e5f6</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>analytics-prod</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>C3D4E5F6-A7B8-9012-CDEF-345678901CDE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAgenticDBBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchResponseBody self = new DescribeAgenticDBBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchResponseBody setBranchComputeClusterId(String branchComputeClusterId) {
        this.branchComputeClusterId = branchComputeClusterId;
        return this;
    }
    public String getBranchComputeClusterId() {
        return this.branchComputeClusterId;
    }

    public DescribeAgenticDBBranchResponseBody setBranchComputeNodeCount(Integer branchComputeNodeCount) {
        this.branchComputeNodeCount = branchComputeNodeCount;
        return this;
    }
    public Integer getBranchComputeNodeCount() {
        return this.branchComputeNodeCount;
    }

    public DescribeAgenticDBBranchResponseBody setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public DescribeAgenticDBBranchResponseBody setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public DescribeAgenticDBBranchResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeAgenticDBBranchResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeAgenticDBBranchResponseBody setIsDefaultBranch(Boolean isDefaultBranch) {
        this.isDefaultBranch = isDefaultBranch;
        return this;
    }
    public Boolean getIsDefaultBranch() {
        return this.isDefaultBranch;
    }

    public DescribeAgenticDBBranchResponseBody setLastActivatedAt(String lastActivatedAt) {
        this.lastActivatedAt = lastActivatedAt;
        return this;
    }
    public String getLastActivatedAt() {
        return this.lastActivatedAt;
    }

    public DescribeAgenticDBBranchResponseBody setMaxCU(String maxCU) {
        this.maxCU = maxCU;
        return this;
    }
    public String getMaxCU() {
        return this.maxCU;
    }

    public DescribeAgenticDBBranchResponseBody setMinCU(String minCU) {
        this.minCU = minCU;
        return this;
    }
    public String getMinCU() {
        return this.minCU;
    }

    public DescribeAgenticDBBranchResponseBody setParentBranchId(String parentBranchId) {
        this.parentBranchId = parentBranchId;
        return this;
    }
    public String getParentBranchId() {
        return this.parentBranchId;
    }

    public DescribeAgenticDBBranchResponseBody setParentBranchName(String parentBranchName) {
        this.parentBranchName = parentBranchName;
        return this;
    }
    public String getParentBranchName() {
        return this.parentBranchName;
    }

    public DescribeAgenticDBBranchResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAgenticDBBranchResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeAgenticDBBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBBranchResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAgenticDBBranchResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
