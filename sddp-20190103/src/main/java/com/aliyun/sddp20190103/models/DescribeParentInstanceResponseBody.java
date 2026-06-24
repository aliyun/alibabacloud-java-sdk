// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeParentInstanceResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of queried data assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeParentInstanceResponseBodyItems> items;

    /**
     * <p>The maximum number of data asset instances returned on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ACEF9334-BB50-525D-8CF3-6CF504E4D1B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The audit authorization status. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Authorized.</p>
         * </li>
         * <li><p><strong>0</strong>: Unauthorized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <p>The authorization status of the data asset instance.</p>
         * <ul>
         * <li><p><strong>0</strong>: Unauthorized.</p>
         * </li>
         * <li><p><strong>1</strong>: Authorized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthStatus")
        public Integer authStatus;

        /**
         * <p>The time when the instance was authorized. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719882941000</p>
         */
        @NameInMap("AuthTime")
        public Long authTime;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ClusterStatus")
        public String clusterStatus;

        /**
         * <p>The type of the connection node. This parameter is valid only for MongoDB assets.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("ConnectNode")
        public String connectNode;

        /**
         * <p>The number of databases in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DbNum")
        public String dbNum;

        /**
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong>.</p>
         * </li>
         * <li><p><strong>MariaDB</strong>.</p>
         * </li>
         * <li><p><strong>Oracle</strong>.</p>
         * </li>
         * <li><p><strong>PostgreSQL</strong>.</p>
         * </li>
         * <li><p><strong>SQLServer</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance description</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-*******t2vz</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The storage space of the instance. This parameter is valid only for OSS assets. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>409600</p>
         */
        @NameInMap("InstanceSize")
        public Long instanceSize;

        /**
         * <p>The name of the region. The following list describes the valid values:</p>
         * <ul>
         * <li><p><strong>China (Hangzhou)</strong></p>
         * </li>
         * <li><p><strong>China (Shanghai)</strong></p>
         * </li>
         * <li><p><strong>China (Beijing)</strong></p>
         * </li>
         * <li><p><strong>China (Zhangjiakou)</strong></p>
         * </li>
         * <li><p><strong>China (Shenzhen)</strong></p>
         * </li>
         * <li><p><strong>China (Guangzhou)</strong></p>
         * </li>
         * <li><p><strong>China (Hong Kong)</strong></p>
         * </li>
         * <li><p><strong>Singapore</strong></p>
         * </li>
         * <li><p><strong>US (Silicon Valley)</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        @NameInMap("MemberAccount")
        public Long memberAccount;

        /**
         * <p>The identifier of the authorized asset. If the asset is structured data, the identifier is in the format of \<code>Instance ID.Database name\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-******xxx.**st</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The region where the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the asset type. Valid values:</p>
         * <ul>
         * <li><p><strong>MaxCompute</strong></p>
         * </li>
         * <li><p><strong>OSS</strong></p>
         * </li>
         * <li><p><strong>ADB-MYSQL</strong></p>
         * </li>
         * <li><p><strong>TableStore</strong></p>
         * </li>
         * <li><p><strong>RDS</strong></p>
         * </li>
         * <li><p><strong>SelfDB</strong></p>
         * </li>
         * <li><p><strong>PolarDB-X</strong></p>
         * </li>
         * <li><p><strong>PolarDB</strong></p>
         * </li>
         * <li><p><strong>ADB-PG</strong></p>
         * </li>
         * <li><p><strong>OceanBase</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The supported connection nodes. Multiple nodes are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary,Secondary</p>
         */
        @NameInMap("SupportConnectNodes")
        public String supportConnectNodes;

        /**
         * <p>The tenant ID. This parameter is valid only for OceanBase assets.</p>
         * 
         * <strong>example:</strong>
         * <p>HB***-zh_CN</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The tenant name. This parameter is valid only for OceanBase assets.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The number of unconnected databases in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnConnectDbCount")
        public String unConnectDbCount;

        /**
         * <p>The reason why one-click authorization is not supported.</p>
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
