// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshProxyStatusResponseBody extends TeaModel {
    /**
     * <p>The status code. Valid values:</p>
     * <p><code>200</code>: The operation is successful.</p>
     * <ul>
     * <li><code>403</code>: You are not authorized to perform this operation.</li>
     * <li><code>503</code>: A backend server error occurs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The information about the status of the proxies on the data plane.</p>
     */
    @NameInMap("ProxyStatus")
    public java.util.List<DescribeServiceMeshProxyStatusResponseBodyProxyStatus> proxyStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
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
         * <ul>
         * <li><code>SYNCED</code>: The status of the proxy is updated.</li>
         * <li><code>NOT SENT</code>: The status of the proxy is not updated.</li>
         * <li><code>STALE (Never Acknowledged)</code>: Istiod has sent multiple requests to the Envoy proxy to update the status of the proxy but receives no response.</li>
         * <li><code>STALE</code>: Istiod has sent a request to the Envoy proxy to update the status of the proxy but receives no response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYNCED</p>
         */
        @NameInMap("ClusterSynced")
        public String clusterSynced;

        /**
         * <p>The percentage of the updated endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EndpointPercent")
        public String endpointPercent;

        /**
         * <p>The update status of the endpoint. Valid values:</p>
         * <ul>
         * <li><code>SYNCED</code>: The status of the endpoint is updated.</li>
         * <li><code>NOT SENT</code>: The status of the endpoint is not updated.</li>
         * <li><code>STALE (Never Acknowledged)</code>: Istiod has sent multiple requests to the Envoy proxy to update the status of the endpoint but receives no response.</li>
         * <li><code>STALE</code>: Istiod has sent a request to the Envoy proxy to update the status of the endpoint but receives no response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYNCED</p>
         */
        @NameInMap("EndpointSynced")
        public String endpointSynced;

        /**
         * <p>The version of Istiod.</p>
         * 
         * <strong>example:</strong>
         * <p>1.9.7</p>
         */
        @NameInMap("IstioVersion")
        public String istioVersion;

        /**
         * <p>The update status of the listener. Valid values:</p>
         * <ul>
         * <li><code>SYNCED</code>: The status of the listener is updated.</li>
         * <li><code>NOT SENT</code>: The status of the listener is not updated.</li>
         * <li><code>STALE (Never Acknowledged)</code>: Istiod has sent multiple requests to the Envoy proxy to update the status of the listener but receives no response.</li>
         * <li><code>STALE</code>: Istiod has sent a request to the Envoy proxy to update the status of the listener but receives no response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYNCED</p>
         */
        @NameInMap("ListenerSynced")
        public String listenerSynced;

        /**
         * <p>The ID of the proxy on the data plane.</p>
         * 
         * <strong>example:</strong>
         * <p>119q****</p>
         */
        @NameInMap("ProxyId")
        public String proxyId;

        /**
         * <p>The version number of a proxy on the data plane.</p>
         * 
         * <strong>example:</strong>
         * <p>1.9.7</p>
         */
        @NameInMap("ProxyVersion")
        public String proxyVersion;

        /**
         * <p>The update status of the route. Valid values:</p>
         * <ul>
         * <li><code>SYNCED</code>: The status of the route is updated.</li>
         * <li><code>NOT SENT</code>: The status of the route is not updated.</li>
         * <li><code>STALE (Never Acknowledged)</code>: Istiod has sent multiple requests to the Envoy proxy to update the status of the route but receives no response.</li>
         * <li><code>STALE</code>: Istiod has sent a request to the Envoy proxy to update the status of the route but receives no response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYNCED</p>
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
