// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-06-10T11:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

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
     * <p>I9J0K1L2-M3N4-5678-IJKL-789012345678</p>
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

    public static DescribeAgenticDBProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBProjectResponseBody self = new DescribeAgenticDBProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBProjectResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeAgenticDBProjectResponseBody setDefaultBranchId(String defaultBranchId) {
        this.defaultBranchId = defaultBranchId;
        return this;
    }
    public String getDefaultBranchId() {
        return this.defaultBranchId;
    }

    public DescribeAgenticDBProjectResponseBody setDefaultBranchName(String defaultBranchName) {
        this.defaultBranchName = defaultBranchName;
        return this;
    }
    public String getDefaultBranchName() {
        return this.defaultBranchName;
    }

    public DescribeAgenticDBProjectResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeAgenticDBProjectResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAgenticDBProjectResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeAgenticDBProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBProjectResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAgenticDBProjectResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
