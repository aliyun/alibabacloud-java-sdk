// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolNextAvailableCidrRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>172.68.0.0/26</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("CidrMask")
    public Integer cidrMask;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
