// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ServiceEndpoints")
    @Validation(required = true)
    public java.util.List<GetRegisteredServiceEndpointsResponseServiceEndpoints> serviceEndpoints;

    public static GetRegisteredServiceEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceEndpointsResponse self = new GetRegisteredServiceEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServiceEndpointsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegisteredServiceEndpointsResponse setServiceEndpoints(java.util.List<GetRegisteredServiceEndpointsResponseServiceEndpoints> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }
    public java.util.List<GetRegisteredServiceEndpointsResponseServiceEndpoints> getServiceEndpoints() {
        return this.serviceEndpoints;
    }

    public static class GetRegisteredServiceEndpointsResponseServiceEndpoints extends TeaModel {
        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        public static GetRegisteredServiceEndpointsResponseServiceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetRegisteredServiceEndpointsResponseServiceEndpoints self = new GetRegisteredServiceEndpointsResponseServiceEndpoints();
            return TeaModel.build(map, self);
        }

        public GetRegisteredServiceEndpointsResponseServiceEndpoints setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetRegisteredServiceEndpointsResponseServiceEndpoints setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
