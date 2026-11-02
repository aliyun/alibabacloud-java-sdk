// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpnGatewayWithCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6bfe4218-ea1d****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The type of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>Encryption</strong>: specifies the SSL certificate as an encrypt certificate.</li>
     * <li><strong>Signature</strong>: specifies the SSL certificate as a signing certificate.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Signature</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: prechecks the request without performing the association operation. The system checks whether the required parameters are specified, the request format, and the instance status. If the request fails the precheck, an error is returned. If the request passes the precheck, the request ID is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. After the request passes the precheck, the VPN gateway is associated with the certificate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID of the VPN gateway.</p>
     * <blockquote>
     * <p>Only ShangMi (SM) VPN gateways support attaching certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static AssociateVpnGatewayWithCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpnGatewayWithCertificateRequest self = new AssociateVpnGatewayWithCertificateRequest();
        return TeaModel.build(map, self);
    }

    public AssociateVpnGatewayWithCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public AssociateVpnGatewayWithCertificateRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public AssociateVpnGatewayWithCertificateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateVpnGatewayWithCertificateRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateVpnGatewayWithCertificateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateVpnGatewayWithCertificateRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
