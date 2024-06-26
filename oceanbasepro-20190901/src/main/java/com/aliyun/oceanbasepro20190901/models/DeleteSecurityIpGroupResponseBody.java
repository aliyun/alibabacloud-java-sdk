// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteSecurityIpGroupResponseBody extends TeaModel {
    /**
     * <p>Example 1</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>paytest</p>
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
