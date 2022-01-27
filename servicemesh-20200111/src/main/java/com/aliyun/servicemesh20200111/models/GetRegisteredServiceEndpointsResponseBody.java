// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsResponseBody extends TeaModel {
    @NameInMap("EndPointSlice")
    public GetRegisteredServiceEndpointsResponseBodyEndPointSlice endPointSlice;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Address")
        public String address;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        @NameInMap("Region")
        public String region;

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
        @NameInMap("EndpointsDetails")
        public java.util.List<GetRegisteredServiceEndpointsResponseBodyEndPointSliceEndpointsDetails> endpointsDetails;

        @NameInMap("Location")
        public String location;

        @NameInMap("Namespace")
        public String namespace;

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
        @NameInMap("Address")
        public String address;

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
