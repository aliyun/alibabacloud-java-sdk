// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantSecurityIpGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the whitelist group.</p>
     */
    @NameInMap("SecurityIpGroup")
    public CreateTenantSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup;

    public static CreateTenantSecurityIpGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantSecurityIpGroupResponseBody self = new CreateTenantSecurityIpGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantSecurityIpGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantSecurityIpGroupResponseBody setSecurityIpGroup(CreateTenantSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup) {
        this.securityIpGroup = securityIpGroup;
        return this;
    }
    public CreateTenantSecurityIpGroupResponseBodySecurityIpGroup getSecurityIpGroup() {
        return this.securityIpGroup;
    }

    public static class CreateTenantSecurityIpGroupResponseBodySecurityIpGroup extends TeaModel {
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
         * <p>The list of IP addresses in the IP address whitelist group.   </p>
         * <br>
         * <p>It is a string separated by commas, and each object is an IP address or CIDR block.</p>
         */
        @NameInMap("SecurityIps")
        public String securityIps;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static CreateTenantSecurityIpGroupResponseBodySecurityIpGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateTenantSecurityIpGroupResponseBodySecurityIpGroup self = new CreateTenantSecurityIpGroupResponseBodySecurityIpGroup();
            return TeaModel.build(map, self);
        }

        public CreateTenantSecurityIpGroupResponseBodySecurityIpGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateTenantSecurityIpGroupResponseBodySecurityIpGroup setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        public CreateTenantSecurityIpGroupResponseBodySecurityIpGroup setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

        public CreateTenantSecurityIpGroupResponseBodySecurityIpGroup setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
