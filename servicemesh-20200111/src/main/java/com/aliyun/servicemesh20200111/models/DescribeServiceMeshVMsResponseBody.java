// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshVMsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ECS instances that reside in the same VPC as the ASM instance.</p>
     */
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
        /**
         * <p>Indicates whether the ECS instance has labels.</p>
         */
        @NameInMap("HasTag")
        public Boolean hasTag;

        /**
         * <p>The hostname of the ECS instance.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address of the ECS instance.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The security group to which the ECS instance belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public String securityGroupIds;

        /**
         * <p>The ID of the ASM instance.</p>
         */
        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        /**
         * <p>The state of the ECS instance.</p>
         */
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
