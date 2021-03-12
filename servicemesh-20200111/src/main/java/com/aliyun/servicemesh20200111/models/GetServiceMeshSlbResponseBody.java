// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetServiceMeshSlbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetServiceMeshSlbResponseBodyData> data;

    public static GetServiceMeshSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMeshSlbResponseBody self = new GetServiceMeshSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceMeshSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceMeshSlbResponseBody setData(java.util.List<GetServiceMeshSlbResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetServiceMeshSlbResponseBodyData> getData() {
        return this.data;
    }

    public static class GetServiceMeshSlbResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ServerHealthStatus")
        public String serverHealthStatus;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static GetServiceMeshSlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMeshSlbResponseBodyData self = new GetServiceMeshSlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceMeshSlbResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceMeshSlbResponseBodyData setServerHealthStatus(String serverHealthStatus) {
            this.serverHealthStatus = serverHealthStatus;
            return this;
        }
        public String getServerHealthStatus() {
            return this.serverHealthStatus;
        }

        public GetServiceMeshSlbResponseBodyData setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

}
