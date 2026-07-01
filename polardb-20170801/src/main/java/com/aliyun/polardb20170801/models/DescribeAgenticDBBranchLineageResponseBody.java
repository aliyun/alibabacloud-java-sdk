// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBBranchLineageResponseBody extends TeaModel {
    /**
     * <p>The anchor branch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>br-7g8h9i0j1k2l</p>
     */
    @NameInMap("AnchorBranchId")
    public String anchorBranchId;

    /**
     * <p>The list of lineage nodes.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAgenticDBBranchLineageResponseBodyItems> items;

    /**
     * <p>The total number of returned nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>The project ID.</p>
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
     * <p>B2C3D4E5-F6A7-8901-BCDE-2345678901BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The primary branch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>br-root</p>
     */
    @NameInMap("RootBranchId")
    public String rootBranchId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeAgenticDBBranchLineageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBBranchLineageResponseBody self = new DescribeAgenticDBBranchLineageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBBranchLineageResponseBody setAnchorBranchId(String anchorBranchId) {
        this.anchorBranchId = anchorBranchId;
        return this;
    }
    public String getAnchorBranchId() {
        return this.anchorBranchId;
    }

    public DescribeAgenticDBBranchLineageResponseBody setItems(java.util.List<DescribeAgenticDBBranchLineageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAgenticDBBranchLineageResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAgenticDBBranchLineageResponseBody setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public DescribeAgenticDBBranchLineageResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAgenticDBBranchLineageResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeAgenticDBBranchLineageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBBranchLineageResponseBody setRootBranchId(String rootBranchId) {
        this.rootBranchId = rootBranchId;
        return this;
    }
    public String getRootBranchId() {
        return this.rootBranchId;
    }

    public DescribeAgenticDBBranchLineageResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class DescribeAgenticDBBranchLineageResponseBodyItems extends TeaModel {
        /**
         * <p>The compute cluster ID of the branch.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-g0lsayq8c5qe</p>
         */
        @NameInMap("BranchComputeClusterId")
        public String branchComputeClusterId;

        /**
         * <p>The branch description.</p>
         * 
         * <strong>example:</strong>
         * <p>Feature branch for analytics</p>
         */
        @NameInMap("BranchDescription")
        public String branchDescription;

        /**
         * <p>The branch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>br-7g8h9i0j1k2l</p>
         */
        @NameInMap("BranchId")
        public String branchId;

        /**
         * <p>The branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>feature-analytics</p>
         */
        @NameInMap("BranchName")
        public String branchName;

        /**
         * <p>The time when the branch was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-10T11:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The depth relative to the anchor branch. The anchor branch has a depth of 0. Ancestor branches have negative values. Descendant branches have positive values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <p>The total number of direct child branches.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DirectChildCount")
        public Integer directChildCount;

        /**
         * <p>Indicates whether more ancestor nodes exist but are not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMoreAncestors")
        public Boolean hasMoreAncestors;

        /**
         * <p>Indicates whether more child nodes exist but are not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMoreChildren")
        public Boolean hasMoreChildren;

        /**
         * <p>Indicates whether the branch is the anchor branch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAnchor")
        public Boolean isAnchor;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefaultBranch")
        public Boolean isDefaultBranch;

        /**
         * <p>Indicates whether the branch is the primary branch.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRoot")
        public Boolean isRoot;

        /**
         * <p>The parent branch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>br-1a2b3c4d5e6f</p>
         */
        @NameInMap("ParentBranchId")
        public String parentBranchId;

        /**
         * <p>The parent branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("ParentBranchName")
        public String parentBranchName;

        /**
         * <p>The branch status. Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>Destroying</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAgenticDBBranchLineageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBBranchLineageResponseBodyItems self = new DescribeAgenticDBBranchLineageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setBranchComputeClusterId(String branchComputeClusterId) {
            this.branchComputeClusterId = branchComputeClusterId;
            return this;
        }
        public String getBranchComputeClusterId() {
            return this.branchComputeClusterId;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setBranchDescription(String branchDescription) {
            this.branchDescription = branchDescription;
            return this;
        }
        public String getBranchDescription() {
            return this.branchDescription;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }
        public String getBranchId() {
            return this.branchId;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setDirectChildCount(Integer directChildCount) {
            this.directChildCount = directChildCount;
            return this;
        }
        public Integer getDirectChildCount() {
            return this.directChildCount;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setHasMoreAncestors(Boolean hasMoreAncestors) {
            this.hasMoreAncestors = hasMoreAncestors;
            return this;
        }
        public Boolean getHasMoreAncestors() {
            return this.hasMoreAncestors;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setHasMoreChildren(Boolean hasMoreChildren) {
            this.hasMoreChildren = hasMoreChildren;
            return this;
        }
        public Boolean getHasMoreChildren() {
            return this.hasMoreChildren;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setIsAnchor(Boolean isAnchor) {
            this.isAnchor = isAnchor;
            return this;
        }
        public Boolean getIsAnchor() {
            return this.isAnchor;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setIsDefaultBranch(Boolean isDefaultBranch) {
            this.isDefaultBranch = isDefaultBranch;
            return this;
        }
        public Boolean getIsDefaultBranch() {
            return this.isDefaultBranch;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setIsRoot(Boolean isRoot) {
            this.isRoot = isRoot;
            return this;
        }
        public Boolean getIsRoot() {
            return this.isRoot;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setParentBranchId(String parentBranchId) {
            this.parentBranchId = parentBranchId;
            return this;
        }
        public String getParentBranchId() {
            return this.parentBranchId;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setParentBranchName(String parentBranchName) {
            this.parentBranchName = parentBranchName;
            return this;
        }
        public String getParentBranchName() {
            return this.parentBranchName;
        }

        public DescribeAgenticDBBranchLineageResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
