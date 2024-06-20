// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecAbnormalDomainStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeApisecAbnormalDomainStatisticResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-3014***B11AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecAbnormalDomainStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecAbnormalDomainStatisticResponseBody self = new DescribeApisecAbnormalDomainStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecAbnormalDomainStatisticResponseBody setData(java.util.List<DescribeApisecAbnormalDomainStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecAbnormalDomainStatisticResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecAbnormalDomainStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecAbnormalDomainStatisticResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecAbnormalDomainStatisticResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ApiCount")
        public Long apiCount;

        /**
         * <strong>example:</strong>
         * <p>ba.aliyun.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("High")
        public Long high;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Low")
        public Long low;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Medium")
        public Long medium;

        public static DescribeApisecAbnormalDomainStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecAbnormalDomainStatisticResponseBodyData self = new DescribeApisecAbnormalDomainStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecAbnormalDomainStatisticResponseBodyData setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public DescribeApisecAbnormalDomainStatisticResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeApisecAbnormalDomainStatisticResponseBodyData setHigh(Long high) {
            this.high = high;
            return this;
        }
        public Long getHigh() {
            return this.high;
        }

        public DescribeApisecAbnormalDomainStatisticResponseBodyData setLow(Long low) {
            this.low = low;
            return this;
        }
        public Long getLow() {
            return this.low;
        }

        public DescribeApisecAbnormalDomainStatisticResponseBodyData setMedium(Long medium) {
            this.medium = medium;
            return this;
        }
        public Long getMedium() {
            return this.medium;
        }

    }

}
