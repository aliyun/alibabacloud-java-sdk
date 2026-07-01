// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBBranchResponseBody extends TeaModel {
    /**
     * <p>The ID of the compute cluster associated with the branch.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-g0lsayq8c5qe</p>
     */
    @NameInMap("BranchComputeClusterId")
    public String branchComputeClusterId;

    /**
     * <p>The branch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>br-7g8h9i0j1k2l</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The name of the branch.</p>
     * 
     * <strong>example:</strong>
     * <p>feature-analytics</p>
     */
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>The AgenticDB cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the parent branch.</p>
     * 
     * <strong>example:</strong>
     * <p>br-1a2b3c4d5e6f</p>
     */
    @NameInMap("ParentBranchId")
    public String parentBranchId;

    /**
     * <p>The name of the parent branch.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("ParentBranchName")
    public String parentBranchName;

    /**
     * <p>The ID of the project to which the branch belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>proj-a1b2c3d4e5f6</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The name of the project to which the branch belongs.</p>
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
     * <p>A1B2C3D4-E5F6-7890-ABCD-1234567890AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the branch.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateAgenticDBBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBBranchResponseBody self = new CreateAgenticDBBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBBranchResponseBody setBranchComputeClusterId(String branchComputeClusterId) {
        this.branchComputeClusterId = branchComputeClusterId;
        return this;
    }
    public String getBranchComputeClusterId() {
        return this.branchComputeClusterId;
    }

    public CreateAgenticDBBranchResponseBody setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public CreateAgenticDBBranchResponseBody setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public CreateAgenticDBBranchResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAgenticDBBranchResponseBody setParentBranchId(String parentBranchId) {
        this.parentBranchId = parentBranchId;
        return this;
    }
    public String getParentBranchId() {
        return this.parentBranchId;
    }

    public CreateAgenticDBBranchResponseBody setParentBranchName(String parentBranchName) {
        this.parentBranchName = parentBranchName;
        return this;
    }
    public String getParentBranchName() {
        return this.parentBranchName;
    }

    public CreateAgenticDBBranchResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAgenticDBBranchResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateAgenticDBBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgenticDBBranchResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
