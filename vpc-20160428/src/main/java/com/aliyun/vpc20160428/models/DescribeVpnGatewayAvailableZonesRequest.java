// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayAvailableZonesRequest extends TeaModel {
    /**
     * <p>The language in which the returned results are displayed. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese</li>
     * <li><strong>en-US</strong> (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayType")
    public String gatewayType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The bandwidth specification.</p>
     * <ul>
     * <li>If an IPsec-VPN connection can be associated with the VPN gateway, this parameter specifies the bandwidth specification of the VPN gateway.</li>
     * <li>In scenarios where an IPsec-VPN connection can be associated with a transit router. This parameter specifies the bandwidth specification supported by an IPsec-VPN connection.</li>
     * </ul>
     * <p>Different bandwidth specifications may affect returned zone information. Valid values:</p>
     * <ul>
     * <li><strong>5M</strong></li>
     * <li><strong>10M</strong></li>
     * <li><strong>20M</strong></li>
     * <li><strong>50M</strong></li>
     * <li><strong>100M</strong></li>
     * <li><strong>200M</strong></li>
     * <li><strong>500M</strong></li>
     * <li><strong>1000M</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5M</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static DescribeVpnGatewayAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewayAvailableZonesRequest self = new DescribeVpnGatewayAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewayAvailableZonesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeVpnGatewayAvailableZonesRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public DescribeVpnGatewayAvailableZonesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVpnGatewayAvailableZonesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpnGatewayAvailableZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpnGatewayAvailableZonesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVpnGatewayAvailableZonesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVpnGatewayAvailableZonesRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
