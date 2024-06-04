// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventDomainStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeApisecEventDomainStatisticResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecEventDomainStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecEventDomainStatisticResponseBody self = new DescribeApisecEventDomainStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecEventDomainStatisticResponseBody setData(java.util.List<DescribeApisecEventDomainStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecEventDomainStatisticResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecEventDomainStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecEventDomainStatisticResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecEventDomainStatisticResponseBodyData extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("High")
        public Long high;

        @NameInMap("Low")
        public Long low;

        @NameInMap("Medium")
        public Long medium;

        public static DescribeApisecEventDomainStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecEventDomainStatisticResponseBodyData self = new DescribeApisecEventDomainStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecEventDomainStatisticResponseBodyData setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public DescribeApisecEventDomainStatisticResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeApisecEventDomainStatisticResponseBodyData setHigh(Long high) {
            this.high = high;
            return this;
        }
        public Long getHigh() {
            return this.high;
        }

        public DescribeApisecEventDomainStatisticResponseBodyData setLow(Long low) {
            this.low = low;
            return this;
        }
        public Long getLow() {
            return this.low;
        }

        public DescribeApisecEventDomainStatisticResponseBodyData setMedium(Long medium) {
            this.medium = medium;
            return this;
        }
        public Long getMedium() {
            return this.medium;
        }

    }

}
