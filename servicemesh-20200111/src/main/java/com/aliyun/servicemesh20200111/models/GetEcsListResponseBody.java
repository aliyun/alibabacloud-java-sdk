// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetEcsListResponseBody extends TeaModel {
    @NameInMap("EcsInstances")
    public java.util.List<GetEcsListResponseBodyEcsInstances> ecsInstances;

    @NameInMap("RequestId")
    public String requestId;

    public static GetEcsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEcsListResponseBody self = new GetEcsListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEcsListResponseBody setEcsInstances(java.util.List<GetEcsListResponseBodyEcsInstances> ecsInstances) {
        this.ecsInstances = ecsInstances;
        return this;
    }
    public java.util.List<GetEcsListResponseBodyEcsInstances> getEcsInstances() {
        return this.ecsInstances;
    }

    public GetEcsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEcsListResponseBodyEcsInstances extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Status")
        public String status;

        @NameInMap("HasTag")
        public Boolean hasTag;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static GetEcsListResponseBodyEcsInstances build(java.util.Map<String, ?> map) throws Exception {
            GetEcsListResponseBodyEcsInstances self = new GetEcsListResponseBodyEcsInstances();
            return TeaModel.build(map, self);
        }

        public GetEcsListResponseBodyEcsInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEcsListResponseBodyEcsInstances setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetEcsListResponseBodyEcsInstances setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetEcsListResponseBodyEcsInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEcsListResponseBodyEcsInstances setHasTag(Boolean hasTag) {
            this.hasTag = hasTag;
            return this;
        }
        public Boolean getHasTag() {
            return this.hasTag;
        }

        public GetEcsListResponseBodyEcsInstances setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

}
