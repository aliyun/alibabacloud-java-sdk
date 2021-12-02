// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpnCertificateAssociationsRequest extends TeaModel {
    @NameInMap("CertificateId")
    public java.util.List<String> certificateId;

    @NameInMap("CertificateType")
    public String certificateType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpnGatewayId")
    public java.util.List<String> vpnGatewayId;

    public static ListVpnCertificateAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpnCertificateAssociationsRequest self = new ListVpnCertificateAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpnCertificateAssociationsRequest setCertificateId(java.util.List<String> certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public java.util.List<String> getCertificateId() {
        return this.certificateId;
    }

    public ListVpnCertificateAssociationsRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public ListVpnCertificateAssociationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpnCertificateAssociationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpnCertificateAssociationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpnCertificateAssociationsRequest setVpnGatewayId(java.util.List<String> vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public java.util.List<String> getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
