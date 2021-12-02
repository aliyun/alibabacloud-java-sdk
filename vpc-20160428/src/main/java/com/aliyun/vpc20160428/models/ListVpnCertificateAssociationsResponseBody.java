// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpnCertificateAssociationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("AssociationTime")
        public String associationTime;

        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("CertificateType")
        public String certificateType;

        @NameInMap("RegionId")
        public String regionId;

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
