// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteSecurityIpGroupResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 删除的IP白名单分组信息。
    @NameInMap("SecurityIpGroup")
    public DeleteSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup;

    public static DeleteSecurityIpGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIpGroupResponseBody self = new DeleteSecurityIpGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIpGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecurityIpGroupResponseBody setSecurityIpGroup(DeleteSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup) {
        this.securityIpGroup = securityIpGroup;
        return this;
    }
    public DeleteSecurityIpGroupResponseBodySecurityIpGroup getSecurityIpGroup() {
        return this.securityIpGroup;
    }

    public static class DeleteSecurityIpGroupResponseBodySecurityIpGroup extends TeaModel {
        // Oceanbase集群ID。
        @NameInMap("InstanceId")
        public String instanceId;

        // 删除的IP安全白名单组的组名。
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        public static DeleteSecurityIpGroupResponseBodySecurityIpGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityIpGroupResponseBodySecurityIpGroup self = new DeleteSecurityIpGroupResponseBodySecurityIpGroup();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityIpGroupResponseBodySecurityIpGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteSecurityIpGroupResponseBodySecurityIpGroup setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

    }

}
