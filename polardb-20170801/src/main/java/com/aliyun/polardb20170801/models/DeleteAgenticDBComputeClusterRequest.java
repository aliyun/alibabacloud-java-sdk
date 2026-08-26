// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBComputeClusterRequest extends TeaModel {
    /**
     * <p>The branch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>br-69f762b1a44f49c487d64b9e71</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The branch compute cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-g0lsayq8c5qe</p>
     */
    @NameInMap("ComputeClusterId")
    public String computeClusterId;

    /**
     * <p>The AgenticDB cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The project ID to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>proj-7140b4c74b3a44978c825bac77</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-51121616fa9e43e98cc90e4afa</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteAgenticDBComputeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBComputeClusterRequest self = new DeleteAgenticDBComputeClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBComputeClusterRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public DeleteAgenticDBComputeClusterRequest setComputeClusterId(String computeClusterId) {
        this.computeClusterId = computeClusterId;
        return this;
    }
    public String getComputeClusterId() {
        return this.computeClusterId;
    }

    public DeleteAgenticDBComputeClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAgenticDBComputeClusterRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteAgenticDBComputeClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAgenticDBComputeClusterRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
