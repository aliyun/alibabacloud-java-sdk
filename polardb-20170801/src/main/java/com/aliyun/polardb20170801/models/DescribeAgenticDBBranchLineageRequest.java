// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchLineageRequest extends TeaModel {
    /**
     * <p>The anchor branch ID. If this parameter is not specified, the primary branch of the project is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>br-7g8h9i0j1k2l</p>
     */
    @NameInMap("BranchId")
    public String branchId;

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
     * <p>Specifies whether to include branches in the Destroying state. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDestroying")
    public Boolean includeDestroying;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxViewDepth")
    public Integer maxViewDepth;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proj-a1b2c3d4e5f6</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAgenticDBBranchLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchLineageRequest self = new DescribeAgenticDBBranchLineageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchLineageRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public DescribeAgenticDBBranchLineageRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAgenticDBBranchLineageRequest setIncludeDestroying(Boolean includeDestroying) {
        this.includeDestroying = includeDestroying;
        return this;
    }
    public Boolean getIncludeDestroying() {
        return this.includeDestroying;
    }

    public DescribeAgenticDBBranchLineageRequest setMaxViewDepth(Integer maxViewDepth) {
        this.maxViewDepth = maxViewDepth;
        return this;
    }
    public Integer getMaxViewDepth() {
        return this.maxViewDepth;
    }

    public DescribeAgenticDBBranchLineageRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAgenticDBBranchLineageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAgenticDBBranchLineageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
