// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetYikeAccountCreditResponseBody extends TeaModel {
    @NameInMap("CreditInfo")
    public GetYikeAccountCreditResponseBodyCreditInfo creditInfo;

    @NameInMap("MembershipInfo")
    public GetYikeAccountCreditResponseBodyMembershipInfo membershipInfo;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetYikeAccountCreditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAccountCreditResponseBody self = new GetYikeAccountCreditResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeAccountCreditResponseBody setCreditInfo(GetYikeAccountCreditResponseBodyCreditInfo creditInfo) {
        this.creditInfo = creditInfo;
        return this;
    }
    public GetYikeAccountCreditResponseBodyCreditInfo getCreditInfo() {
        return this.creditInfo;
    }

    public GetYikeAccountCreditResponseBody setMembershipInfo(GetYikeAccountCreditResponseBodyMembershipInfo membershipInfo) {
        this.membershipInfo = membershipInfo;
        return this;
    }
    public GetYikeAccountCreditResponseBodyMembershipInfo getMembershipInfo() {
        return this.membershipInfo;
    }

    public GetYikeAccountCreditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetYikeAccountCreditResponseBodyCreditInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("GrantedCreditQuota")
        public Double grantedCreditQuota;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GrantedCreditQuotaUsage")
        public Double grantedCreditQuotaUsage;

        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("PackCreditQuota")
        public Double packCreditQuota;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("PackCreditQuotaUsage")
        public Double packCreditQuotaUsage;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ResourceCreditQuota")
        public Double resourceCreditQuota;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ResourceCreditQuotaUsage")
        public Double resourceCreditQuotaUsage;

        public static GetYikeAccountCreditResponseBodyCreditInfo build(java.util.Map<String, ?> map) throws Exception {
            GetYikeAccountCreditResponseBodyCreditInfo self = new GetYikeAccountCreditResponseBodyCreditInfo();
            return TeaModel.build(map, self);
        }

        public GetYikeAccountCreditResponseBodyCreditInfo setGrantedCreditQuota(Double grantedCreditQuota) {
            this.grantedCreditQuota = grantedCreditQuota;
            return this;
        }
        public Double getGrantedCreditQuota() {
            return this.grantedCreditQuota;
        }

        public GetYikeAccountCreditResponseBodyCreditInfo setGrantedCreditQuotaUsage(Double grantedCreditQuotaUsage) {
            this.grantedCreditQuotaUsage = grantedCreditQuotaUsage;
            return this;
        }
        public Double getGrantedCreditQuotaUsage() {
            return this.grantedCreditQuotaUsage;
        }

        public GetYikeAccountCreditResponseBodyCreditInfo setPackCreditQuota(Double packCreditQuota) {
            this.packCreditQuota = packCreditQuota;
            return this;
        }
        public Double getPackCreditQuota() {
            return this.packCreditQuota;
        }

        public GetYikeAccountCreditResponseBodyCreditInfo setPackCreditQuotaUsage(Double packCreditQuotaUsage) {
            this.packCreditQuotaUsage = packCreditQuotaUsage;
            return this;
        }
        public Double getPackCreditQuotaUsage() {
            return this.packCreditQuotaUsage;
        }

        public GetYikeAccountCreditResponseBodyCreditInfo setResourceCreditQuota(Double resourceCreditQuota) {
            this.resourceCreditQuota = resourceCreditQuota;
            return this;
        }
        public Double getResourceCreditQuota() {
            return this.resourceCreditQuota;
        }

        public GetYikeAccountCreditResponseBodyCreditInfo setResourceCreditQuotaUsage(Double resourceCreditQuotaUsage) {
            this.resourceCreditQuotaUsage = resourceCreditQuotaUsage;
            return this;
        }
        public Double getResourceCreditQuotaUsage() {
            return this.resourceCreditQuotaUsage;
        }

    }

    public static class GetYikeAccountCreditResponseBodyMembershipInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1784179281</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("Membership")
        public String membership;

        /**
         * <strong>example:</strong>
         * <p>1784784081</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetYikeAccountCreditResponseBodyMembershipInfo build(java.util.Map<String, ?> map) throws Exception {
            GetYikeAccountCreditResponseBodyMembershipInfo self = new GetYikeAccountCreditResponseBodyMembershipInfo();
            return TeaModel.build(map, self);
        }

        public GetYikeAccountCreditResponseBodyMembershipInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetYikeAccountCreditResponseBodyMembershipInfo setMembership(String membership) {
            this.membership = membership;
            return this;
        }
        public String getMembership() {
            return this.membership;
        }

        public GetYikeAccountCreditResponseBodyMembershipInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
