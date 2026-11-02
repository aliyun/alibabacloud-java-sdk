// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteTrafficMirrorFilterRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must ensure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: prechecks the request without deleting the inbound or outbound rules. The system checks whether the required parameters are specified, the request format, and the limits. If the request fails the precheck, an error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. If the request passes the precheck, the inbound or outbound rules are deleted.</p>
     * </li>
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
     * <p>The region ID of the traffic mirror. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list. For more information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
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
     * <p>The ID of the traffic mirror filter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tmf-j6cmls82xnc86vtpe****</p>
     */
    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    /**
     * <p>The IDs of the inbound or outbound rules.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tmr-j6cbmubn323k7jlq3****</p>
     */
    @NameInMap("TrafficMirrorFilterRuleIds")
    public java.util.List<String> trafficMirrorFilterRuleIds;

    public static DeleteTrafficMirrorFilterRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMirrorFilterRulesRequest self = new DeleteTrafficMirrorFilterRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMirrorFilterRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteTrafficMirrorFilterRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteTrafficMirrorFilterRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteTrafficMirrorFilterRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteTrafficMirrorFilterRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTrafficMirrorFilterRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteTrafficMirrorFilterRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteTrafficMirrorFilterRulesRequest setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public DeleteTrafficMirrorFilterRulesRequest setTrafficMirrorFilterRuleIds(java.util.List<String> trafficMirrorFilterRuleIds) {
        this.trafficMirrorFilterRuleIds = trafficMirrorFilterRuleIds;
        return this;
    }
    public java.util.List<String> getTrafficMirrorFilterRuleIds() {
        return this.trafficMirrorFilterRuleIds;
    }

}
