// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshGatewayPodStatusResponseBody extends TeaModel {
    @NameInMap("ASMGatewayDetails")
    public java.util.List<DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails> ASMGatewayDetails;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshGatewayPodStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshGatewayPodStatusResponseBody self = new DescribeServiceMeshGatewayPodStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshGatewayPodStatusResponseBody setASMGatewayDetails(java.util.List<DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails> ASMGatewayDetails) {
        this.ASMGatewayDetails = ASMGatewayDetails;
        return this;
    }
    public java.util.List<DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails> getASMGatewayDetails() {
        return this.ASMGatewayDetails;
    }

    public DescribeServiceMeshGatewayPodStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails extends TeaModel {
        @NameInMap("ClusterID")
        public String clusterID;

        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("ReadyPodNum")
        public Long readyPodNum;

        @NameInMap("SpecPodNum")
        public Long specPodNum;

        public static DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails self = new DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails setClusterID(String clusterID) {
            this.clusterID = clusterID;
            return this;
        }
        public String getClusterID() {
            return this.clusterID;
        }

        public DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails setReadyPodNum(Long readyPodNum) {
            this.readyPodNum = readyPodNum;
            return this;
        }
        public Long getReadyPodNum() {
            return this.readyPodNum;
        }

        public DescribeServiceMeshGatewayPodStatusResponseBodyASMGatewayDetails setSpecPodNum(Long specPodNum) {
            this.specPodNum = specPodNum;
            return this;
        }
        public Long getSpecPodNum() {
            return this.specPodNum;
        }

    }

}
