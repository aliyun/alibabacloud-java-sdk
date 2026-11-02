// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayCapacityReservationShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters. Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run without upgrading the Internet NAT gateway. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li>false (default): sends a Normal request. If the request passes the dry run, a 2xx HTTP status code is returned and the Internet NAT gateway is upgraded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The number of capacity units (CUs) for the NAT resource reservation.</p>
     */
    @NameInMap("NatGatewayCapacity")
    public String natGatewayCapacityShrink;

    /**
     * <p>The instance ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-112za33e4****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The region ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to cancel the resource reservation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: cancels the resource reservation.</li>
     * <li><strong>false</strong> (default): does not cancel the resource reservation. This parameter is optional when you create or modify a resource reservation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResetCapacityReservation")
    public String resetCapacityReservation;

    public static ModifyNatGatewayCapacityReservationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewayCapacityReservationShrinkRequest self = new ModifyNatGatewayCapacityReservationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewayCapacityReservationShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyNatGatewayCapacityReservationShrinkRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public ModifyNatGatewayCapacityReservationShrinkRequest setNatGatewayCapacityShrink(String natGatewayCapacityShrink) {
        this.natGatewayCapacityShrink = natGatewayCapacityShrink;
        return this;
    }
    public String getNatGatewayCapacityShrink() {
        return this.natGatewayCapacityShrink;
    }

    public ModifyNatGatewayCapacityReservationShrinkRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ModifyNatGatewayCapacityReservationShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNatGatewayCapacityReservationShrinkRequest setResetCapacityReservation(String resetCapacityReservation) {
        this.resetCapacityReservation = resetCapacityReservation;
        return this;
    }
    public String getResetCapacityReservation() {
        return this.resetCapacityReservation;
    }

}
