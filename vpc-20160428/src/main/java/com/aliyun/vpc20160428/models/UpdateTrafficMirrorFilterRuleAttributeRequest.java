// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorFilterRuleAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the system uses <strong>RequestId</strong> as <strong>ClientToken</strong>. <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new destination CIDR block of the inbound or outbound traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The new destination port range of the inbound or outbound traffic.</p>
     * <blockquote>
     * <p> If you set <strong>Protocol</strong> to <strong>ICMP</strong>, you cannot change the port range.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1/-1</p>
     */
    @NameInMap("DestinationPortRange")
    public String destinationPortRange;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: only checks the API request. The configuration of the inbound or outbound rule is not modified. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: sends the request. This is the default value. If the request passes the check, a 2xx HTTP status code is returned and the configuration of the inbound or outbound rule is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new priority of the inbound or outbound rule. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The new protocol that is used by the traffic to be mirrored by the inbound or outbound rule. Valid values:</p>
     * <ul>
     * <li><strong>ALL</strong>: all protocols</li>
     * <li><strong>ICMP</strong>: Internet Control Message Protocol (ICMP)</li>
     * <li><strong>TCP</strong>: TCP</li>
     * <li><strong>UDP</strong>: User Datagram Protocol (UDP)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ICMP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the region to which the mirrored traffic belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list. For more information about regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Overview of traffic mirroring</a>.</p>
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
     * <p>The new action of the inbound or outbound rule. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: accepts network traffic.</li>
     * <li><strong>drop</strong>: drops network traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The new source CIDR block of the inbound or outbound traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("SourceCidrBlock")
    public String sourceCidrBlock;

    /**
     * <p>The new source port range of the inbound or outbound traffic.</p>
     * <blockquote>
     * <p> If you set <strong>Protocol</strong> to <strong>ICMP</strong>, you cannot change the port range.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>22/40</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The ID of the inbound or outbound rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tmr-j6c89rzmtd3hhdugq****</p>
     */
    @NameInMap("TrafficMirrorFilterRuleId")
    public String trafficMirrorFilterRuleId;

    public static UpdateTrafficMirrorFilterRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorFilterRuleAttributeRequest self = new UpdateTrafficMirrorFilterRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }
    public String getDestinationPortRange() {
        return this.destinationPortRange;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
        return this;
    }
    public String getSourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public UpdateTrafficMirrorFilterRuleAttributeRequest setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
        return this;
    }
    public String getTrafficMirrorFilterRuleId() {
        return this.trafficMirrorFilterRuleId;
    }

}
