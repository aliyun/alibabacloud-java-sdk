// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeParentInstanceResponseBody extends TeaModel {
    /**
     * <p>When performing a paginated query, set the current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeParentInstanceResponseBodyItems> items;

    /**
     * <p>When performing a paginated query, set the maximum number of data asset instances displayed per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID of the result.</p>
     * 
     * <strong>example:</strong>
     * <p>ACEF9334-BB50-525D-8CF3-6CF504E4D1B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of data items in the result.</p>
     * 
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
         * <p>Audit authorization status. The values are as follows:</p>
         * <ul>
         * <li><strong>1</strong>: Authorized</li>
         * <li><strong>0</strong>: Unauthorized</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <p>Authorization status of the data asset instance.</p>
         * <ul>
         * <li><strong>0</strong>: Unauthorized</li>
         * <li><strong>1</strong>: Authorized</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthStatus")
        public Integer authStatus;

        /**
         * <p>Instance authorization time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719882941000</p>
         */
        @NameInMap("AuthTime")
        public Long authTime;

        /**
         * <p>Instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ClusterStatus")
        public String clusterStatus;

        /**
         * <p>Connection node type, valid only for MongoDB assets.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("ConnectNode")
        public String connectNode;

        /**
         * <p>Number of databases under the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DbNum")
        public String dbNum;

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>MariaDB</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>Description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance description</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-*******t2vz</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Instance space size, valid only for OSS assets. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>409600</p>
         */
        @NameInMap("InstanceSize")
        public Long instanceSize;

        /**
         * <p>Region name. The values are as follows:</p>
         * <ul>
         * <li><strong>China (Hangzhou)</strong></li>
         * <li><strong>China (Shanghai)</strong></li>
         * <li><strong>China (Beijing)</strong></li>
         * <li><strong>China (Zhangjiakou)</strong></li>
         * <li><strong>China (Shenzhen)</strong></li>
         * <li><strong>China (Guangzhou)</strong></li>
         * <li><strong>China (Hong Kong)</strong></li>
         * <li><strong>Singapore</strong></li>
         * <li><strong>US (Silicon Valley)</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>Member account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        @NameInMap("MemberAccount")
        public Long memberAccount;

        /**
         * <p>Identifier for the authorized asset. For structured data, it is identified by <code>instanceID.databaseName</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-******xxx.**st</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The region in which the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Asset type name. The values are as follows:</p>
         * <ul>
         * <li><strong>MaxCompute</strong></li>
         * <li><strong>OSS</strong></li>
         * <li><strong>ADB-MYSQL</strong></li>
         * <li><strong>TableStore</strong></li>
         * <li><strong>RDS</strong></li>
         * <li><strong>SelfDB</strong></li>
         * <li><strong>PolarDB-X</strong></li>
         * <li><strong>PolarDB</strong></li>
         * <li><strong>ADB-PG</strong></li>
         * <li><strong>OceanBase</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>Redis</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>Supported connection nodes, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary,Secondary</p>
         */
        @NameInMap("SupportConnectNodes")
        public String supportConnectNodes;

        /**
         * <p>Tenant ID, valid only for OceanBase assets.</p>
         * 
         * <strong>example:</strong>
         * <p>HB***-zh_CN</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Tenant name, valid only for OceanBase assets.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>Number of unconnected databases under the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnConnectDbCount")
        public String unConnectDbCount;

        /**
         * <p>Reason for not supporting one-click authorization.</p>
         * 
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

        public DescribeParentInstanceResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
