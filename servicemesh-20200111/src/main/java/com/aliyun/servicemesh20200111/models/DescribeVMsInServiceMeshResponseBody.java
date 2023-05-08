// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVMsInServiceMeshResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The VMs that are added to the ASM instance.</p>
     */
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
        /**
         * <p>Indicates whether the VM has labels.</p>
         */
        @NameInMap("HasTag")
        public Boolean hasTag;

        /**
         * <p>The host name of the VM.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the VM.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address of the VM.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The security group to which the VM belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public String securityGroupIds;

        /**
         * <p>The status of the VM.</p>
         */
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
