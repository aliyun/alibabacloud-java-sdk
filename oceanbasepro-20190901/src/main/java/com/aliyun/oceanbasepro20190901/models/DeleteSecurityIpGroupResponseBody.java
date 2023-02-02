// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteSecurityIpGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the deleted IP whitelist group.</p>
     */
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
        /**
         * <p>The ID of the OceanBase cluster.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the deleted IP address whitelist group.</p>
         */
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
