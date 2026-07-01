// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBProjectResponseBody extends TeaModel {
    /**
     * <p>The ID of the compute instance associated with the default branch.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-g0lsayq8c5qe</p>
     */
    @NameInMap("BranchComputeClusterId")
    public String branchComputeClusterId;

    /**
     * <p>The time when the project was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-10T11:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The default branch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>br-1a2b3c4d5e6f</p>
     */
    @NameInMap("DefaultBranchId")
    public String defaultBranchId;

    /**
     * <p>The default branch name.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("DefaultBranchName")
    public String defaultBranchName;

    /**
     * <p>The ID of the new project.</p>
     * 
     * <strong>example:</strong>
     * <p>proj-a1b2c3d4e5f6</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>analytics-prod</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E5F6A7B8-C9D0-1234-EFAB-345678901234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static CreateAgenticDBProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBProjectResponseBody self = new CreateAgenticDBProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBProjectResponseBody setBranchComputeClusterId(String branchComputeClusterId) {
        this.branchComputeClusterId = branchComputeClusterId;
        return this;
    }
    public String getBranchComputeClusterId() {
        return this.branchComputeClusterId;
    }

    public CreateAgenticDBProjectResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateAgenticDBProjectResponseBody setDefaultBranchId(String defaultBranchId) {
        this.defaultBranchId = defaultBranchId;
        return this;
    }
    public String getDefaultBranchId() {
        return this.defaultBranchId;
    }

    public CreateAgenticDBProjectResponseBody setDefaultBranchName(String defaultBranchName) {
        this.defaultBranchName = defaultBranchName;
        return this;
    }
    public String getDefaultBranchName() {
        return this.defaultBranchName;
    }

    public CreateAgenticDBProjectResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAgenticDBProjectResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateAgenticDBProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgenticDBProjectResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
