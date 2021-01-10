// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCContainerServiceServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Services")
    public java.util.List<ListLDCContainerServiceServiceResponseBodyServices> services;

    public static ListLDCContainerServiceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCContainerServiceServiceResponseBody self = new ListLDCContainerServiceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCContainerServiceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCContainerServiceServiceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCContainerServiceServiceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCContainerServiceServiceResponseBody setServices(java.util.List<ListLDCContainerServiceServiceResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListLDCContainerServiceServiceResponseBodyServices> getServices() {
        return this.services;
    }

    public static class ListLDCContainerServiceServiceResponseBodyServicesMeta extends TeaModel {
        @NameInMap("CellDisplayName")
        public String cellDisplayName;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Uid")
        public String uid;

        public static ListLDCContainerServiceServiceResponseBodyServicesMeta build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerServiceServiceResponseBodyServicesMeta self = new ListLDCContainerServiceServiceResponseBodyServicesMeta();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerServiceServiceResponseBodyServicesMeta setCellDisplayName(String cellDisplayName) {
            this.cellDisplayName = cellDisplayName;
            return this;
        }
        public String getCellDisplayName() {
            return this.cellDisplayName;
        }

        public ListLDCContainerServiceServiceResponseBodyServicesMeta setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListLDCContainerServiceServiceResponseBodyServicesMeta setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListLDCContainerServiceServiceResponseBodyServicesMeta setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerServiceServiceResponseBodyServicesMeta setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListLDCContainerServiceServiceResponseBodyServicesMeta setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListLDCContainerServiceServiceResponseBodyServicesStatus extends TeaModel {
        @NameInMap("LoadBalancerIp")
        public String loadBalancerIp;

        public static ListLDCContainerServiceServiceResponseBodyServicesStatus build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerServiceServiceResponseBodyServicesStatus self = new ListLDCContainerServiceServiceResponseBodyServicesStatus();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerServiceServiceResponseBodyServicesStatus setLoadBalancerIp(String loadBalancerIp) {
            this.loadBalancerIp = loadBalancerIp;
            return this;
        }
        public String getLoadBalancerIp() {
            return this.loadBalancerIp;
        }

    }

    public static class ListLDCContainerServiceServiceResponseBodyServices extends TeaModel {
        @NameInMap("LoadBalancerAddressType")
        public String loadBalancerAddressType;

        @NameInMap("Type")
        public String type;

        @NameInMap("Meta")
        public ListLDCContainerServiceServiceResponseBodyServicesMeta meta;

        @NameInMap("Status")
        public ListLDCContainerServiceServiceResponseBodyServicesStatus status;

        public static ListLDCContainerServiceServiceResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerServiceServiceResponseBodyServices self = new ListLDCContainerServiceServiceResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerServiceServiceResponseBodyServices setLoadBalancerAddressType(String loadBalancerAddressType) {
            this.loadBalancerAddressType = loadBalancerAddressType;
            return this;
        }
        public String getLoadBalancerAddressType() {
            return this.loadBalancerAddressType;
        }

        public ListLDCContainerServiceServiceResponseBodyServices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLDCContainerServiceServiceResponseBodyServices setMeta(ListLDCContainerServiceServiceResponseBodyServicesMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListLDCContainerServiceServiceResponseBodyServicesMeta getMeta() {
            return this.meta;
        }

        public ListLDCContainerServiceServiceResponseBodyServices setStatus(ListLDCContainerServiceServiceResponseBodyServicesStatus status) {
            this.status = status;
            return this;
        }
        public ListLDCContainerServiceServiceResponseBodyServicesStatus getStatus() {
            return this.status;
        }

    }

}
