// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSecurityIpGroupResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 白名单分组信息。
    @NameInMap("SecurityIpGroup")
    public CreateSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup;

    public static CreateSecurityIpGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIpGroupResponseBody self = new CreateSecurityIpGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIpGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecurityIpGroupResponseBody setSecurityIpGroup(CreateSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup) {
        this.securityIpGroup = securityIpGroup;
        return this;
    }
    public CreateSecurityIpGroupResponseBodySecurityIpGroup getSecurityIpGroup() {
        return this.securityIpGroup;
    }

    public static class CreateSecurityIpGroupResponseBodySecurityIpGroup extends TeaModel {
        // Oceanbase集群ID。
        @NameInMap("InstanceId")
        public String instanceId;

        // 白名单分组名称。
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        // IP白名单分组中的IP地址或地址段。其为一个Json格式的数组，数组中每个对象为一个IP字符串或者IP段。
        @NameInMap("SecurityIps")
        public String securityIps;

        public static CreateSecurityIpGroupResponseBodySecurityIpGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityIpGroupResponseBodySecurityIpGroup self = new CreateSecurityIpGroupResponseBodySecurityIpGroup();
            return TeaModel.build(map, self);
        }

        public CreateSecurityIpGroupResponseBodySecurityIpGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateSecurityIpGroupResponseBodySecurityIpGroup setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        public CreateSecurityIpGroupResponseBodySecurityIpGroup setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

    }

}
