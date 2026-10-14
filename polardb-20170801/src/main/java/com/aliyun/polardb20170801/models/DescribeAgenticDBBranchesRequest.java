// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchesRequest extends TeaModel {
    /**
     * <p>The branch name for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>feature</p>
     */
    @NameInMap("BranchName")
    public String branchName;

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
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 30. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the project to which the branch belongs.</p>
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
     * <p>The status filter. Valid values:</p>
     * <ul>
     * <li>Running</li>
     * <li>Pending</li>
     * <li>Paused</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the tenant to which the branch belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAgenticDBBranchesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchesRequest self = new DescribeAgenticDBBranchesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchesRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public DescribeAgenticDBBranchesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAgenticDBBranchesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAgenticDBBranchesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAgenticDBBranchesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAgenticDBBranchesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAgenticDBBranchesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAgenticDBBranchesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
