// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DiagnoseVpnGatewayRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration when you check the connectivity of the IPsec-VPN connection. Valid values:</p>
     * <ul>
     * <li><strong>PrivateSourceIp</strong>: the source IP address used when you check the connectivity of the IPsec-VPN connection. The source IP address must be on the VPC side.</li>
     * <li><strong>PrivateDestinationIp</strong>: the destination IP address used when you check the connectivity of the IPsec-VPN connection. The destination IP address must be on the data center side.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PrivateSourceIp&quot;:&quot;192.168.1.1&quot;,&quot;PrivateDestinationIp&quot;:&quot;192.168.0.1&quot;}</p>
     */
    @NameInMap("IPsecExtendInfo")
    public String IPsecExtendInfo;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource to be diagnosed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-uf66xniofskqtuoz1****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <p>Set the value to <strong>Ipsec</strong>, which specifies an IPsec-VPN connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPsec</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the VPN gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-m5efhj0k1p47ctuhl****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static DiagnoseVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseVpnGatewayRequest self = new DiagnoseVpnGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DiagnoseVpnGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DiagnoseVpnGatewayRequest setIPsecExtendInfo(String IPsecExtendInfo) {
        this.IPsecExtendInfo = IPsecExtendInfo;
        return this;
    }
    public String getIPsecExtendInfo() {
        return this.IPsecExtendInfo;
    }

    public DiagnoseVpnGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DiagnoseVpnGatewayRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DiagnoseVpnGatewayRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DiagnoseVpnGatewayRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
