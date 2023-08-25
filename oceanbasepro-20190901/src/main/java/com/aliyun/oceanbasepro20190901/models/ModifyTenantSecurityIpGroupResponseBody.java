// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantSecurityIpGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the IP address whitelist group.</p>
     */
    @NameInMap("SecurityIpGroup")
    public ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup;

    public static ModifyTenantSecurityIpGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantSecurityIpGroupResponseBody self = new ModifyTenantSecurityIpGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantSecurityIpGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTenantSecurityIpGroupResponseBody setSecurityIpGroup(ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup) {
        this.securityIpGroup = securityIpGroup;
        return this;
    }
    public ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup getSecurityIpGroup() {
        return this.securityIpGroup;
    }

    public static class ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup extends TeaModel {
        /**
         * <p>The ID of the OceanBase cluster.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the whitelist group.</p>
         */
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        /**
         * <p>The list of IP addresses in the IP address whitelist group.</p>
         * <br>
         * <p>It is a string separated by commas, and each object is an IP address or a CIDR block.</p>
         */
        @NameInMap("SecurityIps")
        public String securityIps;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup self = new ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup();
            return TeaModel.build(map, self);
        }

        public ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        public ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

        public ModifyTenantSecurityIpGroupResponseBodySecurityIpGroup setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
