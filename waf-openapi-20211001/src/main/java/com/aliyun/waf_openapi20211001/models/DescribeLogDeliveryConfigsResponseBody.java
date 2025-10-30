// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeLogDeliveryConfigsResponseBody extends TeaModel {
    /**
     * <p>The information about the log delivery configuration.</p>
     */
    @NameInMap("DeliveryConfigs")
    public java.util.List<DescribeLogDeliveryConfigsResponseBodyDeliveryConfigs> deliveryConfigs;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <p>The content of the log delivery configuration. The value is a JSON string that contains multiple parameters.</p>
         * <blockquote>
         * <p> This parameter is the same as the <strong>DeliveryDetail</strong> parameter of the <strong>CreateLogDeliveryConfig</strong> operation. For more information, see <strong>Parameter description for log delivery configuration</strong> of the <a href="~~CreateLogDeliveryConfig~~">CreateLogDeliveryConfig</a> operation.</p>
         * </blockquote>
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
         * <li><strong>syslog</strong>: Logs are delivered to a syslog service.</li>
         * <li><strong>kafka</strong>: Logs are delivered to a Kafka service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kafka</p>
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
