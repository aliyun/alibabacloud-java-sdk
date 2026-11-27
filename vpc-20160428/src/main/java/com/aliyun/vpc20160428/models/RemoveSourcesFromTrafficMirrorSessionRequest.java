// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromTrafficMirrorSessionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, and you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run and does not remove the traffic mirror sources. The system checks whether the required parameters are specified, the request format, and the limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request and removes the traffic mirror sources if the request passes the check.</p>
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
     * <p>The region ID of the traffic mirror session. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list. For more information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
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
     * <p>The instance ID of the traffic mirror session from which you want to delete the traffic mirror sources.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tms-j6cla50buc44ap8tu****</p>
     */
    @NameInMap("TrafficMirrorSessionId")
    public String trafficMirrorSessionId;

    /**
     * <p>The instance IDs of the traffic mirror sources that you want to delete. The maximum value of <strong>N</strong> is <strong>10</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c8znm5l1yt4sox****</p>
     */
    @NameInMap("TrafficMirrorSourceIds")
    public java.util.List<String> trafficMirrorSourceIds;

    public static RemoveSourcesFromTrafficMirrorSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSourcesFromTrafficMirrorSessionRequest self = new RemoveSourcesFromTrafficMirrorSessionRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
        return this;
    }
    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    public RemoveSourcesFromTrafficMirrorSessionRequest setTrafficMirrorSourceIds(java.util.List<String> trafficMirrorSourceIds) {
        this.trafficMirrorSourceIds = trafficMirrorSourceIds;
        return this;
    }
    public java.util.List<String> getTrafficMirrorSourceIds() {
        return this.trafficMirrorSourceIds;
    }

}
