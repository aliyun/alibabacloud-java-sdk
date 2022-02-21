// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("InternalPorts")
    public java.util.List<DescribeClusterResponseBodyInternalPorts> internalPorts;

    @NameInMap("MaintainTime")
    public String maintainTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResponseBody self = new DescribeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeClusterResponseBody setInternalPorts(java.util.List<DescribeClusterResponseBodyInternalPorts> internalPorts) {
        this.internalPorts = internalPorts;
        return this;
    }
    public java.util.List<DescribeClusterResponseBodyInternalPorts> getInternalPorts() {
        return this.internalPorts;
    }

    public DescribeClusterResponseBody setMaintainTime(String maintainTime) {
        this.maintainTime = maintainTime;
        return this;
    }
    public String getMaintainTime() {
        return this.maintainTime;
    }

    public DescribeClusterResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeClusterResponseBodyInternalPorts extends TeaModel {
        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Port")
        public java.util.List<String> port;

        public static DescribeClusterResponseBodyInternalPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyInternalPorts self = new DescribeClusterResponseBodyInternalPorts();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyInternalPorts setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeClusterResponseBodyInternalPorts setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeClusterResponseBodyInternalPorts setPort(java.util.List<String> port) {
            this.port = port;
            return this;
        }
        public java.util.List<String> getPort() {
            return this.port;
        }

    }

}
