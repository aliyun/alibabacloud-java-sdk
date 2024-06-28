// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpnCertificateAssociationsRequest extends TeaModel {
    /**
     * <p>The list of certificate IDs.</p>
     * <p>You can query the association between at most 20 SSL certificates and VPN gateways.</p>
     * 
     * <strong>example:</strong>
     * <p>6bfe4218-ea1d****</p>
     */
    @NameInMap("CertificateId")
    public java.util.List<String> certificateId;

    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li><strong>Encryption</strong></li>
     * <li><strong>Signature</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Signature</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be0****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of VPN gateway IDs.</p>
     * <p>You can query the association between at most 20 VPN gateways and SSL certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1q8bgx4xnkm****</p>
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
