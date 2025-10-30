// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceLogDeliveryStatusResponseBody extends TeaModel {
    @NameInMap("LogConfigs")
    public java.util.List<DescribeResourceLogDeliveryStatusResponseBodyLogConfigs> logConfigs;

    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceLogDeliveryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogDeliveryStatusResponseBody self = new DescribeResourceLogDeliveryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogDeliveryStatusResponseBody setLogConfigs(java.util.List<DescribeResourceLogDeliveryStatusResponseBodyLogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }
    public java.util.List<DescribeResourceLogDeliveryStatusResponseBodyLogConfigs> getLogConfigs() {
        return this.logConfigs;
    }

    public DescribeResourceLogDeliveryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeResourceLogDeliveryStatusResponseBodyLogConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>export-kafka</p>
         */
        @NameInMap("DeliveryName")
        public String deliveryName;

        /**
         * <strong>example:</strong>
         * <p>kafka</p>
         */
        @NameInMap("DeliveryType")
        public String deliveryType;

        /**
         * <strong>example:</strong>
         * <p>test.waf.com-waf</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static DescribeResourceLogDeliveryStatusResponseBodyLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceLogDeliveryStatusResponseBodyLogConfigs self = new DescribeResourceLogDeliveryStatusResponseBodyLogConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeResourceLogDeliveryStatusResponseBodyLogConfigs setDeliveryName(String deliveryName) {
            this.deliveryName = deliveryName;
            return this;
        }
        public String getDeliveryName() {
            return this.deliveryName;
        }

        public DescribeResourceLogDeliveryStatusResponseBodyLogConfigs setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public DescribeResourceLogDeliveryStatusResponseBodyLogConfigs setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeResourceLogDeliveryStatusResponseBodyLogConfigs setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
