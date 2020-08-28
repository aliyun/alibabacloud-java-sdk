// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetServiceMeshSlbResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<GetServiceMeshSlbResponseData> data;

    public static GetServiceMeshSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMeshSlbResponse self = new GetServiceMeshSlbResponse();
        return TeaModel.build(map, self);
    }

    public static class GetServiceMeshSlbResponseData extends TeaModel {
        @NameInMap("LoadBalancerId")
        @Validation(required = true)
        public String loadBalancerId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ServerHealthStatus")
        @Validation(required = true)
        public String serverHealthStatus;

        public static GetServiceMeshSlbResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMeshSlbResponseData self = new GetServiceMeshSlbResponseData();
            return TeaModel.build(map, self);
        }

    }

}
