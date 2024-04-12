// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RenewAssetOperationTokenRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TokenId")
    public String tokenId;

    public static RenewAssetOperationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAssetOperationTokenRequest self = new RenewAssetOperationTokenRequest();
        return TeaModel.build(map, self);
    }

    public RenewAssetOperationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewAssetOperationTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RenewAssetOperationTokenRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    public String getTokenId() {
        return this.tokenId;
    }

}
