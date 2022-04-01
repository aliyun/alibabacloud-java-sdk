// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckByAckInstanceIdsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<Data> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListClusterAckByAckInstanceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckByAckInstanceIdsResponseBody self = new ListClusterAckByAckInstanceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterAckByAckInstanceIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListClusterAckByAckInstanceIdsResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListClusterAckByAckInstanceIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterAckByAckInstanceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterAckByAckInstanceIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        @NameInMap("ackClusterType")
        public String ackClusterType;

        @NameInMap("ackId")
        public String ackId;

        @NameInMap("ackInstanceId")
        public String ackInstanceId;

        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("nodeLabel")
        public String nodeLabel;

        @NameInMap("ossPath")
        public String ossPath;

        @NameInMap("product")
        public String product;

        @NameInMap("status")
        public String status;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vswitchId")
        public String vswitchId;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setAckClusterType(String ackClusterType) {
            this.ackClusterType = ackClusterType;
            return this;
        }
        public String getAckClusterType() {
            return this.ackClusterType;
        }

        public Data setAckId(String ackId) {
            this.ackId = ackId;
            return this;
        }
        public String getAckId() {
            return this.ackId;
        }

        public Data setAckInstanceId(String ackInstanceId) {
            this.ackInstanceId = ackInstanceId;
            return this;
        }
        public String getAckInstanceId() {
            return this.ackInstanceId;
        }

        public Data setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Data setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public Data setNodeLabel(String nodeLabel) {
            this.nodeLabel = nodeLabel;
            return this;
        }
        public String getNodeLabel() {
            return this.nodeLabel;
        }

        public Data setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public Data setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public Data setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public Data setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public Data setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
