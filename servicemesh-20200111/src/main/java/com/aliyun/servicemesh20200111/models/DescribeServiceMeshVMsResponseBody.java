// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshVMsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VMs")
    public java.util.List<DescribeServiceMeshVMsResponseBodyVMs> VMs;

    public static DescribeServiceMeshVMsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshVMsResponseBody self = new DescribeServiceMeshVMsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshVMsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMeshVMsResponseBody setVMs(java.util.List<DescribeServiceMeshVMsResponseBodyVMs> VMs) {
        this.VMs = VMs;
        return this;
    }
    public java.util.List<DescribeServiceMeshVMsResponseBodyVMs> getVMs() {
        return this.VMs;
    }

    public static class DescribeServiceMeshVMsResponseBodyVMs extends TeaModel {
        @NameInMap("HasTag")
        public Boolean hasTag;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Region")
        public String region;

        @NameInMap("SecurityGroupIds")
        public String securityGroupIds;

        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        @NameInMap("Status")
        public String status;

        public static DescribeServiceMeshVMsResponseBodyVMs build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshVMsResponseBodyVMs self = new DescribeServiceMeshVMsResponseBodyVMs();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshVMsResponseBodyVMs setHasTag(Boolean hasTag) {
            this.hasTag = hasTag;
            return this;
        }
        public Boolean getHasTag() {
            return this.hasTag;
        }

        public DescribeServiceMeshVMsResponseBodyVMs setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeServiceMeshVMsResponseBodyVMs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeServiceMeshVMsResponseBodyVMs setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeServiceMeshVMsResponseBodyVMs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeServiceMeshVMsResponseBodyVMs setSecurityGroupIds(String securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public String getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeServiceMeshVMsResponseBodyVMs setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public DescribeServiceMeshVMsResponseBodyVMs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
