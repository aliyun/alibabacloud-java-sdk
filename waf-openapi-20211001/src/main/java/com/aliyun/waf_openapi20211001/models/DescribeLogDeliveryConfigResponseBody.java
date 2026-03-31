// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeLogDeliveryConfigResponseBody extends TeaModel {
    /**
     * <p>The information about the log delivery configuration.</p>
     */
    @NameInMap("DeliveryConfig")
    public DescribeLogDeliveryConfigResponseBodyDeliveryConfig deliveryConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogDeliveryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogDeliveryConfigResponseBody self = new DescribeLogDeliveryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogDeliveryConfigResponseBody setDeliveryConfig(DescribeLogDeliveryConfigResponseBodyDeliveryConfig deliveryConfig) {
        this.deliveryConfig = deliveryConfig;
        return this;
    }
    public DescribeLogDeliveryConfigResponseBodyDeliveryConfig getDeliveryConfig() {
        return this.deliveryConfig;
    }

    public DescribeLogDeliveryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLogDeliveryConfigResponseBodyDeliveryConfig extends TeaModel {
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
         * <p>syslog</p>
         */
        @NameInMap("DeliveryType")
        public String deliveryType;

        public static DescribeLogDeliveryConfigResponseBodyDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogDeliveryConfigResponseBodyDeliveryConfig self = new DescribeLogDeliveryConfigResponseBodyDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLogDeliveryConfigResponseBodyDeliveryConfig setDeliveryDetail(String deliveryDetail) {
            this.deliveryDetail = deliveryDetail;
            return this;
        }
        public String getDeliveryDetail() {
            return this.deliveryDetail;
        }

        public DescribeLogDeliveryConfigResponseBodyDeliveryConfig setDeliveryName(String deliveryName) {
            this.deliveryName = deliveryName;
            return this;
        }
        public String getDeliveryName() {
            return this.deliveryName;
        }

        public DescribeLogDeliveryConfigResponseBodyDeliveryConfig setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

    }

}
