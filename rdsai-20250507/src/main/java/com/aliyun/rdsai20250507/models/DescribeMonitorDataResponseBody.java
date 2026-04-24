// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMonitorDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMonitorDataResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorDataResponseBody self = new DescribeMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorDataResponseBody setData(java.util.List<DescribeMonitorDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMonitorDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMonitorDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMonitorDataResponseBodyDataValue extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1774972800</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Value")
        public Double value;

        public static DescribeMonitorDataResponseBodyDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorDataResponseBodyDataValue self = new DescribeMonitorDataResponseBodyDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorDataResponseBodyDataValue setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeMonitorDataResponseBodyDataValue setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class DescribeMonitorDataResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qps</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public java.util.List<DescribeMonitorDataResponseBodyDataValue> value;

        public static DescribeMonitorDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorDataResponseBodyData self = new DescribeMonitorDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorDataResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMonitorDataResponseBodyData setValue(java.util.List<DescribeMonitorDataResponseBodyDataValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<DescribeMonitorDataResponseBodyDataValue> getValue() {
            return this.value;
        }

    }

}
