// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsResponseBody extends TeaModel {
    @NameInMap("ServiceEndpoints")
    public java.util.List<GetRegisteredServiceEndpointsResponseBodyServiceEndpoints> serviceEndpoints;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRegisteredServiceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceEndpointsResponseBody self = new GetRegisteredServiceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServiceEndpointsResponseBody setServiceEndpoints(java.util.List<GetRegisteredServiceEndpointsResponseBodyServiceEndpoints> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }
    public java.util.List<GetRegisteredServiceEndpointsResponseBodyServiceEndpoints> getServiceEndpoints() {
        return this.serviceEndpoints;
    }

    public GetRegisteredServiceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
