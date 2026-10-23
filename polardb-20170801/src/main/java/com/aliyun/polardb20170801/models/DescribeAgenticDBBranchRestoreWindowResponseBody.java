// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchRestoreWindowResponseBody extends TeaModel {
    /**
     * <p>The ID of the source branch.</p>
     * 
     * <strong>example:</strong>
     * <p>br-1a2b3c4d5e6f</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>DBClusterId</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The earliest time available for creating a historical branch, in UTC RFC3339 format. This time point can be selected. The available range changes over time and is revalidated during creation.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-15T07:32:00Z</p>
     */
    @NameInMap("EarliestRestorableTime")
    public String earliestRestorableTime;

    /**
     * <p>ProjectId</p>
     * 
     * <strong>example:</strong>
     * <p>proj-a1b2c3d4e5f6</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The time when the query was completed, in UTC RFC3339 format. This does not represent the latest restorable time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16T07:32:00Z</p>
     */
    @NameInMap("QueriedAt")
    public String queriedAt;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-123</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>TenantId</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAgenticDBBranchRestoreWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchRestoreWindowResponseBody self = new DescribeAgenticDBBranchRestoreWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchRestoreWindowResponseBody setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public DescribeAgenticDBBranchRestoreWindowResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAgenticDBBranchRestoreWindowResponseBody setEarliestRestorableTime(String earliestRestorableTime) {
        this.earliestRestorableTime = earliestRestorableTime;
        return this;
    }
    public String getEarliestRestorableTime() {
        return this.earliestRestorableTime;
    }

    public DescribeAgenticDBBranchRestoreWindowResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAgenticDBBranchRestoreWindowResponseBody setQueriedAt(String queriedAt) {
        this.queriedAt = queriedAt;
        return this;
    }
    public String getQueriedAt() {
        return this.queriedAt;
    }

    public DescribeAgenticDBBranchRestoreWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBBranchRestoreWindowResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
