// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsResponseBody extends TeaModel {
    /**
     * <p>The name of the registered service.</p>
     */
    @NameInMap("EndPointSlice")
    public GetRegisteredServiceEndpointsResponseBodyEndPointSlice endPointSlice;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IP address of the registered service.</p>
     */
    @NameInMap("ServiceEndpoints")
    public java.util.List<GetRegisteredServiceEndpointsResponseBodyServiceEndpoints> serviceEndpoints;

    public static GetRegisteredServiceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceEndpointsResponseBody self = new GetRegisteredServiceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServiceEndpointsResponseBody setEndPointSlice(GetRegisteredServiceEndpointsResponseBodyEndPointSlice endPointSlice) {
        this.endPointSlice = endPointSlice;
        return this;
    }
    public GetRegisteredServiceEndpointsResponseBodyEndPointSlice getEndPointSlice() {
        return this.endPointSlice;
    }

    public GetRegisteredServiceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegisteredServiceEndpointsResponseBody setServiceEndpoints(java.util.List<GetRegisteredServiceEndpointsResponseBodyServiceEndpoints> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }
    public java.util.List<GetRegisteredServiceEndpointsResponseBodyServiceEndpoints> getServiceEndpoints() {
        return this.serviceEndpoints;
    }

    public static class GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails extends TeaModel {
        /**
         * <p>The port of the registered service.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the region in which the registered service resides.</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The IP address of the registered service.</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>The host name of the registered service.</p>
         */
        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        /**
         * <p>Indicates whether sidecar proxies are injected. Valid values:</p>
         * <br>
         * <p>*   `true`: yes</p>
         * <p>*   `false`: no</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("SidecarInjected")
        public Boolean sidecarInjected;

        public static GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails build(java.util.Map<String, ?> map) throws Exception {
            GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails self = new GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails();
            return TeaModel.build(map, self);
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails setPorts(java.util.List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails setSidecarInjected(Boolean sidecarInjected) {
            this.sidecarInjected = sidecarInjected;
            return this;
        }
        public Boolean getSidecarInjected() {
            return this.sidecarInjected;
        }

    }

    public static class GetRegisteredServiceEndpointsResponseBodyEndPointSlice extends TeaModel {
        /**
         * <p>The name of the pod.</p>
         */
        @NameInMap("EndpointsDetails")
        public java.util.List<GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails> endpointsDetails;

        /**
         * <p>The details of the endpoint of the registered service.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The location of the registered service. Valid values:</p>
         * <br>
         * <p>*   `MESH_INTERNAL`: The service is deployed inside the ASM instance.</p>
         * <p>*   `MESH_EXTERNAL`: The service is deployed outside the ASM instance.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static GetRegisteredServiceEndpointsResponseBodyEndPointSlice build(java.util.Map<String, ?> map) throws Exception {
            GetRegisteredServiceEndpointsResponseBodyEndPointSlice self = new GetRegisteredServiceEndpointsResponseBodyEndPointSlice();
            return TeaModel.build(map, self);
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSlice setEndpointsDetails(java.util.List<GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails> endpointsDetails) {
            this.endpointsDetails = endpointsDetails;
            return this;
        }
        public java.util.List<GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails> getEndpointsDetails() {
            return this.endpointsDetails;
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSlice setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSlice setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetRegisteredServiceEndpointsResponseBodyEndPointSlice setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetRegisteredServiceEndpointsResponseBodyServiceEndpoints extends TeaModel {
        /**
         * <p>The ID of the cluster on the data plane.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The details of the endpoints of the registered service.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        public static GetRegisteredServiceEndpointsResponseBodyServiceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetRegisteredServiceEndpointsResponseBodyServiceEndpoints self = new GetRegisteredServiceEndpointsResponseBodyServiceEndpoints();
            return TeaModel.build(map, self);
        }

        public GetRegisteredServiceEndpointsResponseBodyServiceEndpoints setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetRegisteredServiceEndpointsResponseBodyServiceEndpoints setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
