// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantSecurityIpGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        @NameInMap("SecurityIps")
        public String securityIps;

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
