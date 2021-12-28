// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVMsInServiceMeshResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VMs")
    public java.util.List<DescribeVMsInServiceMeshResponseBodyVMs> VMs;

    public static DescribeVMsInServiceMeshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVMsInServiceMeshResponseBody self = new DescribeVMsInServiceMeshResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVMsInServiceMeshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVMsInServiceMeshResponseBody setVMs(java.util.List<DescribeVMsInServiceMeshResponseBodyVMs> VMs) {
        this.VMs = VMs;
        return this;
    }
    public java.util.List<DescribeVMsInServiceMeshResponseBodyVMs> getVMs() {
        return this.VMs;
    }

    public static class DescribeVMsInServiceMeshResponseBodyVMs extends TeaModel {
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

        @NameInMap("Status")
        public String status;

        public static DescribeVMsInServiceMeshResponseBodyVMs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVMsInServiceMeshResponseBodyVMs self = new DescribeVMsInServiceMeshResponseBodyVMs();
            return TeaModel.build(map, self);
        }

        public DescribeVMsInServiceMeshResponseBodyVMs setHasTag(Boolean hasTag) {
            this.hasTag = hasTag;
            return this;
        }
        public Boolean getHasTag() {
            return this.hasTag;
        }

        public DescribeVMsInServiceMeshResponseBodyVMs setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeVMsInServiceMeshResponseBodyVMs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVMsInServiceMeshResponseBodyVMs setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeVMsInServiceMeshResponseBodyVMs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVMsInServiceMeshResponseBodyVMs setSecurityGroupIds(String securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public String getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeVMsInServiceMeshResponseBodyVMs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
