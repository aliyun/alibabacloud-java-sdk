// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSecurityIpGroupResponseBody extends TeaModel {
    /**
     * <p>The IP addresses or CIDR blocks in the IP address whitelist group.   </p>
     * <p>The return values of SecurityIps are strings that are separated with commas (,).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operation that you want to perform.   </p>
     * <p>Set the value to **CreateSecurityIpGroup**.</p>
     */
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
        /**
         * <p>```</p>
         * <p>http(s)://[Endpoint]/?Action=CreateSecurityIpGroup</p>
         * <p>&InstanceId=ob317v4uif****</p>
         * <p>&SecurityIps=192.168.1.1,192.168.0.0.1/8</p>
         * <p>&SecurityIpGroupName=pay_online</p>
         * <p>&Common request parameters</p>
         * <p>```</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>You can call this operation to create an IP address whitelist group.</p>
         */
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

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
