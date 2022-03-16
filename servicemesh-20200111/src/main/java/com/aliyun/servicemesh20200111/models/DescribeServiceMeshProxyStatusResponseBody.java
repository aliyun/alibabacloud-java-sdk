// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshProxyStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProxyStatus")
    public java.util.List<DescribeServiceMeshProxyStatusResponseBodyProxyStatus> proxyStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeServiceMeshProxyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshProxyStatusResponseBody self = new DescribeServiceMeshProxyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshProxyStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeServiceMeshProxyStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServiceMeshProxyStatusResponseBody setProxyStatus(java.util.List<DescribeServiceMeshProxyStatusResponseBodyProxyStatus> proxyStatus) {
        this.proxyStatus = proxyStatus;
        return this;
    }
    public java.util.List<DescribeServiceMeshProxyStatusResponseBodyProxyStatus> getProxyStatus() {
        return this.proxyStatus;
    }

    public DescribeServiceMeshProxyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMeshProxyStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeServiceMeshProxyStatusResponseBodyProxyStatus extends TeaModel {
        @NameInMap("ClusterSynced")
        public String clusterSynced;

        @NameInMap("EndpointPercent")
        public String endpointPercent;

        @NameInMap("EndpointSynced")
        public String endpointSynced;

        @NameInMap("IstioVersion")
        public String istioVersion;

        @NameInMap("ListenerSynced")
        public String listenerSynced;

        @NameInMap("ProxyId")
        public String proxyId;

        @NameInMap("ProxyVersion")
        public String proxyVersion;

        @NameInMap("RouteSynced")
        public String routeSynced;

        public static DescribeServiceMeshProxyStatusResponseBodyProxyStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshProxyStatusResponseBodyProxyStatus self = new DescribeServiceMeshProxyStatusResponseBodyProxyStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshProxyStatusResponseBodyProxyStatus setClusterSynced(String clusterSynced) {
            this.clusterSynced = clusterSynced;
            return this;
        }
        public String getClusterSynced() {
            return this.clusterSynced;
        }

        public DescribeServiceMeshProxyStatusResponseBodyProxyStatus setEndpointPercent(String endpointPercent) {
            this.endpointPercent = endpointPercent;
            return this;
        }
        public String getEndpointPercent() {
            return this.endpointPercent;
        }

        public DescribeServiceMeshProxyStatusResponseBodyProxyStatus setEndpointSynced(String endpointSynced) {
            this.endpointSynced = endpointSynced;
            return this;
        }
        public String getEndpointSynced() {
            return this.endpointSynced;
        }

        public DescribeServiceMeshProxyStatusResponseBodyProxyStatus setIstioVersion(String istioVersion) {
            this.istioVersion = istioVersion;
            return this;
        }
        public String getIstioVersion() {
            return this.istioVersion;
        }

        public DescribeServiceMeshProxyStatusResponseBodyProxyStatus setListenerSynced(String listenerSynced) {
            this.listenerSynced = listenerSynced;
            return this;
        }
        public String getListenerSynced() {
            return this.listenerSynced;
        }

        public DescribeServiceMeshProxyStatusResponseBodyProxyStatus setProxyId(String proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public String getProxyId() {
            return this.proxyId;
        }

        public DescribeServiceMeshProxyStatusResponseBodyProxyStatus setProxyVersion(String proxyVersion) {
            this.proxyVersion = proxyVersion;
            return this;
        }
        public String getProxyVersion() {
            return this.proxyVersion;
        }

        public DescribeServiceMeshProxyStatusResponseBodyProxyStatus setRouteSynced(String routeSynced) {
            this.routeSynced = routeSynced;
            return this;
        }
        public String getRouteSynced() {
            return this.routeSynced;
        }

    }

}
