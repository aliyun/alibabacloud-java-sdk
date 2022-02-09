// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // IP白名单分组信息。
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
        // Oceanbase集群ID。
        @NameInMap("InstanceId")
        public String instanceId;

        // 安全组名称。
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        // IP安全白名单列表。其为一个Json格式的数组，数组中每个对象为一个IP字符串或者IP段。
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
