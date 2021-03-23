// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Node")
    public DescribeRoleZoneInfoResponseBodyNode node;

    public static DescribeRoleZoneInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleZoneInfoResponseBody self = new DescribeRoleZoneInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoleZoneInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeRoleZoneInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRoleZoneInfoResponseBody setNode(DescribeRoleZoneInfoResponseBodyNode node) {
        this.node = node;
        return this;
    }
    public DescribeRoleZoneInfoResponseBodyNode getNode() {
        return this.node;
    }

    public static class DescribeRoleZoneInfoResponseBodyNodeNodeInfo extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Role")
        public String role;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("CustinsId")
        public String custinsId;

        @NameInMap("InsType")
        public Integer insType;

        @NameInMap("InsName")
        public String insName;

        @NameInMap("IsLatestVersion")
        public Integer isLatestVersion;

        @NameInMap("CurrentMinorVersion")
        public String currentMinorVersion;

        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        @NameInMap("DefaultBandWidth")
        public Long defaultBandWidth;

        @NameInMap("IsOpenBandWidthService")
        public Boolean isOpenBandWidthService;

        public static DescribeRoleZoneInfoResponseBodyNodeNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoleZoneInfoResponseBodyNodeNodeInfo self = new DescribeRoleZoneInfoResponseBodyNodeNodeInfo();
            return TeaModel.build(map, self);
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

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setCustinsId(String custinsId) {
            this.custinsId = custinsId;
            return this;
        }
        public String getCustinsId() {
            return this.custinsId;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setInsType(Integer insType) {
            this.insType = insType;
            return this;
        }
        public Integer getInsType() {
            return this.insType;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setIsLatestVersion(Integer isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }
        public Integer getIsLatestVersion() {
            return this.isLatestVersion;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setCurrentMinorVersion(String currentMinorVersion) {
            this.currentMinorVersion = currentMinorVersion;
            return this;
        }
        public String getCurrentMinorVersion() {
            return this.currentMinorVersion;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setCurrentBandWidth(Long currentBandWidth) {
            this.currentBandWidth = currentBandWidth;
            return this;
        }
        public Long getCurrentBandWidth() {
            return this.currentBandWidth;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setDefaultBandWidth(Long defaultBandWidth) {
            this.defaultBandWidth = defaultBandWidth;
            return this;
        }
        public Long getDefaultBandWidth() {
            return this.defaultBandWidth;
        }

        public DescribeRoleZoneInfoResponseBodyNodeNodeInfo setIsOpenBandWidthService(Boolean isOpenBandWidthService) {
            this.isOpenBandWidthService = isOpenBandWidthService;
            return this;
        }
        public Boolean getIsOpenBandWidthService() {
            return this.isOpenBandWidthService;
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
