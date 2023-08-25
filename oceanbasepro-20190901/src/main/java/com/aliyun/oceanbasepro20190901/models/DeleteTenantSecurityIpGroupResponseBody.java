// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantSecurityIpGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the whitelist group.</p>
     */
    @NameInMap("SecurityIpGroup")
    public DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup;

    public static DeleteTenantSecurityIpGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantSecurityIpGroupResponseBody self = new DeleteTenantSecurityIpGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTenantSecurityIpGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTenantSecurityIpGroupResponseBody setSecurityIpGroup(DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup securityIpGroup) {
        this.securityIpGroup = securityIpGroup;
        return this;
    }
    public DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup getSecurityIpGroup() {
        return this.securityIpGroup;
    }

    public static class DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup extends TeaModel {
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
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup self = new DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup();
            return TeaModel.build(map, self);
        }

        public DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup setSecurityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        public DeleteTenantSecurityIpGroupResponseBodySecurityIpGroup setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
