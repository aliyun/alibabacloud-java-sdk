// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpnCertificateAssociationsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("CertificateType")
    public String certificateType;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("VpnGatewayId")
    public java.util.List<String> vpnGatewayId;

    @NameInMap("CertificateId")
    public java.util.List<String> certificateId;

    @NameInMap("callerBid")
    public String callerBid;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListVpnCertificateAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpnCertificateAssociationsRequest self = new ListVpnCertificateAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpnCertificateAssociationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpnCertificateAssociationsRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public ListVpnCertificateAssociationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpnCertificateAssociationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpnCertificateAssociationsRequest setVpnGatewayId(java.util.List<String> vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public java.util.List<String> getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public ListVpnCertificateAssociationsRequest setCertificateId(java.util.List<String> certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public java.util.List<String> getCertificateId() {
        return this.certificateId;
    }

    public ListVpnCertificateAssociationsRequest setCallerBid(String callerBid) {
        this.callerBid = callerBid;
        return this;
    }
    public String getCallerBid() {
        return this.callerBid;
    }

    public ListVpnCertificateAssociationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
