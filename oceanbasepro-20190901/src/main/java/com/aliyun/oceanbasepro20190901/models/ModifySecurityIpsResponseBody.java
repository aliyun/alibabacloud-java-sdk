// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Example 1</p>
     */
    @NameInMap("SecurityIpGroup")
    public ModifySecurityIpsResponseBodySecurityIpGroup securityIpGroup;

    public static ModifySecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsResponseBody self = new ModifySecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecurityIpsResponseBody setSecurityIpGroup(ModifySecurityIpsResponseBodySecurityIpGroup securityIpGroup) {
        this.securityIpGroup = securityIpGroup;
        return this;
    }
    public ModifySecurityIpsResponseBodySecurityIpGroup getSecurityIpGroup() {
        return this.securityIpGroup;
    }

    public static class ModifySecurityIpsResponseBodySecurityIpGroup extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        @NameInMap("SecurityIps")
        public String securityIps;

        public static ModifySecurityIpsResponseBodySecurityIpGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityIpsResponseBodySecurityIpGroup self = new ModifySecurityIpsResponseBodySecurityIpGroup();
            return TeaModel.build(map, self);
        }

        public ModifySecurityIpsResponseBodySecurityIpGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifySecurityIpsResponseBodySecurityIpGroup setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        public ModifySecurityIpsResponseBodySecurityIpGroup setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

    }

}
