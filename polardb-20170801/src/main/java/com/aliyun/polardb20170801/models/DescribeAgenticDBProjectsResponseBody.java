// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBProjectsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeAgenticDBProjectsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>F6A7B8C9-D0E1-2345-FABC-456789012345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAgenticDBProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBProjectsResponseBody self = new DescribeAgenticDBProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBProjectsResponseBody setItems(java.util.List<DescribeAgenticDBProjectsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAgenticDBProjectsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAgenticDBProjectsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAgenticDBProjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAgenticDBProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBProjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAgenticDBProjectsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-06-10T11:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>pagc-bp1abcdef1234567</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>br-1a2b3c4d5e6f</p>
         */
        @NameInMap("DefaultBranchId")
        public String defaultBranchId;

        /**
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("DefaultBranchName")
        public String defaultBranchName;

        /**
         * <strong>example:</strong>
         * <p>Production analytics database</p>
         */
        @NameInMap("Description")
        public String description;

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

        public static DescribeAgenticDBProjectsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBProjectsResponseBodyItems self = new DescribeAgenticDBProjectsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBProjectsResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAgenticDBProjectsResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAgenticDBProjectsResponseBodyItems setDefaultBranchId(String defaultBranchId) {
            this.defaultBranchId = defaultBranchId;
            return this;
        }
        public String getDefaultBranchId() {
            return this.defaultBranchId;
        }

        public DescribeAgenticDBProjectsResponseBodyItems setDefaultBranchName(String defaultBranchName) {
            this.defaultBranchName = defaultBranchName;
            return this;
        }
        public String getDefaultBranchName() {
            return this.defaultBranchName;
        }

        public DescribeAgenticDBProjectsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAgenticDBProjectsResponseBodyItems setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeAgenticDBProjectsResponseBodyItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeAgenticDBProjectsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAgenticDBProjectsResponseBodyItems setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
