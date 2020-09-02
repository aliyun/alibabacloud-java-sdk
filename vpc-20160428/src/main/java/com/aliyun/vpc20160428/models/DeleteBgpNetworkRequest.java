// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpNetworkRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DstCidrBlock")
    @Validation(required = true)
    public String dstCidrBlock;

    @NameInMap("RouterId")
    @Validation(required = true)
    public String routerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteBgpNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpNetworkRequest self = new DeleteBgpNetworkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBgpNetworkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteBgpNetworkRequest setDstCidrBlock(String dstCidrBlock) {
        this.dstCidrBlock = dstCidrBlock;
        return this;
    }
    public String getDstCidrBlock() {
        return this.dstCidrBlock;
    }

    public DeleteBgpNetworkRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DeleteBgpNetworkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
