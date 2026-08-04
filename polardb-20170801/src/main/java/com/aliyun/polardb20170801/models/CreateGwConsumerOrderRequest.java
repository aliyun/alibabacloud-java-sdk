// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGwConsumerOrderRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a42***********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The expiration time of the API key in ISO-8601 format. The value must be later than the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-07-23T03:09:08Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The ID of the AI gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-2ze24rr575j5b18cg</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The number of API keys to generate (the number of capacity plans to order). Valid values: 1 to 30.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("KeyCount")
    public Integer keyCount;

    /**
     * <p>The number of credits per API key. The value is a positive integer string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("PackageSpec")
    public String packageSpec;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region information.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateGwConsumerOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGwConsumerOrderRequest self = new CreateGwConsumerOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateGwConsumerOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGwConsumerOrderRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateGwConsumerOrderRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGwConsumerOrderRequest setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
        return this;
    }
    public Integer getKeyCount() {
        return this.keyCount;
    }

    public CreateGwConsumerOrderRequest setPackageSpec(String packageSpec) {
        this.packageSpec = packageSpec;
        return this;
    }
    public String getPackageSpec() {
        return this.packageSpec;
    }

    public CreateGwConsumerOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
