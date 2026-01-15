// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpResponseBody extends TeaModel {
    /**
     * <p>The IPv4Prefix returned by the previous API is obsolete.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Ipv4Prefix")
    public String ipv4Prefix;

    /**
     * <p>The NAT IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.34</p>
     */
    @NameInMap("NatIp")
    public String natIp;

    /**
     * <p>The ID of the NAT IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcnatip-gw8y7q3cpk3fggs8****</p>
     */
    @NameInMap("NatIpId")
    public String natIpId;

    /**
     * <p>The NatIp parameter that is returned after you create a NatIp. If you use IPv4Prefix to create a NatIp, the information about all NatIp is returned. We recommend that you use this parameter to obtain the information about a NatIp when you create a NatIp.</p>
     */
    @NameInMap("NatIps")
    public java.util.List<CreateNatIpResponseBodyNatIps> natIps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9AD97A0-5338-43F8-8A80-5E274CCBA11B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNatIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatIpResponseBody self = new CreateNatIpResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatIpResponseBody setIpv4Prefix(String ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
        return this;
    }
    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    public CreateNatIpResponseBody setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public CreateNatIpResponseBody setNatIpId(String natIpId) {
        this.natIpId = natIpId;
        return this;
    }
    public String getNatIpId() {
        return this.natIpId;
    }

    public CreateNatIpResponseBody setNatIps(java.util.List<CreateNatIpResponseBodyNatIps> natIps) {
        this.natIps = natIps;
        return this;
    }
    public java.util.List<CreateNatIpResponseBodyNatIps> getNatIps() {
        return this.natIps;
    }

    public CreateNatIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateNatIpResponseBodyNatIps extends TeaModel {
        /**
         * <p>The Ipv4Prefix of the created NatIpList list is returned when Ipv4Preix is created.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.128/28</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Ipv4Prefix")
        public String ipv4Prefix;

        /**
         * <p>Returns the NatIp address of the created NatIpList list when Ipv4Preix is created.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.128</p>
         */
        @NameInMap("NatIp")
        public String natIp;

        /**
         * <p>Returns the NatIpId of the created NatIpList list when Ipv4Preix is created.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatip-xxxxxxxx</p>
         */
        @NameInMap("NatIpId")
        public String natIpId;

        public static CreateNatIpResponseBodyNatIps build(java.util.Map<String, ?> map) throws Exception {
            CreateNatIpResponseBodyNatIps self = new CreateNatIpResponseBodyNatIps();
            return TeaModel.build(map, self);
        }

        public CreateNatIpResponseBodyNatIps setIpv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

        public CreateNatIpResponseBodyNatIps setNatIp(String natIp) {
            this.natIp = natIp;
            return this;
        }
        public String getNatIp() {
            return this.natIp;
        }

        public CreateNatIpResponseBodyNatIps setNatIpId(String natIpId) {
            this.natIpId = natIpId;
            return this;
        }
        public String getNatIpId() {
            return this.natIpId;
        }

    }

}
