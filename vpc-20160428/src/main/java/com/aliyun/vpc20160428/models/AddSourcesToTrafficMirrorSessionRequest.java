// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddSourcesToTrafficMirrorSessionRequest extends TeaModel {
    /**
     * <p>The ID of the traffic mirror session.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the traffic mirror source. You can specify only an elastic network interface (ENI) as the traffic mirror source. The default value of **N** is **1**, which indicates that you can add only one traffic mirror source to a traffic mirror session.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the region to which the traffic mirror session belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     * <br>
     * <p>For more information about regions that support traffic mirroring, see [Overview of traffic mirroring](~~207513~~).</p>
     */
    @NameInMap("TrafficMirrorSessionId")
    public String trafficMirrorSessionId;

    @NameInMap("TrafficMirrorSourceIds")
    public java.util.List<String> trafficMirrorSourceIds;

    public static AddSourcesToTrafficMirrorSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSourcesToTrafficMirrorSessionRequest self = new AddSourcesToTrafficMirrorSessionRequest();
        return TeaModel.build(map, self);
    }

    public AddSourcesToTrafficMirrorSessionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddSourcesToTrafficMirrorSessionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddSourcesToTrafficMirrorSessionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddSourcesToTrafficMirrorSessionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddSourcesToTrafficMirrorSessionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddSourcesToTrafficMirrorSessionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddSourcesToTrafficMirrorSessionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddSourcesToTrafficMirrorSessionRequest setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
        return this;
    }
    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    public AddSourcesToTrafficMirrorSessionRequest setTrafficMirrorSourceIds(java.util.List<String> trafficMirrorSourceIds) {
        this.trafficMirrorSourceIds = trafficMirrorSourceIds;
        return this;
    }
    public java.util.List<String> getTrafficMirrorSourceIds() {
        return this.trafficMirrorSourceIds;
    }

}
