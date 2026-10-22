// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RenewAssetOperationTokenRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance. You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance. For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The O&amp;M token to be renewed.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the O&amp;M token to be renewed. You can call the <a href="https://help.aliyun.com/document_detail/2758861.html">GenerateAssetOperationToken</a> operation to obtain the token ID.</p>
     * 
     * <strong>example:</strong>
     * <p>NmYyMmEzNmMwYzljNGYxMjh******</p>
     */
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

    public RenewAssetOperationTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RenewAssetOperationTokenRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    public String getTokenId() {
        return this.tokenId;
    }

}
