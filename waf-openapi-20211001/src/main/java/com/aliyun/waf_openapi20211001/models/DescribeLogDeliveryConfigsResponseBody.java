// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeLogDeliveryConfigsResponseBody extends TeaModel {
    /**
     * <p>The log delivery configurations.</p>
     */
    @NameInMap("DeliveryConfigs")
    public java.util.List<DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs> deliveryConfigs;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <blockquote>
     * <p>If this parameter is not empty, more results are available. Use the value of <strong>NextToken</strong> in the next request to retrieve the next page of results. If the value is empty, all results have been returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of log delivery configurations returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLogDeliveryConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogDeliveryConfigsResponseBody self = new DescribeLogDeliveryConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogDeliveryConfigsResponseBody setDeliveryConfigs(java.util.List<DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs> deliveryConfigs) {
        this.deliveryConfigs = deliveryConfigs;
        return this;
    }
    public java.util.List<DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs> getDeliveryConfigs() {
        return this.deliveryConfigs;
    }

    public DescribeLogDeliveryConfigsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLogDeliveryConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLogDeliveryConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogDeliveryConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs extends TeaModel {
        /**
         * <p>The details of the log delivery configuration, returned as a JSON string.</p>
         * <blockquote>
         * <p>The structure of this parameter is the same as the <strong>DeliveryDetail</strong> request parameter of the <a href="~~CreateLogDeliveryConfig~~">CreateLogDeliveryConfig</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;rfcVersion&quot;: &quot;rfc3164&quot;,
         *   &quot;protocol&quot;: &quot;tcp&quot;,
         *   &quot;servers&quot;: [
         *     {
         *       &quot;address&quot;: &quot;1.1.1.1&quot;,
         *       &quot;port&quot;: 20
         *     }
         *   ]
         * }</p>
         */
        @NameInMap("DeliveryDetail")
        public String deliveryDetail;

        /**
         * <p>The name of the log delivery configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("DeliveryName")
        public String deliveryName;

        /**
         * <p>The type of the log delivery configuration. Valid values:</p>
         * <ul>
         * <li><p><strong>syslog</strong>: Log delivery to a syslog server.</p>
         * </li>
         * <li><p><strong>kafka</strong>: Log delivery to a Kafka cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>syslog</p>
         */
        @NameInMap("DeliveryType")
        public String deliveryType;

        public static DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs self = new DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs setDeliveryDetail(String deliveryDetail) {
            this.deliveryDetail = deliveryDetail;
            return this;
        }
        public String getDeliveryDetail() {
            return this.deliveryDetail;
        }

        public DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs setDeliveryName(String deliveryName) {
            this.deliveryName = deliveryName;
            return this;
        }
        public String getDeliveryName() {
            return this.deliveryName;
        }

        public DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

    }

}
