// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorFilterRuleAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new destination CIDR block of the inbound or outbound traffic.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The new destination port range of the inbound or outbound traffic.</p>
     * <br>
     * <p>>  If you set **Protocol** to **ICMP**, you cannot change the port range.</p>
     */
    @NameInMap("DestinationPortRange")
    public String destinationPortRange;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: only checks the API request. The configuration of the inbound or outbound rule is not modified. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the request. This is the default value. If the request passes the check, a 2xx HTTP status code is returned and the configuration of the inbound or outbound rule is modified.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new priority of the inbound or outbound rule. A smaller value indicates a higher priority.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The new protocol that is used by the traffic to be mirrored by the inbound or outbound rule. Valid values:</p>
     * <br>
     * <p>*   **ALL**: all protocols</p>
     * <p>*   **ICMP**: Internet Control Message Protocol (ICMP)</p>
     * <p>*   **TCP**: TCP</p>
     * <p>*   **UDP**: User Datagram Protocol (UDP)</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the region to which the mirrored traffic belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list. For more information about regions that support traffic mirroring, see [Overview of traffic mirroring](https://help.aliyun.com/document_detail/207513.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new action of the inbound or outbound rule. Valid values:</p>
     * <br>
     * <p>*   **accept**: accepts network traffic.</p>
     * <p>*   **drop**: drops network traffic.</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The new source CIDR block of the inbound or outbound traffic.</p>
     */
    @NameInMap("SourceCidrBlock")
    public String sourceCidrBlock;

    /**
     * <p>The new source port range of the inbound or outbound traffic.</p>
     * <br>
     * <p>>  If you set **Protocol** to **ICMP**, you cannot change the port range.</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The ID of the inbound or outbound rule.</p>
     * <br>
     * <p>This parameter is required.</p>
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
