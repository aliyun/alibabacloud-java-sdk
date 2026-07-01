// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamPoolAllocationRequest extends TeaModel {
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("CidrMask")
    public Integer cidrMask;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IpamPoolAllocationDescription")
    public String ipamPoolAllocationDescription;

    @NameInMap("IpamPoolAllocationName")
    public String ipamPoolAllocationName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateIpamPoolAllocationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamPoolAllocationRequest self = new CreateIpamPoolAllocationRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpamPoolAllocationRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public CreateIpamPoolAllocationRequest setCidrMask(Integer cidrMask) {
        this.cidrMask = cidrMask;
        return this;
    }
    public Integer getCidrMask() {
        return this.cidrMask;
    }

    public CreateIpamPoolAllocationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpamPoolAllocationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIpamPoolAllocationRequest setIpamPoolAllocationDescription(String ipamPoolAllocationDescription) {
        this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
        return this;
    }
    public String getIpamPoolAllocationDescription() {
        return this.ipamPoolAllocationDescription;
    }

    public CreateIpamPoolAllocationRequest setIpamPoolAllocationName(String ipamPoolAllocationName) {
        this.ipamPoolAllocationName = ipamPoolAllocationName;
        return this;
    }
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
    }

    public CreateIpamPoolAllocationRequest setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public CreateIpamPoolAllocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
