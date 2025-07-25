// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class GetIpamPoolNextAvailableCidrRequest extends TeaModel {
    /**
     * <p>CIDR to be allocated.</p>
     * <blockquote>
     * <p> You must enter at least one of the CidrBlock and CidrMask fields.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.68.0.0/26</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The length of the CIDR mask to be allocated.</p>
     * <blockquote>
     * <p> You must enter at least one of the CidrBlock and CidrMask fields.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("CidrMask")
    public Integer cidrMask;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the IPAM pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-6rcq3tobayc20t****</p>
     */
    @NameInMap("IpamPoolId")
    public String ipamPoolId;

    /**
     * <p>The region of the IPAM pool.</p>
     * <blockquote>
     * <p> If the IPAM pool has the region attribute, this parameter is set to the effective region of the IPAM pool. If not, this is set to the hosted region.</p>
     * </blockquote>
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
