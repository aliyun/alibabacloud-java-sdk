// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolAllocationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("IpamPoolAllocationDescription")
    public String ipamPoolAllocationDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-alloc-112za33e4****</p>
     */
    @NameInMap("IpamPoolAllocationId")
    public String ipamPoolAllocationId;

    /**
     * <strong>example:</strong>
     * <p>test name</p>
     */
    @NameInMap("IpamPoolAllocationName")
    public String ipamPoolAllocationName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
