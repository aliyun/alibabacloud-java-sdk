// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshProxyStatusResponseBody extends TeaModel {
    /**
     * <p>The status code. Valid values:</p>
     * <br>
     * <p>`200`: The status code returned because the operation is successful.</p>
     * <br>
     * <p>*   `403`: The status code returned because you are not authorized to perform this operation.</p>
     * <p>*   `503`: The status code returned because a backend server error occurs.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The information about the status of the proxies on the data plane.</p>
     */
    @NameInMap("ProxyStatus")
    public java.util.List<DescribeServiceMeshProxyStatusResponseBodyProxyStatus> proxyStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>The update status of the proxy. Valid values:</p>
         * <br>
         * <p>*   `SYNCED`: The status of the proxy is updated.</p>
         * <p>*   `NOT SENT`: The status of the proxy is not updated.</p>
         * <p>*   `STALE (Never Acknowledged)`: Istiod has sent multiple requests to the Envoy proxy to update the status of the proxy but receives no response.</p>
         * <p>*   `STALE`: Istiod has sent a request to the Envoy proxy to update the status of the proxy but receives no response.</p>
         */
        @NameInMap("ClusterSynced")
        public String clusterSynced;

        /**
         * <p>The percentage of the updated endpoints.</p>
         */
        @NameInMap("EndpointPercent")
        public String endpointPercent;

        /**
         * <p>The update status of the endpoint. Valid values:</p>
         * <br>
         * <p>*   `SYNCED`: The status of the endpoint is updated.</p>
         * <p>*   `NOT SENT`: The status of the endpoint is not updated.</p>
         * <p>*   `STALE (Never Acknowledged)`: Istiod has sent multiple requests to the Envoy proxy to update the status of the endpoint but receives no response.</p>
         * <p>*   `STALE`: Istiod has sent a request to the Envoy proxy to update the status of the endpoint but receives no response.</p>
         */
        @NameInMap("EndpointSynced")
        public String endpointSynced;

        /**
         * <p>The version of Istiod.</p>
         */
        @NameInMap("IstioVersion")
        public String istioVersion;

        /**
         * <p>The update status of the listener. Valid values:</p>
         * <br>
         * <p>*   `SYNCED`: The status of the listener is updated.</p>
         * <p>*   `NOT SENT`: The status of the listener is not updated.</p>
         * <p>*   `STALE (Never Acknowledged)`: Istiod has sent multiple requests to the Envoy proxy to update the status of the listener but receives no response.</p>
         * <p>*   `STALE`: Istiod has sent a request to the Envoy proxy to update the status of the listener but receives no response.</p>
         */
        @NameInMap("ListenerSynced")
        public String listenerSynced;

        /**
         * <p>The ID of the proxy on the data plane.</p>
         */
        @NameInMap("ProxyId")
        public String proxyId;

        /**
         * <p>The version number of the proxy on the data plane.</p>
         */
        @NameInMap("ProxyVersion")
        public String proxyVersion;

        /**
         * <p>The update status of the route. Valid values:</p>
         * <br>
         * <p>*   `SYNCED`: The status of the route is updated.</p>
         * <p>*   `NOT SENT`: The status of the route is not updated.</p>
         * <p>*   `STALE (Never Acknowledged)`: Istiod has sent multiple requests to the Envoy proxy to update the status of the route but receives no response.</p>
         * <p>*   `STALE`: Istiod has sent a request to the Envoy proxy to update the status of the route but receives no response.</p>
         */
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
