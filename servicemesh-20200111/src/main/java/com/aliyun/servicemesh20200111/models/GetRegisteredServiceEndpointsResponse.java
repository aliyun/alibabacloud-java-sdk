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

    }

}
