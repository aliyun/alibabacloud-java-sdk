// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpnCertificateAssociationsRequest extends TeaModel {
    /**
     * <p>The list of certificate IDs.</p>
     * <p>You can query the associations between up to 20 SSL certificates and VPN gateway instances at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>6bfe4218-ea1d****</p>
     */
    @NameInMap("CertificateId")
    public java.util.List<String> certificateId;

    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li><p><strong>Encryption</strong>: encryption certificate.</p>
     * </li>
     * <li><p><strong>Signature</strong>: signing certificate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Signature</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Valid values:</p>
     * <ul>
     * <li><p>If this is the first query or no subsequent query exists, leave this parameter empty.</p>
     * </li>
     * <li><p>If a subsequent query exists, set this parameter to the <strong>NextToken</strong> value returned by the previous API call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be0****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of VPN gateway instance IDs.</p>
     * <p>You can query the associations between up to 20 VPN gateway instances and SSL certificates at a time.</p>
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
