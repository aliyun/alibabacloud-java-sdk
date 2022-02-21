// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<DescribeClustersResponseBodyClusters> clusters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersResponseBody self = new DescribeClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersResponseBody setClusters(java.util.List<DescribeClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClustersResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeClustersResponseBodyClustersInternalPorts extends TeaModel {
        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Port")
        public java.util.List<String> port;

        public static DescribeClustersResponseBodyClustersInternalPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClustersInternalPorts self = new DescribeClustersResponseBodyClustersInternalPorts();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClustersInternalPorts setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeClustersResponseBodyClustersInternalPorts setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeClustersResponseBodyClustersInternalPorts setPort(java.util.List<String> port) {
            this.port = port;
            return this;
        }
        public java.util.List<String> getPort() {
            return this.port;
        }

    }

    public static class DescribeClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Description")
        public String description;

        @NameInMap("InternalPorts")
        public java.util.List<DescribeClustersResponseBodyClustersInternalPorts> internalPorts;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static DescribeClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClusters self = new DescribeClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClustersResponseBodyClusters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeClustersResponseBodyClusters setInternalPorts(java.util.List<DescribeClustersResponseBodyClustersInternalPorts> internalPorts) {
            this.internalPorts = internalPorts;
            return this;
        }
        public java.util.List<DescribeClustersResponseBodyClustersInternalPorts> getInternalPorts() {
            return this.internalPorts;
        }

        public DescribeClustersResponseBodyClusters setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeClustersResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClustersResponseBodyClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
