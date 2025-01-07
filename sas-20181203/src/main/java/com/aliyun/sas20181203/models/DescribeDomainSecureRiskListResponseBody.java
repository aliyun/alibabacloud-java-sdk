// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureRiskListResponseBody extends TeaModel {
    /**
     * <p>The number of the websites for which no certificates are installed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NoSslCount")
    public Integer noSslCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of risks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskCount")
    public Integer riskCount;

    /**
     * <p>The risks.</p>
     */
    @NameInMap("RiskList")
    public java.util.List<DescribeDomainSecureRiskListResponseBodyRiskList> riskList;

    public static DescribeDomainSecureRiskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureRiskListResponseBody self = new DescribeDomainSecureRiskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureRiskListResponseBody setNoSslCount(Integer noSslCount) {
        this.noSslCount = noSslCount;
        return this;
    }
    public Integer getNoSslCount() {
        return this.noSslCount;
    }

    public DescribeDomainSecureRiskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSecureRiskListResponseBody setRiskCount(Integer riskCount) {
        this.riskCount = riskCount;
        return this;
    }
    public Integer getRiskCount() {
        return this.riskCount;
    }

    public DescribeDomainSecureRiskListResponseBody setRiskList(java.util.List<DescribeDomainSecureRiskListResponseBodyRiskList> riskList) {
        this.riskList = riskList;
        return this;
    }
    public java.util.List<DescribeDomainSecureRiskListResponseBodyRiskList> getRiskList() {
        return this.riskList;
    }

    public static class DescribeDomainSecureRiskListResponseBodyRiskList extends TeaModel {
        /**
         * <p>The number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmCount")
        public Integer alarmCount;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The issuer of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>globalsign</p>
         */
        @NameInMap("SslBrand")
        public String sslBrand;

        /**
         * <p>Indicates whether the certificate is configured. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SslStatus")
        public Integer sslStatus;

        /**
         * <p>The UUIDs of the backend servers of the website.</p>
         */
        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        /**
         * <p>The number of vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        public static DescribeDomainSecureRiskListResponseBodyRiskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSecureRiskListResponseBodyRiskList self = new DescribeDomainSecureRiskListResponseBodyRiskList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSecureRiskListResponseBodyRiskList setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeDomainSecureRiskListResponseBodyRiskList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainSecureRiskListResponseBodyRiskList setSslBrand(String sslBrand) {
            this.sslBrand = sslBrand;
            return this;
        }
        public String getSslBrand() {
            return this.sslBrand;
        }

        public DescribeDomainSecureRiskListResponseBodyRiskList setSslStatus(Integer sslStatus) {
            this.sslStatus = sslStatus;
            return this;
        }
        public Integer getSslStatus() {
            return this.sslStatus;
        }

        public DescribeDomainSecureRiskListResponseBodyRiskList setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        public DescribeDomainSecureRiskListResponseBodyRiskList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

    }

}
