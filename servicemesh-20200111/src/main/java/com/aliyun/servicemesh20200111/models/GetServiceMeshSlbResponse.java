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

    public GetServiceMeshSlbResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceMeshSlbResponse setData(java.util.List<GetServiceMeshSlbResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetServiceMeshSlbResponseData> getData() {
        return this.data;
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

        public GetServiceMeshSlbResponseData setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public GetServiceMeshSlbResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceMeshSlbResponseData setServerHealthStatus(String serverHealthStatus) {
            this.serverHealthStatus = serverHealthStatus;
            return this;
        }
        public String getServerHealthStatus() {
            return this.serverHealthStatus;
        }

    }

}
