// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpnGatewayWithCertificateRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("CertificateType")
    public String certificateType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

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
