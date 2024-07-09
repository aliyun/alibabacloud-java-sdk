// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverRuleRequest extends TeaModel {
    /**
     * <p>The endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The destination IP address and port number.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForwardIp")
    public java.util.List<AddResolverRuleRequestForwardIp> forwardIp;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the forwarding rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the forwarding rule. Valid value:</p>
     * <ul>
     * <li>OUTBOUND: forwards Domain Name System (DNS) requests to one or more external IP addresses.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OUTBOUND</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the forward zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static AddResolverRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddResolverRuleRequest self = new AddResolverRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddResolverRuleRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public AddResolverRuleRequest setForwardIp(java.util.List<AddResolverRuleRequestForwardIp> forwardIp) {
        this.forwardIp = forwardIp;
        return this;
    }
    public java.util.List<AddResolverRuleRequestForwardIp> getForwardIp() {
        return this.forwardIp;
    }

    public AddResolverRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddResolverRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddResolverRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddResolverRuleRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class AddResolverRuleRequestForwardIp extends TeaModel {
        /**
         * <p>The destination IP address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.xx.xx</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static AddResolverRuleRequestForwardIp build(java.util.Map<String, ?> map) throws Exception {
            AddResolverRuleRequestForwardIp self = new AddResolverRuleRequestForwardIp();
            return TeaModel.build(map, self);
        }

        public AddResolverRuleRequestForwardIp setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public AddResolverRuleRequestForwardIp setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
