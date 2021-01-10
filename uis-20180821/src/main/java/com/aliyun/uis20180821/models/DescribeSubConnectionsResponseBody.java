// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeSubConnectionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("UisSubConnections")
    public DescribeSubConnectionsResponseBodyUisSubConnections uisSubConnections;

    public static DescribeSubConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubConnectionsResponseBody self = new DescribeSubConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSubConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSubConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSubConnectionsResponseBody setUisSubConnections(DescribeSubConnectionsResponseBodyUisSubConnections uisSubConnections) {
        this.uisSubConnections = uisSubConnections;
        return this;
    }
    public DescribeSubConnectionsResponseBodyUisSubConnections getUisSubConnections() {
        return this.uisSubConnections;
    }

    public static class DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection extends TeaModel {
        @NameInMap("UisSubConnectionId")
        public String uisSubConnectionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Name")
        public String name;

        public static DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection self = new DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection();
            return TeaModel.build(map, self);
        }

        public DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection setUisSubConnectionId(String uisSubConnectionId) {
            this.uisSubConnectionId = uisSubConnectionId;
            return this;
        }
        public String getUisSubConnectionId() {
            return this.uisSubConnectionId;
        }

        public DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeSubConnectionsResponseBodyUisSubConnections extends TeaModel {
        @NameInMap("UisSubConnection")
        public java.util.List<DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection> uisSubConnection;

        public static DescribeSubConnectionsResponseBodyUisSubConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubConnectionsResponseBodyUisSubConnections self = new DescribeSubConnectionsResponseBodyUisSubConnections();
            return TeaModel.build(map, self);
        }

        public DescribeSubConnectionsResponseBodyUisSubConnections setUisSubConnection(java.util.List<DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection> uisSubConnection) {
            this.uisSubConnection = uisSubConnection;
            return this;
        }
        public java.util.List<DescribeSubConnectionsResponseBodyUisSubConnectionsUisSubConnection> getUisSubConnection() {
            return this.uisSubConnection;
        }

    }

}
