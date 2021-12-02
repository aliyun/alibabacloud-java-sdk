// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateVpnGatewayWithCertificateRequest extends TeaModel {
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

    public static DissociateVpnGatewayWithCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateVpnGatewayWithCertificateRequest self = new DissociateVpnGatewayWithCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DissociateVpnGatewayWithCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public DissociateVpnGatewayWithCertificateRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public DissociateVpnGatewayWithCertificateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateVpnGatewayWithCertificateRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DissociateVpnGatewayWithCertificateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DissociateVpnGatewayWithCertificateRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
