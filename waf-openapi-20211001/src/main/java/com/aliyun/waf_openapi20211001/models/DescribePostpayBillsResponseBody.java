// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePostpayBillsResponseBody extends TeaModel {
    @NameInMap("BillDetail")
    public java.util.List<DescribePostpayBillsResponseBodyBillDetail> billDetail;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0FBBDE11-C35F-531B-96BA-64CA****C875</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePostpayBillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayBillsResponseBody self = new DescribePostpayBillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostpayBillsResponseBody setBillDetail(java.util.List<DescribePostpayBillsResponseBodyBillDetail> billDetail) {
        this.billDetail = billDetail;
        return this;
    }
    public java.util.List<DescribePostpayBillsResponseBodyBillDetail> getBillDetail() {
        return this.billDetail;
    }

    public DescribePostpayBillsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePostpayBillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePostpayBillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePostpayBillsResponseBodyBillDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;aiWhiteListTemplateCount\&quot;:4,\&quot;apisecResourceCount\&quot;:2,\&quot;botAppTemplateCount\&quot;:1,\&quot;botWebTemplateCount\&quot;:4,\&quot;ccRuleCount\&quot;:1,\&quot;customAclAdvanceRuleCount\&quot;:4,\&quot;customResponseRuleCount\&quot;:5,\&quot;dlpRuleCount\&quot;:1,\&quot;gslb\&quot;:1,\&quot;instanceFee\&quot;:1,\&quot;ipv6\&quot;:1,\&quot;nonPort\&quot;:1,\&quot;qps\&quot;:0,\&quot;regionBlockRuleCount\&quot;:1,\&quot;threatIntelligenceTemplateCount\&quot;:1,\&quot;wafBaseTemplateCount\&quot;:4}</p>
         */
        @NameInMap("ChargeData")
        public String chargeData;

        /**
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <strong>example:</strong>
         * <p>1779123599</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FunctionCu")
        public String functionCu;

        /**
         * <strong>example:</strong>
         * <p>1779120000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("TrafficCu")
        public String trafficCu;

        public static DescribePostpayBillsResponseBodyBillDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePostpayBillsResponseBodyBillDetail self = new DescribePostpayBillsResponseBodyBillDetail();
            return TeaModel.build(map, self);
        }

        public DescribePostpayBillsResponseBodyBillDetail setChargeData(String chargeData) {
            this.chargeData = chargeData;
            return this;
        }
        public String getChargeData() {
            return this.chargeData;
        }

        public DescribePostpayBillsResponseBodyBillDetail setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public DescribePostpayBillsResponseBodyBillDetail setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribePostpayBillsResponseBodyBillDetail setFunctionCu(String functionCu) {
            this.functionCu = functionCu;
            return this;
        }
        public String getFunctionCu() {
            return this.functionCu;
        }

        public DescribePostpayBillsResponseBodyBillDetail setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribePostpayBillsResponseBodyBillDetail setTrafficCu(String trafficCu) {
            this.trafficCu = trafficCu;
            return this;
        }
        public String getTrafficCu() {
            return this.trafficCu;
        }

    }

}
