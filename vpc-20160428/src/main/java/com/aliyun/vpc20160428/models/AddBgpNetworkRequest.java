// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddBgpNetworkRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DstCidrBlock")
    @Validation(required = true)
    public String dstCidrBlock;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RouterId")
    @Validation(required = true)
    public String routerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddBgpNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBgpNetworkRequest self = new AddBgpNetworkRequest();
        return TeaModel.build(map, self);
    }

    public AddBgpNetworkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddBgpNetworkRequest setDstCidrBlock(String dstCidrBlock) {
        this.dstCidrBlock = dstCidrBlock;
        return this;
    }
    public String getDstCidrBlock() {
        return this.dstCidrBlock;
    }

    public AddBgpNetworkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public AddBgpNetworkRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public AddBgpNetworkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
