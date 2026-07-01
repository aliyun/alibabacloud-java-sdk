// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolNextAvailableCidrRequest extends TeaModel {
    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("CidrMask")
    public Integer cidrMask;

    @NameInMap("ClientToken")
    public String clientToken;

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

    public static GetIpamPoolNextAvailableCidrRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpamPoolNextAvailableCidrRequest self = new GetIpamPoolNextAvailableCidrRequest();
        return TeaModel.build(map, self);
    }

    public GetIpamPoolNextAvailableCidrRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public GetIpamPoolNextAvailableCidrRequest setCidrMask(Integer cidrMask) {
        this.cidrMask = cidrMask;
        return this;
    }
    public Integer getCidrMask() {
        return this.cidrMask;
    }

    public GetIpamPoolNextAvailableCidrRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetIpamPoolNextAvailableCidrRequest setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
        return this;
    }
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    public GetIpamPoolNextAvailableCidrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
