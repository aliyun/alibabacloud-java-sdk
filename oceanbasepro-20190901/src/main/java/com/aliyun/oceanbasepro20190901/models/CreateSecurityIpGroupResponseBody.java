// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSecurityIpGroupResponseBody extends TeaModel {
    /**
     * <p>The IP addresses or CIDR blocks in the IP address whitelist group.<br>The return values of SecurityIps are strings that are separated with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>CreateSecurityIpGroup</strong>.</p>
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
         * <pre><code>http(s)://[Endpoint]/?Action=CreateSecurityIpGroup
         * &amp;InstanceId=ob317v4uif****
         * &amp;SecurityIps=192.168.1.1,192.168.0.0.1/8
         * &amp;SecurityIpGroupName=pay_online
         * &amp;Common request parameters
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>You can call this operation to create an IP address whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>pay_online</p>
         */
        @NameInMap("SecurityIpGroupName")
        public String securityIpGroupName;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1,192.168.0.0.1/8</p>
         */
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
