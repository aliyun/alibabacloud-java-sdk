// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpnCertificateAssociationsRequest extends TeaModel {
    /**
     * <p>The list of certificate IDs.</p>
     * <br>
     * <p>You can query the association between at most 20 SSL certificates and VPN gateways.</p>
     */
    @NameInMap("CertificateId")
    public java.util.List<String> certificateId;

    /**
     * <p>The certificate type. Valid values:</p>
     * <br>
     * <p>*   **Encryption**</p>
     * <p>*   **Signature**</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **20**. Default value: **1**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of VPN gateway IDs.</p>
     * <br>
     * <p>You can query the association between at most 20 VPN gateways and SSL certificates.</p>
     */
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
