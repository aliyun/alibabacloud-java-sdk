// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUisNodesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("UisNodeList")
    public DescribeUisNodesResponseBodyUisNodeList uisNodeList;

    public static DescribeUisNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUisNodesResponseBody self = new DescribeUisNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUisNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUisNodesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUisNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUisNodesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUisNodesResponseBody setUisNodeList(DescribeUisNodesResponseBodyUisNodeList uisNodeList) {
        this.uisNodeList = uisNodeList;
        return this;
    }
    public DescribeUisNodesResponseBodyUisNodeList getUisNodeList() {
        return this.uisNodeList;
    }

    public static class DescribeUisNodesResponseBodyUisNodeListUisNode extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UisId")
        public String uisId;

        @NameInMap("UisNodeActiveIp")
        public String uisNodeActiveIp;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UisEniIps")
        public String uisEniIps;

        @NameInMap("UisNodeAreaId")
        public String uisNodeAreaId;

        @NameInMap("UisNodeId")
        public String uisNodeId;

        @NameInMap("UisNodeIps")
        public String uisNodeIps;

        @NameInMap("Description")
        public String description;

        @NameInMap("UisNodeBandwidth")
        public Integer uisNodeBandwidth;

        @NameInMap("IpAddrsNum")
        public Integer ipAddrsNum;

        @NameInMap("Name")
        public String name;

        public static DescribeUisNodesResponseBodyUisNodeListUisNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisNodesResponseBodyUisNodeListUisNode self = new DescribeUisNodesResponseBodyUisNodeListUisNode();
            return TeaModel.build(map, self);
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setUisId(String uisId) {
            this.uisId = uisId;
            return this;
        }
        public String getUisId() {
            return this.uisId;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setUisNodeActiveIp(String uisNodeActiveIp) {
            this.uisNodeActiveIp = uisNodeActiveIp;
            return this;
        }
        public String getUisNodeActiveIp() {
            return this.uisNodeActiveIp;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setUisEniIps(String uisEniIps) {
            this.uisEniIps = uisEniIps;
            return this;
        }
        public String getUisEniIps() {
            return this.uisEniIps;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setUisNodeAreaId(String uisNodeAreaId) {
            this.uisNodeAreaId = uisNodeAreaId;
            return this;
        }
        public String getUisNodeAreaId() {
            return this.uisNodeAreaId;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setUisNodeId(String uisNodeId) {
            this.uisNodeId = uisNodeId;
            return this;
        }
        public String getUisNodeId() {
            return this.uisNodeId;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setUisNodeIps(String uisNodeIps) {
            this.uisNodeIps = uisNodeIps;
            return this;
        }
        public String getUisNodeIps() {
            return this.uisNodeIps;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setUisNodeBandwidth(Integer uisNodeBandwidth) {
            this.uisNodeBandwidth = uisNodeBandwidth;
            return this;
        }
        public Integer getUisNodeBandwidth() {
            return this.uisNodeBandwidth;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setIpAddrsNum(Integer ipAddrsNum) {
            this.ipAddrsNum = ipAddrsNum;
            return this;
        }
        public Integer getIpAddrsNum() {
            return this.ipAddrsNum;
        }

        public DescribeUisNodesResponseBodyUisNodeListUisNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeUisNodesResponseBodyUisNodeList extends TeaModel {
        @NameInMap("UisNode")
        public java.util.List<DescribeUisNodesResponseBodyUisNodeListUisNode> uisNode;

        public static DescribeUisNodesResponseBodyUisNodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUisNodesResponseBodyUisNodeList self = new DescribeUisNodesResponseBodyUisNodeList();
            return TeaModel.build(map, self);
        }

        public DescribeUisNodesResponseBodyUisNodeList setUisNode(java.util.List<DescribeUisNodesResponseBodyUisNodeListUisNode> uisNode) {
            this.uisNode = uisNode;
            return this;
        }
        public java.util.List<DescribeUisNodesResponseBodyUisNodeListUisNode> getUisNode() {
            return this.uisNode;
        }

    }

}
