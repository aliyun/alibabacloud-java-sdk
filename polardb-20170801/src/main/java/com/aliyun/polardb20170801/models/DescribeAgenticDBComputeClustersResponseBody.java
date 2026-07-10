// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBComputeClustersResponseBody extends TeaModel {
    /**
     * <p>The list of compute instances.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAgenticDBComputeClustersResponseBodyItems> items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6A7B8C9-D0E1-2345-FABC-678901234FAB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAgenticDBComputeClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBComputeClustersResponseBody self = new DescribeAgenticDBComputeClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBComputeClustersResponseBody setItems(java.util.List<DescribeAgenticDBComputeClustersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAgenticDBComputeClustersResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAgenticDBComputeClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAgenticDBComputeClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAgenticDBComputeClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBComputeClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAgenticDBComputeClustersResponseBodyItems extends TeaModel {
        /**
         * <p>The ID of the associated branch.</p>
         * 
         * <strong>example:</strong>
         * <p>br-7g8h9i0j1k2l</p>
         */
        @NameInMap("BranchId")
        public String branchId;

        /**
         * <p>The name of the associated branch.</p>
         * 
         * <strong>example:</strong>
         * <p>feature-analytics</p>
         */
        @NameInMap("BranchName")
        public String branchName;

        /**
         * <p>The compute instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-g0lsayq8c5qe</p>
         */
        @NameInMap("ComputeClusterId")
        public String computeClusterId;

        /**
         * <p>The number of compute nodes. The value is fixed to 1 in the first phase.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComputeNodeCount")
        public Integer computeNodeCount;

        /**
         * <p>The time when the compute instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-10T11:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the compute instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Compute cluster for analytics</p>
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
         * <p>The time when the compute instance was last activated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-10T12:30:00Z</p>
         */
        @NameInMap("LastActivatedAt")
        public String lastActivatedAt;

        /**
         * <p>The maximum compute unit.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxCU")
        public String maxCU;

        /**
         * <p>The minimum compute unit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("MinCU")
        public String minCU;

        /**
         * <p>The operator type.</p>
         * 
         * <strong>example:</strong>
         * <p>Neon</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("ParentBranchId")
        public String parentBranchId;

        @NameInMap("ParentBranchName")
        public String parentBranchName;

        /**
         * <p>The ID of the associated project.</p>
         * 
         * <strong>example:</strong>
         * <p>proj-a1b2c3d4e5f6</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The name of the associated project.</p>
         * 
         * <strong>example:</strong>
         * <p>analytics-prod</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The status of the compute instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The amount of used data, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        @NameInMap("StorageSize")
        public Long storageSize;

        /**
         * <p>The ID of the associated tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>t-4b83e0da66674951</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The name of the associated tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>my-saas-app</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeAgenticDBComputeClustersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBComputeClustersResponseBodyItems self = new DescribeAgenticDBComputeClustersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }
        public String getBranchId() {
            return this.branchId;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setComputeClusterId(String computeClusterId) {
            this.computeClusterId = computeClusterId;
            return this;
        }
        public String getComputeClusterId() {
            return this.computeClusterId;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setComputeNodeCount(Integer computeNodeCount) {
            this.computeNodeCount = computeNodeCount;
            return this;
        }
        public Integer getComputeNodeCount() {
            return this.computeNodeCount;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setIsDefaultBranch(Boolean isDefaultBranch) {
            this.isDefaultBranch = isDefaultBranch;
            return this;
        }
        public Boolean getIsDefaultBranch() {
            return this.isDefaultBranch;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setLastActivatedAt(String lastActivatedAt) {
            this.lastActivatedAt = lastActivatedAt;
            return this;
        }
        public String getLastActivatedAt() {
            return this.lastActivatedAt;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setMaxCU(String maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public String getMaxCU() {
            return this.maxCU;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setMinCU(String minCU) {
            this.minCU = minCU;
            return this;
        }
        public String getMinCU() {
            return this.minCU;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setParentBranchId(String parentBranchId) {
            this.parentBranchId = parentBranchId;
            return this;
        }
        public String getParentBranchId() {
            return this.parentBranchId;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setParentBranchName(String parentBranchName) {
            this.parentBranchName = parentBranchName;
            return this;
        }
        public String getParentBranchName() {
            return this.parentBranchName;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeAgenticDBComputeClustersResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
