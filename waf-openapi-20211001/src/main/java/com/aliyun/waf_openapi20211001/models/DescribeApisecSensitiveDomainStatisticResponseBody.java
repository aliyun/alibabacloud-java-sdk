// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSensitiveDomainStatisticResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecSensitiveDomainStatisticResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>56B40D30-4960-4F19-B7D5-2B1F***6CB70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecSensitiveDomainStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecSensitiveDomainStatisticResponseBody self = new DescribeApisecSensitiveDomainStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecSensitiveDomainStatisticResponseBody setData(java.util.List<DescribeApisecSensitiveDomainStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecSensitiveDomainStatisticResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecSensitiveDomainStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecSensitiveDomainStatisticResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecSensitiveDomainStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The number of APIs that are involved.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ApiCount")
        public Long apiCount;

        /**
         * <p>The number of sites that are involved.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DomainCount")
        public Long domainCount;

        /**
         * <p>The code of the sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SensitiveCode")
        public String sensitiveCode;

        /**
         * <p>The sensitivity level of the sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>L3</p>
         */
        @NameInMap("SensitiveLevel")
        public String sensitiveLevel;

        /**
         * <p>The name of the sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("SensitiveName")
        public String sensitiveName;

        public static DescribeApisecSensitiveDomainStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecSensitiveDomainStatisticResponseBodyData self = new DescribeApisecSensitiveDomainStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecSensitiveDomainStatisticResponseBodyData setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public DescribeApisecSensitiveDomainStatisticResponseBodyData setDomainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Long getDomainCount() {
            return this.domainCount;
        }

        public DescribeApisecSensitiveDomainStatisticResponseBodyData setSensitiveCode(String sensitiveCode) {
            this.sensitiveCode = sensitiveCode;
            return this;
        }
        public String getSensitiveCode() {
            return this.sensitiveCode;
        }

        public DescribeApisecSensitiveDomainStatisticResponseBodyData setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        public DescribeApisecSensitiveDomainStatisticResponseBodyData setSensitiveName(String sensitiveName) {
            this.sensitiveName = sensitiveName;
            return this;
        }
        public String getSensitiveName() {
            return this.sensitiveName;
        }

    }

}
