// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpnCertificateAssociationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If <strong>NextToken</strong> is not empty, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>197AF2BD-547F-470C-B29A-8400400233EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The association information.</p>
     */
    @NameInMap("VpnCertificateRelations")
    public java.util.List<ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations> vpnCertificateRelations;

    public static ListVpnCertificateAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpnCertificateAssociationsResponseBody self = new ListVpnCertificateAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpnCertificateAssociationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpnCertificateAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpnCertificateAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpnCertificateAssociationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVpnCertificateAssociationsResponseBody setVpnCertificateRelations(java.util.List<ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations> vpnCertificateRelations) {
        this.vpnCertificateRelations = vpnCertificateRelations;
        return this;
    }
    public java.util.List<ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations> getVpnCertificateRelations() {
        return this.vpnCertificateRelations;
    }

    public static class ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations extends TeaModel {
        /**
         * <p>The time when the Anycast EIP was associated.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-29T09:30:29Z</p>
         */
        @NameInMap("AssociationTime")
        public String associationTime;

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6bfe4218-ea1d****</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The type of the certificate.</p>
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
         * <p>The ID of the region where the VPN gateway is created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1usbiorilk51760****</p>
         */
        @NameInMap("VpnGatewayId")
        public String vpnGatewayId;

        public static ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations build(java.util.Map<String, ?> map) throws Exception {
            ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations self = new ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations();
            return TeaModel.build(map, self);
        }

        public ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations setAssociationTime(String associationTime) {
            this.associationTime = associationTime;
            return this;
        }
        public String getAssociationTime() {
            return this.associationTime;
        }

        public ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpnCertificateAssociationsResponseBodyVpnCertificateRelations setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

    }

}
