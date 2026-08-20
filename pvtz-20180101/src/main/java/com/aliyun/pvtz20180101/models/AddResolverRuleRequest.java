// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverRuleRequest extends TeaModel {
    @NameInMap("EdgeDnsClusters")
    public java.util.List<AddResolverRuleRequestEdgeDnsClusters> edgeDnsClusters;

    /**
     * <p>The ID of the outbound endpoint. The outbound endpoint forwards DNS queries to the specified destination IP addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>hr****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The IP addresses and ports of the destination servers in the external DNS system to which DNS queries are forwarded. You can specify up to <strong>6</strong> destination servers. Both private and public IP addresses are supported.</p>
     * <blockquote>
     * <p>If you specify public IP addresses for the external DNS servers, and the Elastic Compute Service (ECS) instances in the VPC of the outbound endpoint do not have public IP addresses, enable a NAT Gateway and configure SNAT entries.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForwardIp")
    public java.util.List<AddResolverRuleRequestForwardIp> forwardIp;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the forwarding rule. Name the rule as needed.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the forwarding rule. The only valid value is OUTBOUND. This value indicates that DNS queries are forwarded to an external IP address.</p>
     * <blockquote>
     * <p>You cannot change this value after the forwarding rule is created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OUTBOUND</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("Vpcs")
    public java.util.List<AddResolverRuleRequestVpcs> vpcs;

    /**
     * <p>The domain name (zone) for which you want to forward DNS queries.</p>
     * <blockquote>
     * <p>You cannot change this value after the forwarding rule is created.</p>
     * </blockquote>
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

    public AddResolverRuleRequest setEdgeDnsClusters(java.util.List<AddResolverRuleRequestEdgeDnsClusters> edgeDnsClusters) {
        this.edgeDnsClusters = edgeDnsClusters;
        return this;
    }
    public java.util.List<AddResolverRuleRequestEdgeDnsClusters> getEdgeDnsClusters() {
        return this.edgeDnsClusters;
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

    public AddResolverRuleRequest setVpcs(java.util.List<AddResolverRuleRequestVpcs> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public java.util.List<AddResolverRuleRequestVpcs> getVpcs() {
        return this.vpcs;
    }

    public AddResolverRuleRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class AddResolverRuleRequestEdgeDnsClusters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        public static AddResolverRuleRequestEdgeDnsClusters build(java.util.Map<String, ?> map) throws Exception {
            AddResolverRuleRequestEdgeDnsClusters self = new AddResolverRuleRequestEdgeDnsClusters();
            return TeaModel.build(map, self);
        }

        public AddResolverRuleRequestEdgeDnsClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class AddResolverRuleRequestForwardIp extends TeaModel {
        /**
         * <p>The IP address of the destination server.</p>
         * <blockquote>
         * <p>The IP addresses in the following ranges are reserved by the system and cannot be used as the IP addresses of external DNS systems: 100.100.2.136 to 100.100.2.138 and 100.100.2.116 to 100.100.2.118.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number of the destination server.</p>
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

    public static class AddResolverRuleRequestVpcs extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcType")
        public String vpcType;

        @NameInMap("VpcUserId")
        public Long vpcUserId;

        public static AddResolverRuleRequestVpcs build(java.util.Map<String, ?> map) throws Exception {
            AddResolverRuleRequestVpcs self = new AddResolverRuleRequestVpcs();
            return TeaModel.build(map, self);
        }

        public AddResolverRuleRequestVpcs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public AddResolverRuleRequestVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public AddResolverRuleRequestVpcs setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

        public AddResolverRuleRequestVpcs setVpcUserId(Long vpcUserId) {
            this.vpcUserId = vpcUserId;
            return this;
        }
        public Long getVpcUserId() {
            return this.vpcUserId;
        }

    }

}
