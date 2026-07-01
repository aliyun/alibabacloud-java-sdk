// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolAllocationRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IpamPoolAllocationDescription")
    public String ipamPoolAllocationDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpamPoolAllocationId")
    public String ipamPoolAllocationId;

    @NameInMap("IpamPoolAllocationName")
    public String ipamPoolAllocationName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateIpamPoolAllocationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamPoolAllocationRequest self = new UpdateIpamPoolAllocationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpamPoolAllocationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpamPoolAllocationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIpamPoolAllocationRequest setIpamPoolAllocationDescription(String ipamPoolAllocationDescription) {
        this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
        return this;
    }
    public String getIpamPoolAllocationDescription() {
        return this.ipamPoolAllocationDescription;
    }

    public UpdateIpamPoolAllocationRequest setIpamPoolAllocationId(String ipamPoolAllocationId) {
        this.ipamPoolAllocationId = ipamPoolAllocationId;
        return this;
    }
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    public UpdateIpamPoolAllocationRequest setIpamPoolAllocationName(String ipamPoolAllocationName) {
        this.ipamPoolAllocationName = ipamPoolAllocationName;
        return this;
    }
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
    }

    public UpdateIpamPoolAllocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
