// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CalculateNatGatewayCapacityUnitsShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned. The Internet NAT gateway is not upgraded.</li>
     * <li>false (default): sends a normal request. If the request passes the check, a 2xx HTTP status code is returned and the Internet NAT gateway is upgraded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The details of the resource reservation CUs to be calculated.</p>
     */
    @NameInMap("NatGatewayCapacity")
    public String natGatewayCapacityShrink;

    /**
     * <p>The instance ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-2ze0dcn4mq31qx2jc****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The details of the resource reservation metrics to be calculated.</p>
     */
    @NameInMap("NatGatewayPerformanceValues")
    public String natGatewayPerformanceValuesShrink;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CalculateNatGatewayCapacityUnitsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CalculateNatGatewayCapacityUnitsShrinkRequest self = new CalculateNatGatewayCapacityUnitsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CalculateNatGatewayCapacityUnitsShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CalculateNatGatewayCapacityUnitsShrinkRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public CalculateNatGatewayCapacityUnitsShrinkRequest setNatGatewayCapacityShrink(String natGatewayCapacityShrink) {
        this.natGatewayCapacityShrink = natGatewayCapacityShrink;
        return this;
    }
    public String getNatGatewayCapacityShrink() {
        return this.natGatewayCapacityShrink;
    }

    public CalculateNatGatewayCapacityUnitsShrinkRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CalculateNatGatewayCapacityUnitsShrinkRequest setNatGatewayPerformanceValuesShrink(String natGatewayPerformanceValuesShrink) {
        this.natGatewayPerformanceValuesShrink = natGatewayPerformanceValuesShrink;
        return this;
    }
    public String getNatGatewayPerformanceValuesShrink() {
        return this.natGatewayPerformanceValuesShrink;
    }

    public CalculateNatGatewayCapacityUnitsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
