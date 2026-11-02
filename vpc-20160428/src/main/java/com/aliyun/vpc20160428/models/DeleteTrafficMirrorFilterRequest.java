// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteTrafficMirrorFilterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value of this parameter on your client to ensure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
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
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request and does not delete the traffic mirror filter. The check items include whether required parameters are specified, the request format, and limits. If the request fails the check, the corresponding error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request and directly deletes the traffic mirror filter if the request passes the check.</li>
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
     * <p>The region ID of the traffic mirror. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs. For more information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
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

    public static DeleteTrafficMirrorFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMirrorFilterRequest self = new DeleteTrafficMirrorFilterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMirrorFilterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteTrafficMirrorFilterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteTrafficMirrorFilterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteTrafficMirrorFilterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteTrafficMirrorFilterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTrafficMirrorFilterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteTrafficMirrorFilterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteTrafficMirrorFilterRequest setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

}
