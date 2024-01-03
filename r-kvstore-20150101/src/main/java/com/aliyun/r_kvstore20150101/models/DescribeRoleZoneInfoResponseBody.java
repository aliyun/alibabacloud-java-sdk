// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    /**
     * <p>Details about each node in an ApsaraDB for Redis instance.</p>
     */
    @NameInMap("Node")
    public DescribeRoleZoneInfoResponseBodyNode node;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The current bandwidth of the node, which consists of the default bandwidth and the increased bandwidth. Unit: MB/s.</p>
         * <br>
         * <p>> *   You can call the [EnableAdditionalBandwidth](~~206173~~) operation to specify the increased bandwidth.</p>
         * <p>> *   You can also use this parameter to calculate the increased bandwidth. For example, if the default bandwidth of the node is 96 MB/s and the returned value of this parameter is 100, the increased bandwidth is 4 MB/s.</p>
         */
        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        /**
         * <p>The minor version of the node.</p>
         */
        @NameInMap("CurrentMinorVersion")
        public String currentMinorVersion;

        /**
         * <p>The ID of the data shard.</p>
         */
        @NameInMap("CustinsId")
        public String custinsId;

        /**
         * <p>The default bandwidth of the node. Unit: MB/s.</p>
         */
        @NameInMap("DefaultBandWidth")
        public Long defaultBandWidth;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>Indicates whether the node is a read replica. If the node is a read replica, **3** is returned.</p>
         * <br>
         * <p>>  If the node is not a read replica, no value is returned.</p>
         */
        @NameInMap("InsType")
        public Integer insType;

        /**
         * <p>Indicates whether the minor version is the latest version. Valid values:</p>
         * <br>
         * <p>*   **0**: The minor version is not the latest version.</p>
         * <p>*   **1**: The minor version is the latest version.</p>
         * <br>
         * <p>>  To update the minor version, call the [ModifyInstanceMinorVersion](~~129381~~) operation.</p>
         */
        @NameInMap("IsLatestVersion")
        public Integer isLatestVersion;

        /**
         * <p>Indicates whether the bandwidth of the node is increased. Valid values:</p>
         * <br>
         * <p>*   **true**: The bandwidth of the node is not increased.</p>
         * <p>*   **false**: The bandwidth of the node is increased.</p>
         */
        @NameInMap("IsOpenBandWidthService")
        public Boolean isOpenBandWidthService;

        /**
         * <p>This parameter is used only for internal maintenance of ApsaraDB for Redis instances.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node type. Valid values:</p>
         * <br>
         * <p>*   **db**: data node.</p>
         * <p>*   **proxy**: proxy node.</p>
         * <p>*   **normal**: regular node. This value is returned when the instance runs in the standard architecture.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The role of the node. Valid values:</p>
         * <br>
         * <p>*   **master**: master node</p>
         * <p>*   **slave**: replica node</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The ID of the zone.</p>
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
