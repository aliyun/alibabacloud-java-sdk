// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeParentInstanceResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeParentInstanceResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("AuthStatus")
        public Integer authStatus;

        @NameInMap("ClusterStatus")
        public String clusterStatus;

        @NameInMap("ConnectNode")
        public String connectNode;

        @NameInMap("DbNum")
        public String dbNum;

        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceSize")
        public Long instanceSize;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SupportConnectNodes")
        public String supportConnectNodes;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("UnConnectDbCount")
        public String unConnectDbCount;

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
