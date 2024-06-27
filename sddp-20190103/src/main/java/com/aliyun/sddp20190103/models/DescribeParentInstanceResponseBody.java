// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeParentInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeParentInstanceResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>ACEF9334-BB50-525D-8CF3-6CF504E4D1B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeParentInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentInstanceResponseBody self = new DescribeParentInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParentInstanceResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeParentInstanceResponseBody setItems(java.util.List<DescribeParentInstanceResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeParentInstanceResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeParentInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeParentInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParentInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeParentInstanceResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthStatus")
        public Integer authStatus;

        @NameInMap("AuthTime")
        public Long authTime;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ClusterStatus")
        public String clusterStatus;

        /**
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("ConnectNode")
        public String connectNode;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DbNum")
        public String dbNum;

        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <strong>example:</strong>
         * <p>instance description</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <strong>example:</strong>
         * <p>rm-2h066mht2vz</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>409600</p>
         */
        @NameInMap("InstanceSize")
        public Long instanceSize;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("MemberAccount")
        public Long memberAccount;

        /**
         * <strong>example:</strong>
         * <p>rm-uf6b9897shxxx.test</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Primary,Secondary</p>
         */
        @NameInMap("SupportConnectNodes")
        public String supportConnectNodes;

        /**
         * <strong>example:</strong>
         * <p>HBJWDSBE-zh_CN</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnConnectDbCount")
        public String unConnectDbCount;

        /**
         * <strong>example:</strong>
         * <p>engine type not support</p>
         */
        @NameInMap("UnSupportOneClickAuthReason")
        public String unSupportOneClickAuthReason;

        public static DescribeParentInstanceResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeParentInstanceResponseBodyItems self = new DescribeParentInstanceResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeParentInstanceResponseBodyItems setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeParentInstanceResponseBodyItems setAuthStatus(Integer authStatus) {
            this.authStatus = authStatus;
            return this;
        }
        public Integer getAuthStatus() {
            return this.authStatus;
        }

        public DescribeParentInstanceResponseBodyItems setAuthTime(Long authTime) {
            this.authTime = authTime;
            return this;
        }
        public Long getAuthTime() {
            return this.authTime;
        }

        public DescribeParentInstanceResponseBodyItems setClusterStatus(String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        public DescribeParentInstanceResponseBodyItems setConnectNode(String connectNode) {
            this.connectNode = connectNode;
            return this;
        }
        public String getConnectNode() {
            return this.connectNode;
        }

        public DescribeParentInstanceResponseBodyItems setDbNum(String dbNum) {
            this.dbNum = dbNum;
            return this;
        }
        public String getDbNum() {
            return this.dbNum;
        }

        public DescribeParentInstanceResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeParentInstanceResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeParentInstanceResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeParentInstanceResponseBodyItems setInstanceSize(Long instanceSize) {
            this.instanceSize = instanceSize;
            return this;
        }
        public Long getInstanceSize() {
            return this.instanceSize;
        }

        public DescribeParentInstanceResponseBodyItems setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeParentInstanceResponseBodyItems setMemberAccount(Long memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }
        public Long getMemberAccount() {
            return this.memberAccount;
        }

        public DescribeParentInstanceResponseBodyItems setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeParentInstanceResponseBodyItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeParentInstanceResponseBodyItems setSupportConnectNodes(String supportConnectNodes) {
            this.supportConnectNodes = supportConnectNodes;
            return this;
        }
        public String getSupportConnectNodes() {
            return this.supportConnectNodes;
        }

        public DescribeParentInstanceResponseBodyItems setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeParentInstanceResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeParentInstanceResponseBodyItems setUnConnectDbCount(String unConnectDbCount) {
            this.unConnectDbCount = unConnectDbCount;
            return this;
        }
        public String getUnConnectDbCount() {
            return this.unConnectDbCount;
        }

        public DescribeParentInstanceResponseBodyItems setUnSupportOneClickAuthReason(String unSupportOneClickAuthReason) {
            this.unSupportOneClickAuthReason = unSupportOneClickAuthReason;
            return this;
        }
        public String getUnSupportOneClickAuthReason() {
            return this.unSupportOneClickAuthReason;
        }

    }

}
