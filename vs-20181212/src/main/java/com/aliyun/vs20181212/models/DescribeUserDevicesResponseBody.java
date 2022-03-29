// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeUserDevicesResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<DescribeUserDevicesResponseBodyList> list;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDevicesResponseBody self = new DescribeUserDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserDevicesResponseBody setList(java.util.List<DescribeUserDevicesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeUserDevicesResponseBodyList> getList() {
        return this.list;
    }

    public DescribeUserDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserDevicesResponseBodyList extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("EdgeNodeName")
        public String edgeNodeName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("MatrixId")
        public String matrixId;

        @NameInMap("Server")
        public String server;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Status")
        public String status;

        public static DescribeUserDevicesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDevicesResponseBodyList self = new DescribeUserDevicesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeUserDevicesResponseBodyList setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeUserDevicesResponseBodyList setEdgeNodeName(String edgeNodeName) {
            this.edgeNodeName = edgeNodeName;
            return this;
        }
        public String getEdgeNodeName() {
            return this.edgeNodeName;
        }

        public DescribeUserDevicesResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUserDevicesResponseBodyList setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeUserDevicesResponseBodyList setMatrixId(String matrixId) {
            this.matrixId = matrixId;
            return this;
        }
        public String getMatrixId() {
            return this.matrixId;
        }

        public DescribeUserDevicesResponseBodyList setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeUserDevicesResponseBodyList setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeUserDevicesResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
