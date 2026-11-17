// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client and make sure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The system prechecks the request but does not create the inbound or outbound rules. The system checks whether the required parameters are specified, the request format, and the limits. If the request fails the precheck, the system returns an error. If the request passes the precheck, the system returns the DryRunOperation error code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): The system sends a normal request. After the request passes the precheck, the system creates the inbound or outbound rules.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The details of the outbound rules.</p>
     */
    @NameInMap("EgressRules")
    public java.util.List<CreateTrafficMirrorFilterRulesRequestEgressRules> egressRules;

    /**
     * <p>The details of the inbound rules.</p>
     */
    @NameInMap("IngressRules")
    public java.util.List<CreateTrafficMirrorFilterRulesRequestIngressRules> ingressRules;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the traffic mirror filter.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs. For more information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The instance ID of the traffic mirror filter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tmf-j6cmls82xnc86vtpe****</p>
     */
    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    public static CreateTrafficMirrorFilterRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorFilterRulesRequest self = new CreateTrafficMirrorFilterRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorFilterRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTrafficMirrorFilterRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTrafficMirrorFilterRulesRequest setEgressRules(java.util.List<CreateTrafficMirrorFilterRulesRequestEgressRules> egressRules) {
        this.egressRules = egressRules;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRulesRequestEgressRules> getEgressRules() {
        return this.egressRules;
    }

    public CreateTrafficMirrorFilterRulesRequest setIngressRules(java.util.List<CreateTrafficMirrorFilterRulesRequestIngressRules> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRulesRequestIngressRules> getIngressRules() {
        return this.ingressRules;
    }

    public CreateTrafficMirrorFilterRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTrafficMirrorFilterRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTrafficMirrorFilterRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTrafficMirrorFilterRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTrafficMirrorFilterRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTrafficMirrorFilterRulesRequest setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public static class CreateTrafficMirrorFilterRulesRequestEgressRules extends TeaModel {
        /**
         * <p>The collection policy of the outbound rule. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: Collects network traffic.</li>
         * <li><strong>drop</strong>: Does not collect network traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The destination CIDR block of the network traffic for the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The destination port range of the network traffic for the outbound rule. Valid values are from <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Examples: <strong>1/200</strong> and <strong>80/80</strong>. You cannot set this parameter only to <strong>-1/-1</strong>, which indicates that all ports are allowed.</p>
         * <blockquote>
         * <p>If <strong>EgressRules.N.Protocol</strong> is set to <strong>ALL</strong> or <strong>ICMP</strong>, you do not need to specify this parameter, which indicates that all ports are allowed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22/40</p>
         */
        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        /**
         * <p>The IP version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: IPv4.</li>
         * <li><strong>IPv6</strong>: IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The priority of the outbound rule. A smaller value indicates a higher priority. The maximum value of <strong>N</strong> is <strong>10</strong>, which indicates that you can configure up to 10 outbound rules for a traffic mirror filter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol type of the network traffic to be mirrored for the outbound rule. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: All protocols.</li>
         * <li><strong>ICMP</strong>: Internet Control Message Protocol (ICMP).</li>
         * <li><strong>TCP</strong>: Transmission Control Protocol (TCP).</li>
         * <li><strong>UDP</strong>: User Datagram Protocol (UDP).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the network traffic for the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        /**
         * <p>The source port range of the network traffic for the outbound rule. Valid values are from <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Examples: <strong>1/200</strong> and <strong>80/80</strong>. You cannot set this parameter only to <strong>-1/-1</strong>, which indicates that all ports are allowed.</p>
         * <blockquote>
         * <p>If <strong>EgressRules.N.Protocol</strong> is set to <strong>ALL</strong> or <strong>ICMP</strong>, you do not need to specify this parameter, which indicates that all ports are allowed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22/40</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static CreateTrafficMirrorFilterRulesRequestEgressRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRulesRequestEgressRules self = new CreateTrafficMirrorFilterRulesRequestEgressRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setDestinationPortRange(String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        public CreateTrafficMirrorFilterRulesRequestEgressRules setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

    public static class CreateTrafficMirrorFilterRulesRequestIngressRules extends TeaModel {
        /**
         * <p>The collection policy of the inbound rule. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: Collects network traffic.</li>
         * <li><strong>drop</strong>: Does not collect network traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The destination CIDR block of the network traffic for the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The destination port range of the network traffic for the inbound rule. Valid values are from <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Examples: <strong>1/200</strong> and <strong>80/80</strong>.</p>
         * <blockquote>
         * <p>If <strong>IngressRules.N.Protocol</strong> is set to <strong>ALL</strong> or <strong>ICMP</strong>, you do not need to specify this parameter, which indicates that all ports are allowed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80/120</p>
         */
        @NameInMap("DestinationPortRange")
        public String destinationPortRange;

        /**
         * <p>The IP version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: IPv4.</li>
         * <li><strong>IPv6</strong>: IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The priority of the inbound rule. A smaller value indicates a higher priority. The maximum value of <strong>N</strong> is <strong>10</strong>, which indicates that you can configure up to 10 inbound rules for a traffic mirror filter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol type of the network traffic to be mirrored for the inbound rule. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: All protocols.</li>
         * <li><strong>ICMP</strong>: Internet Control Message Protocol (ICMP).</li>
         * <li><strong>TCP</strong>: Transmission Control Protocol (TCP).</li>
         * <li><strong>UDP</strong>: User Datagram Protocol (UDP).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the network traffic for the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("SourceCidrBlock")
        public String sourceCidrBlock;

        /**
         * <p>The source port range of the network traffic for the inbound rule. Valid values are from <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Examples: <strong>1/200</strong> and <strong>80/80</strong>. You cannot set this parameter only to <strong>-1/-1</strong>, which indicates that all ports are allowed.</p>
         * <blockquote>
         * <p>If <strong>IngressRules.N.Protocol</strong> is set to <strong>ALL</strong> or <strong>ICMP</strong>, you do not need to specify this parameter, which indicates that all ports are allowed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80/120</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static CreateTrafficMirrorFilterRulesRequestIngressRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRulesRequestIngressRules self = new CreateTrafficMirrorFilterRulesRequestIngressRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setDestinationPortRange(String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setSourceCidrBlock(String sourceCidrBlock) {
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        public CreateTrafficMirrorFilterRulesRequestIngressRules setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
