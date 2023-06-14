// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    /**
     * <p>The role of the node. Valid values:</p>
     * <br>
     * <p>*   **master**: master node</p>
     * <p>*   **slave**: replica node</p>
     */
    @NameInMap("Node")
    public DescribeRoleZoneInfoResponseBodyNode node;

    /**
     * <p>The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query instance IDs.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Indicates whether the bandwidth of the node is increased. Valid values:</p>
     * <br>
     * <p>*   **true**: The bandwidth of the node is not increased.</p>
     * <p>*   **false**: The bandwidth of the node is increased.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is used only for internal maintenance of ApsaraDB for Redis instances.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the node is a read replica. If the node is a read replica, **3** is returned.</p>
     * <br>
     * <p>>  If the node is not a read replica, no value is returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRoleZoneInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleZoneInfoResponseBody self = new DescribeRoleZoneInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoleZoneInfoResponseBody setNode(DescribeRoleZoneInfoResponseBodyNode node) {
        this.node = node;
        return this;
    }
    public DescribeRoleZoneInfoResponseBodyNode getNode() {
        return this.node;
    }

    public DescribeRoleZoneInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRoleZoneInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRoleZoneInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoleZoneInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRoleZoneInfoResponseBodyNodeNodeInfo extends TeaModel {
        /**
         * <p>The number of the returned page.</p>
         */
        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        /**
         * <p>The number of entries to return on each page. Valid values: **10**, **20**, and **50**. Default value: **10**.</p>
         */
        @NameInMap("CurrentMinorVersion")
        public String currentMinorVersion;

        @NameInMap("CustinsId")
        public String custinsId;

        /**
         * <p>The node type. Valid values:</p>
         * <br>
         * <p>*   **db**: data node.</p>
         * <p>*   **proxy**: proxy node.</p>
         * <p>*   **normal**: regular node. This value is returned when the instance runs in the standard architecture.</p>
         */
        @NameInMap("DefaultBandWidth")
        public Long defaultBandWidth;

        /**
         * <p>Indicates whether the minor version is the latest version. Valid values:</p>
         * <br>
         * <p>*   **0**: The minor version is not the latest version.</p>
         * <p>*   **1**: The minor version is the latest version.</p>
         * <br>
         * <p>>  To update the minor version, call the [ModifyInstanceMinorVersion](~~129381~~) operation.</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>Details about each node in an ApsaraDB for Redis instance.</p>
         */
        @NameInMap("InsType")
        public Integer insType;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("IsLatestVersion")
        public Integer isLatestVersion;

        /**
         * <p>DescribeRoleZoneInfo</p>
         */
        @NameInMap("IsOpenBandWidthService")
        public Boolean isOpenBandWidthService;

        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Role")
        public String role;

        /**
         * <p>Queries information about the type, minor version, and bandwidth of specific nodes in an ApsaraDB for Redis instance, and zones where the nodes are deployed.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRoleZoneInfoResponseBodyNodeNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoleZoneInfoResponseBodyNodeNodeInfo self = new DescribeRoleZoneInfoResponseBodyNodeNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setCurrentBandWidth(Long currentBandWidth) {
            this.currentBandWidth = currentBandWidth;
            return this;
        }
        public Long getCurrentBandWidth() {
            return this.currentBandWidth;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setCurrentMinorVersion(String currentMinorVersion) {
            this.currentMinorVersion = currentMinorVersion;
            return this;
        }
        public String getCurrentMinorVersion() {
            return this.currentMinorVersion;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setCustinsId(String custinsId) {
            this.custinsId = custinsId;
            return this;
        }
        public String getCustinsId() {
            return this.custinsId;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setDefaultBandWidth(Long defaultBandWidth) {
            this.defaultBandWidth = defaultBandWidth;
            return this;
        }
        public Long getDefaultBandWidth() {
            return this.defaultBandWidth;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setInsType(Integer insType) {
            this.insType = insType;
            return this;
        }
        public Integer getInsType() {
            return this.insType;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setIsLatestVersion(Integer isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }
        public Integer getIsLatestVersion() {
            return this.isLatestVersion;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setIsOpenBandWidthService(Boolean isOpenBandWidthService) {
            this.isOpenBandWidthService = isOpenBandWidthService;
            return this;
        }
        public Boolean getIsOpenBandWidthService() {
            return this.isOpenBandWidthService;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRoleZoneInfoResponseBodyNode extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<DescribeRoleZoneInfoResponseBodyNodeNodeInfo> nodeInfo;

        public static DescribeRoleZoneInfoResponseBodyNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoleZoneInfoResponseBodyNode self = new DescribeRoleZoneInfoResponseBodyNode();
            return TeaModel.build(map, self);
        }

        public DescribeRoleZoneInfoResponseBodyNode setNodeInfo(java.util.List<DescribeRoleZoneInfoResponseBodyNodeNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<DescribeRoleZoneInfoResponseBodyNodeNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}
